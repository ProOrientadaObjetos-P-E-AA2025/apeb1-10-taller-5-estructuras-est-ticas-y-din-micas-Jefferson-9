import java.util.Scanner;
import java.util.Date;

public class Problema_5_ConflictoEjecutor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Problema_5_ConflictoBase conflicto = new Problema_5_ConflictoBase("Conflicto Global", "Inicio");
        int n, e;

        System.out.println("=== SISTEMA DE GESTIÓN DE CONFLICTOS ===");
        System.out.print("¿Cuántos países desea ingresar?: ");
        n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("\nPaís "  + (i + 1) + ":");
            System.out.print("Nombre del país: ");
            String nombre = sc.nextLine();

            System.out.print("¿Es desarrolado?(true/false): ");
            boolean desarrolado = sc.nextBoolean();

            System.out.print("Población del país: ");
            int poblacion = sc.nextInt();
            sc.nextLine();

            conflicto.aggPais(new Problema_5_PaisBase(nombre, desarrolado, poblacion));
        }

        System.out.print("\n¿Cuántos eventos desea ingresar: ");
        e = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < e; i++) {
            System.out.println("\nEvento " + (i + 1) + ":");
            conflicto.aggEvento(crearEvento(sc));
        }

        System.out.println("\n¿Desea actualizar algún evento? (sí/no): ");
        String respuesta = sc.nextLine().toLowerCase();

        if (respuesta.equals("sí") || respuesta.equals("si")) {
            System.out.println("\nLista de eventos:");
            for (int i = 0; i < conflicto.getEventos().size(); i++) {
                System.out.println(i + ": " + conflicto.getEventos().get(i));
            }

            System.out.print("Ingrese el índice del evento que desea actualizar: ");
            int indice = sc.nextInt();
            sc.nextLine();

            System.out.println("\nIngrese los nuevos datos del evento:");
            Problema_5_EventoBase nuevoEvento = crearEvento(sc);
            conflicto.actaEvento(indice, nuevoEvento);
        }


        System.out.println("\n=== RESULTADO FINAL DEL CONFLICTO ===");
        System.out.println(conflicto);

        sc.close();
    }

    public static Problema_5_EventoBase crearEvento(Scanner sc) {
        System.out.print("Nombre del evento: ");
        String nombre = sc.nextLine();

        Date fecha = new Date();

        System.out.print("Ubicación del evento (nombre del país): ");
        String ubicacion = sc.nextLine();

        System.out.print("Descripción del evento: ");
        String descripcion = sc.nextLine();

        System.out.print("Tipo de evento (batalla, ataque, etc): ");
        String tipo = sc.nextLine();

        System.out.print("Hubo uso nuclear (true/false): ");
        boolean usoNuclear = sc.nextBoolean();

        System.out.print("Número de bajas: ");
        int bajas = sc.nextInt();
        sc.nextLine();

        return new Problema_5_EventoBase(nombre, fecha, ubicacion, descripcion, tipo, usoNuclear, bajas);
    }
}