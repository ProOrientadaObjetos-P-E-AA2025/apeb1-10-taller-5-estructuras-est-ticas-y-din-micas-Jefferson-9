public class Problema_2_MateriaBase {
    private String nombre;
    private double adc;
    private double ape;
    private double aa;
    private double notaTotal;

    public Problema_2_MateriaBase(String nombre, double adc, double ape, double aa) {
        this.nombre = nombre;
        this.adc = adc;
        this.ape = ape;
        this.aa = aa;
        calNotaTotal();
    }

    public String getNombre() {
        return nombre;
    }

    public double getAdc() {
        return adc;
    }

    public double getApe() {
        return ape;
    }

    public double getAa() {
        return aa;
    }

    public double getNotaTotal() {
        return notaTotal;
    }

    public void calNotaTotal() {
        notaTotal = adc + ape + aa;
    }

    public boolean aprobado() {
        return getNotaTotal() >= 7.0;
    }
}