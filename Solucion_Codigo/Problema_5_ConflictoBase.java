import java.util.ArrayList;

public class Problema_5_ConflictoBase {
    private String nombre;
    private String estado;
    private ArrayList<Problema_5_PaisBase> paises;
    private ArrayList<Problema_5_EventoBase> eventos;
    
    public Problema_5_ConflictoBase(String nombre, String estado) {
        this.nombre = nombre;
        this.estado = estado;
        this.paises = new ArrayList<>();
        this.eventos = new ArrayList<>();
    }
    
    public void aggPais(Problema_5_PaisBase pais) {
        paises.add(pais);
    }

    public void aggEvento(Problema_5_EventoBase evento) {
        eventos.add(evento);
        evaluarEstado();
    }

    public ArrayList<Problema_5_EventoBase> getEventos() {
        return eventos;
    }

    public void evaluarEstado() {
        int totalPaises = 195;
        int batallas = 0;
        int batallasenDesarrolloNucleares = 0;
        int paisesconAltasBajas = 0;

        for (Problema_5_PaisBase pais : paises) {
            int bajasTotales = 0;
            for (Problema_5_EventoBase evento : eventos ) {
                if (evento.getTipo().equalsIgnoreCase("batalla") && 
                evento.getUbicacion().equalsIgnoreCase(pais.getNombre())) {
                    batallas++;
                    bajasTotales += evento.getBajas();
                    if (pais.getDesarrollado() && evento.getUsoNuclear()) {
                        batallasenDesarrolloNucleares++;
                    }
                }
            }
            if (bajasTotales >= pais.getPoblacion() / 2) {
                paisesconAltasBajas++;
            }
        }
        double porcentajeBatallas = (batallas * 100.0) / totalPaises;

        if (porcentajeBatallas >= 50 || batallasenDesarrolloNucleares > 0) {
            estado = "Guerra Mundial";
        } else if (porcentajeBatallas >= 30 || paisesconAltasBajas > 0) {
            estado = "Reunión ONU urgente";
        }
    }

    public void actaEvento(int indice, Problema_5_EventoBase nuevoEvento) {
        if (indice >= 0 && indice < eventos.size()) {
            eventos.set(indice, nuevoEvento);
            evaluarEstado();
        } else {
            System.out.println("Índice de evento no válido.");
        }
    }

    @Override
    public String toString() {
        String result = "Conflicto: " + nombre + "\nEstado: " + estado + "\n\nPaises involucrados: \n";
        for (Problema_5_PaisBase p : paises) {
            result += "-- " + p + "\n";
        }
        result += "\nEventos:\n";
        for (Problema_5_EventoBase e : eventos) {
            result += "-- " + e + "\n";
        }
        return result;
    }
}
