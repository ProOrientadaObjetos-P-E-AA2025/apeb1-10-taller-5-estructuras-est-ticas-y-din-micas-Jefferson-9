public class Problema_3_DepartamentoBase {
    private String nombre;
    private int empleados;
    private double produAnual;
    private String categoria;
    
    public Problema_3_DepartamentoBase(String nombre, int empleados, double produAnual) {
        this.nombre = nombre;
        this.empleados = empleados;
        this.produAnual = produAnual;
        this.categoria = deterCategoria();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEmpleados() {
        return empleados;
    }

    public void setEmpleados(int empleados) {
        this.empleados = empleados;
    }

    public double getProduAnual() {
        return produAnual;
    }

    public void setProduAnual(double produAnual) {
        this.produAnual = produAnual;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String deterCategoria() {
        if (empleados > 20 && produAnual > 1000000) {
            return "A";
        } else if (empleados <= 20 && produAnual <= 1000000) {
            if (empleados <= 20 && produAnual <= 500000) {
                return "C";
            } else {
                return "B";
            }
        } else {
            return "Sin categoría";
        }
    }

    @Override
    public String toString() {
        return
        "Departamento: " + nombre + "\n" +
        "Empleado: " + empleados + "\n" +
        "Producción anual: $" + String.format("%,.2f", produAnual) + "\n" +
        "Categoría: " + categoria + "\n";
    }
}
