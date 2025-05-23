import java.util.Date;

public class Problema_5_EventoBase {
    private String nombre;
    private Date fecha;
    private String ubicacion;
    private String descripcion;
    private String tipo;
    private boolean usoNuclear;
    private int bajas;
    
    public Problema_5_EventoBase(String nombre, Date fecha, String ubicacion, String descripcion, String tipo,
            boolean usoNuclear, int bajas) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.ubicacion = ubicacion;
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.usoNuclear = usoNuclear;
        this.bajas = bajas;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public String getTipo() {
        return tipo;
    }

    public boolean getUsoNuclear() {
        return usoNuclear;
    }

    public int getBajas() {
        return bajas;
    }

    @Override
    public String toString() {
        return
        "Evento: " + nombre + " (" + tipo + ") en " + ubicacion +
        ", el " + fecha + ".\nDescripción: " + descripcion + (usoNuclear ? " [ARMA NUCLEAR]" : "") +
        ", Bajas: " + bajas;
    }
}
