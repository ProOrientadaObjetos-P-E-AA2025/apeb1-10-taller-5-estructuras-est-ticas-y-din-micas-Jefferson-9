import java.util.Date;
import java.util.ArrayList;

public class Problema_4_CasoCorrupcionBase {
    private String nombre;
    private Date fechaInicio;
    private String estado;
    private String detalles;
    private ArrayList<Problema_4_PersonaImplicadaBase> personas;
    
    public Problema_4_CasoCorrupcionBase(String nombre, Date fechaInicio, String estado, String detalles) {
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.estado = estado;
        this.detalles = detalles;
        this.personas = new ArrayList<>();
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }

    public ArrayList<Problema_4_PersonaImplicadaBase> getPersonas() {
        return personas;
    }

    public void setPersonas(ArrayList<Problema_4_PersonaImplicadaBase> personas) {
        this.personas = personas;
    }

    public void aggPersona(Problema_4_PersonaImplicadaBase persona) {
        personas.add(persona);
    }

    public void actEstado(Date fechaActual) {
        long dias = (fechaActual.getTime() - fechaInicio.getTime()) / (1000 * 60 * 60 * 24);
        if (dias > 14) {
            estado = "Urgente";
        } else if (dias > 7) {
            estado = "Alerta";
        }
    }

    @Override
    public String toString() {
        String resul;
        resul = "Caso: " + nombre + "\n" +
        "Fecha de inicio: " + fechaInicio + "\n" +
        "Estado: " + estado + "\n" +
        "Detalles: " + detalles + "\n" +
        "<<Personas implicadas>>\n";
        
        for (Problema_4_PersonaImplicadaBase p : personas) {
            resul += p.toString() + "\n";
        }
        return resul;
    }
}
