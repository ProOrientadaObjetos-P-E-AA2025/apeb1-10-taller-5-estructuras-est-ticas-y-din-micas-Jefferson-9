// Según el ejercicio propueso, la recuperación (40% sobre 3.5) no permite aprobar a ningún 
// estudiante con nota < 7 por que se necesitaria una nota  de recuperación > 3.5
// Yo le hice según el enunciado propuesto, siguiendo el ejercicio. 

import java.util.Scanner;

public class Problema_2_Ejecutor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre, nombreMateria;
        int edad;
        double adc, ape, aa;

        System.out.println("=== Calificaciones de Estudiantes ===\n");
        System.out.print("Ingrese el nombre del estudiante: ");
        nombre = sc.nextLine();

        System.out.print("Ingrese la edad: ");
        edad = sc.nextInt();
        sc.nextLine();

        System.out.print("Ingrese el nombre de la materia: ");
        nombreMateria = sc.nextLine();

        System.out.print("Ingrese la nota ADC (Sobre 3.5): ");
        adc = sc.nextDouble();

        System.out.print("Ingrese la nota APE (Sobre 3.5): ");
        ape = sc.nextDouble();

        System.out.print("Ingrese la nota AA (Sobre 3.0): ");
        aa = sc.nextDouble();

        Problema_2_MateriaBase materia = new Problema_2_MateriaBase(nombreMateria, adc, ape, aa);
        Problema_2_EstudianteBase estudiante = new Problema_2_EstudianteBase(nombre, edad);

        estudiante.aggMateria(materia);

        System.out.println("\n=== RESULTADO ===");
        System.out.println(estudiante.toString());

        sc.close();
    }
}
