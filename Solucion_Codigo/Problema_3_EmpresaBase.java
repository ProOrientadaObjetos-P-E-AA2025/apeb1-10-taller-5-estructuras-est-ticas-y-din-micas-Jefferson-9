import java.util.ArrayList;

public class Problema_3_EmpresaBase {
    private String nombre;
    private String ruc;
    private String direccion;
    private ArrayList<Problema_3_DepartamentoBase> departamentos;
    
    public Problema_3_EmpresaBase(String nombre, String ruc, String direccion) {
        this.nombre = nombre;
        this.ruc = ruc;
        this.direccion = direccion;
        this.departamentos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<Problema_3_DepartamentoBase> getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(ArrayList<Problema_3_DepartamentoBase> departamentos) {
        this.departamentos = departamentos;
    }

    public void aggDepartamento(Problema_3_DepartamentoBase departamento) {
        departamentos.add(departamento);
    }
    
    public void mostDepartamentos() {
        System.out.println("=== Empresa: " + nombre + " ===");
        System.out.println("RUC: " + ruc);
        System.out.println("Dirección: " + direccion);
        System.out.println("--- Departamentos ---\n");
        for(Problema_3_DepartamentoBase d : departamentos) {
            System.out.println(d);
        }
    }
}