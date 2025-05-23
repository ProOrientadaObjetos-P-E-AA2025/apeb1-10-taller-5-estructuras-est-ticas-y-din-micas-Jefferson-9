public class Problema_4_PersonaImplicadaBase {
    private String nombre;
    private int edad;
    private String ocupacion;
    private String nivelImplicacion;
    private double sentencia;
    private double danoEconomico;
    
    public Problema_4_PersonaImplicadaBase(String nombre, int edad, String ocupacion, String nivelImplicacion,
            double sentencia, double danoEconomico) {
        this.nombre = nombre;
        this.edad = edad;
        this.ocupacion = ocupacion;
        this.nivelImplicacion = nivelImplicacion;
        this.sentencia = sentencia;
        this.danoEconomico = danoEconomico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getNivelImplicacion() {
        return nivelImplicacion;
    }

    public void setNivelImplicacion(String nivelImplicacion) {
        this.nivelImplicacion = nivelImplicacion;
    }

    public double getSentencia() {
        return sentencia;
    }

    public void setSentencia(double sentencia) {
        this.sentencia = sentencia;
    }

    public double getDanoEconomico() {
        return danoEconomico;
    }

    public void setDanoEconomico(double danoEconomico) {
        this.danoEconomico = danoEconomico;
    }

    public void colaborar() {
        if (nivelImplicacion.equalsIgnoreCase("acusado")) {
            System.out.println(nombre + " está colaborando, se reduce su sentencia a la mitad.");
            sentencia = sentencia / 2;
        }
    }

    public void reduPena() {
        if (nivelImplicacion.equalsIgnoreCase("acusado") && sentencia < 1) {
            double fianza = danoEconomico * 0.5;
            System.out.println("Puede pagar fianza, monto máximo permitido: $" + fianza);
        } else {
            System.out.println("La persona no es candidata para reducción de pena o pagar fianza.");
        }
    }

    @Override
    public String toString() {
        return
        "Persona: " + nombre + "\n" +
        "Edad: " + edad + "\n" +
        "Ocupación: " + ocupacion + "\n" +
        "Nivel de implicación: " + nivelImplicacion + "\n" +
        "Sentencia: " + sentencia + " años\n" +
        "Daño económico: $" + danoEconomico;
    }
}
