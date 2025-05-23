import java.util.ArrayList;

public class Problema_1_CarritodeComprasBase {
    private ArrayList<Problema_1_ProductoBase> inventario;
    private ArrayList<Problema_1_ProductoBase> carrito;
    private double descuento;

    public Problema_1_CarritodeComprasBase() {
        inventario = new ArrayList<>();
        carrito = new ArrayList<>();
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public void agregarProductoaTienda(String nombre, double precio, int cantidad) {
        inventario.add(new Problema_1_ProductoBase(nombre, precio, cantidad));

    }

    public void agregarProducto(String nombre, int cantidad) {
        for (Problema_1_ProductoBase p : inventario) {
            if (p.getNombre().equalsIgnoreCase(nombre)) {
                if (p.getCantidad() >= cantidad) {
                    carrito.add(new Problema_1_ProductoBase(p.getNombre(), p.getPrecio(), cantidad));
                    System.out.println("Producto agregado al carrito.");
                } else{
                    System.out.println("No hay suficientes existencias disponibles.");
                }
                return;
            }
        }
        System.out.println("Producto no encontrado.");
    }

    public double calcTotal() {
        double total = 0;
        for (Problema_1_ProductoBase p : carrito) {
            total += p.getPrecio() * p.getCantidad();
        }
        if (total > 1000) {
            total -= (total * descuento / 100);
        }
        return total;
    }

    public void realizarPago(double monto) {
        double total = calcTotal();
        if (monto >= total) {
            System.out.println("Pago exitoso, gracias por su compra.");
            actuInventario();
        } else{
            System.out.println("Pago insuficiente, faltan $" + (total - monto));
        }
    }

    private void actuInventario() {
        for (Problema_1_ProductoBase comprado : carrito) {
                for(Problema_1_ProductoBase disponible : inventario) {
                    if (comprado.getNombre().equalsIgnoreCase(disponible.getNombre())) {
                        int cantNueva = disponible.getCantidad() - comprado.getCantidad();
                        disponible.setCantidad(cantNueva);
                    }
                }
            }
            carrito.clear();
    }

    public void mostrarCompra() {
        System.out.println("\nDetalles de la compra:");
        for (Problema_1_ProductoBase p : carrito) {
            System.out.println(p + "\nSubtotal: $" + (p.getPrecio() * p.getCantidad()));
        }
        System.out.println();
        System.out.println("Total: $" + calcTotal());
    }

    public void mostrarInventario() {
        System.out.println("        === Inventario Disponible ===");
        for(Problema_1_ProductoBase p : inventario) {
            System.out.println(p);
        }
    }
}