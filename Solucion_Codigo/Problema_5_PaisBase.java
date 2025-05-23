public class Problema_5_PaisBase {
    private String nombre;
    private boolean desarrollado;
    private int poblacion;
    
    public Problema_5_PaisBase(String nombre, boolean desarrollado, int poblacion) {
        this.nombre = nombre;
        this.desarrollado = desarrollado;
        this.poblacion = poblacion;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean getDesarrollado() {
        return desarrollado;
    }

    public int getPoblacion() {
        return poblacion;
    }

    @Override
    public String toString() {
        return
        nombre + ", Población: " + poblacion;
    }
    
}
