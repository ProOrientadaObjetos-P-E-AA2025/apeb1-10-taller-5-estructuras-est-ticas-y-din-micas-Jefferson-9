import java.util.Scanner;

public class Problema_1_VentasEjecutor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre;
        int cantidad;
        double pago;
        Problema_1_CarritodeComprasBase compras = new Problema_1_CarritodeComprasBase();

        // Agregamos un inventario
        compras.agregarProductoaTienda("Laptop", 900.0, 25);
        compras.agregarProductoaTienda("Luces RGB", 50.00, 40);
        compras.agregarProductoaTienda("Teclado Mecánico", 200.00, 15);
        compras.agregarProductoaTienda("Ventiladores", 20.00, 19);

        // Descuento si pasa de $1000
        compras.setDescuento(10);

        compras.mostrarInventario();

        System.out.print("\n¿Qué producto desea comprar (nombre)?: ");
        nombre = sc.nextLine();

        System.out.print("\nIngrese la cantidad que desea comprar: ");
        cantidad = sc.nextInt();

        compras.agregarProducto(nombre, cantidad);
        compras.mostrarCompra();

        System.out.print("\nIngrese el monto para pagar: ");
        pago = sc.nextDouble();

        compras.realizarPago(pago);

        System.out.println("\nInventario después de la compra:\n");
        compras.mostrarInventario();

        sc.close();
    }
}