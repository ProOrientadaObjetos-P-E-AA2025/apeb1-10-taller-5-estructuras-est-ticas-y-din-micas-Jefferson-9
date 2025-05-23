public class Problema_2_EstudianteBase {
    private String nombre;
    private int edad;
    private Problema_2_MateriaBase materia;

    public Problema_2_EstudianteBase(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void aggMateria(Problema_2_MateriaBase materia) {
        this.materia = materia;
    }

    public String mostrarEstado() {
        String result;
        double notaRecuperacion, nota60;
        if (materia.aprobado()) {
            result = "Aprobado";
        } else {
            nota60 = materia.getNotaTotal() * 0.6;
            notaRecuperacion = (7.0 - nota60) / 0.4;
            if (notaRecuperacion > 3.5) {
                result = "No aprobado \n" + "Ni con la nota máxima en recuperación aprueba";
            } else {
                result = "No aprobado \n" + "Debe rendir la prueba de recuperación " + 
            "y sacar al menos : " + String.format("%.2f", notaRecuperacion) + " / 3.5";
            }
        }
        return result;
    }

    @Override
    public String toString() {
        return
        "Estudiante: " + nombre + "\n" +
        "Edad: " + edad + "\n" +
        "Materia: " + materia.getNombre() + "\n" +
        "Nota total: " + materia.getNotaTotal() + "\n" + 
        mostrarEstado();
    }
}
