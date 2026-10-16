package EjerciciosPrácticos.deepseek.segundosdiez;

/*
  Crea las clases `Estudiante` y `Curso`. Un curso tiene varios estudiantes. Permite agregar estudiantes, asignar
  notas y calcular promedio, aprobados y reprobados.
 */

public class Estudiante {
    final int ID = (int) (Math.random() * 1000);
    String nombre;
    int notaMatemáticas;
    int notaEspañol ;
    int notaInglés;
    int notaFísica;
    int notaQuímica;
    int[] notasEstudiante = {notaMatemáticas, notaEspañol, notaInglés, notaFísica, notaQuímica};

    public Estudiante(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "ID=" + ID +
                ", nombre='" + nombre + '\'' +
                ", notaMatemáticas=" + notaMatemáticas +
                ", notaEspañol=" + notaEspañol +
                ", notaInglés=" + notaInglés +
                ", notaFísica=" + notaFísica +
                ", notaQuímica=" + notaQuímica +
                '}';
    }
}
