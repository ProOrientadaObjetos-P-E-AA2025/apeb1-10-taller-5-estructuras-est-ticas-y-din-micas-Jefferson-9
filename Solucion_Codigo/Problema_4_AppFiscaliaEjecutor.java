import java.util.Scanner;
import java.util.Date;

public class Problema_4_AppFiscaliaEjecutor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombreCaso, detalles, estadoInicial;
        int cantidad;

        System.out.println("=== APP DE LA FISCALIA ===");
        System.out.print("Nombre del caso: ");
        nombreCaso = sc.nextLine();

        System.out.print("Detalles del caso: ");
        detalles = sc.nextLine();

        Date fechaInicio = new Date(); // Voy a usar la fecha actual

        estadoInicial = "Investigación";

        Problema_4_CasoCorrupcionBase caso = new Problema_4_CasoCorrupcionBase(nombreCaso, fechaInicio, 
        estadoInicial, detalles);

        System.out.print("¿Cuántas personas desea ingresar?: ");
        cantidad = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < cantidad; i++) {
            System.out.println("\n=== PERSONA " + (i + 1) + " ===");
            System.out.print("Nombre: ");
            String nombre = sc.nextLine();

            System.out.print("Edad: ");
            int edad = sc.nextInt();
            sc.nextLine();

            System.out.print("Ocupación: ");
            String ocupacion = sc.nextLine();

            System.out.print("Nivel de implicación (acusado/testigo): ");
            String implicacion = sc.nextLine();

            System.out.print("Sentencia (años): ");
            double Sentencia = sc.nextDouble();

            System.out.print("Daño económico ($): ");
            double dano = sc.nextDouble();
            sc.nextLine();

            Problema_4_PersonaImplicadaBase persona = new Problema_4_PersonaImplicadaBase(nombre, edad, ocupacion,
             implicacion, Sentencia, dano);

             if (implicacion.equalsIgnoreCase("acusado")) {
                System.out.println("¿Desea colaborar con la verdad?(s/n): ");
                String colaborar = sc.nextLine();
                if (colaborar.equalsIgnoreCase("s")) {
                    persona.colaborar();
                    persona.reduPena();
                }
            }
             caso.aggPersona(persona);

        }
        
        Date hoy = new Date();
        caso.actEstado(hoy);

        System.out.println("\n\n=== INFORMACIÓN DEL CASO ===");
        System.out.println(caso);

        sc.close();
    }
}
