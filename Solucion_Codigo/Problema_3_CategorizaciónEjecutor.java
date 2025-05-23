import java.util.Scanner;

public class Problema_3_CategorizaciónEjecutor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre, ruc, direccion;

        System.out.println("=== CATEGORIZADOR DE DEPARTAMENTOS ===");
        System.out.print("Ingrese el nombre de la empresa: ");
        nombre = sc.nextLine();

        System.out.print("Ingrese el RUC: ");
        ruc = sc.nextLine();

        System.out.print("Ingrese la dirección: ");
        direccion = sc.nextLine();

        Problema_3_EmpresaBase empresa = new Problema_3_EmpresaBase(nombre, ruc, direccion);

        for (int i = 0; i < 3; i++) {
            System.out.println("\n=== Departamento " + (i + 1) + " ===");

            System.out.print("Nombre del departamento: ");
            String nombreDep = sc.nextLine();

            System.out.print("Número de empleados: ");
            int numEmpleados = sc.nextInt();

            System.out.print("Producción anual: ");
            double produccion = sc.nextDouble();
            sc.nextLine();

            Problema_3_DepartamentoBase departamento = new Problema_3_DepartamentoBase(nombreDep, numEmpleados, produccion);
            empresa.aggDepartamento(departamento);
        }

        System.out.println("\n=== RESULTADOS ===");
        empresa.mostDepartamentos();

        sc.close();
    }
}
