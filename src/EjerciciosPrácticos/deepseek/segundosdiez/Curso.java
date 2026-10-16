package EjerciciosPrácticos.deepseek.segundosdiez;

/*
  Crea las clases `Estudiante` y `Curso`. Un curso tiene varios estudiantes. Permite agregar estudiantes, asignar
  notas y calcular promedio, aprobados y reprobados.
 */

import java.util.ArrayList;
import java.util.List;

public class Curso {
    List<Estudiante> listaEstudiantes = new ArrayList<>();

    // Se asumirán notas ENTERAS.

    public void agregarEstudiante(Estudiante estudiante) {
        listaEstudiantes.add(estudiante);
    }

    public void asignarNota(Estudiante estudiante, int[] notas) {
        if (notas.length != 5) {
            System.out.println("Cantidad de notas incorrecta.");
            return;
        }

        for (int i=0; i < notas.length; i++) {
            int valor = notas[i];

            if (valor < 0 || valor > 100) {
                System.out.println("Nota incorrecta: " + valor);
                estudiante.notasEstudiante = new int[5];
                return;
            }
            estudiante.notasEstudiante[i] = valor;
        }
    }

//    public void verNotas(Estudiante estudiante) {
//        System.out.println(Arrays.toString(estudiante.notasEstudiante));
//    }
//
//    public void verEstudiante(Estudiante estudiante) {
//        System.out.println(estudiante.ID + " " + estudiante.nombre);
//    }

    public void calcularDatos(Estudiante estudiante) {
        double promedio = 0;
        for (int nota: estudiante.notasEstudiante) {
            promedio += nota;
        }
        System.out.println("El promedio del estudiante " + estudiante.nombre + " es: " + promedio/5);
        if ( promedio/5 > 60 ) {
            System.out.println("El estudiante está aprobado.");
        }   else {
            System.out.println("El estudiante está reprobado.");
        }
    }

    /*
      int[] notas1 = {90, 99, 98, 100, 98};
        int[] notas2 = {90, 69, 88, 10, 70};
        int[] notas3 = {100, 100, 100, 100, 100};
        int[] notas4 = {90, 90, 90, 90, 90};
        int[] notas5 = {40, 33, 22, 11, 18};
        int[][] notas = {notas1, notas2, notas3, notas4, notas5 };

        Estudiante estudiante1 = new Estudiante("Angel");
        Estudiante estudiante2 = new Estudiante("Eduardo");
        Estudiante estudiante3 = new Estudiante("Ernesto");
        Estudiante estudiante4 = new Estudiante("Laura");
        Estudiante estudiante5 = new Estudiante("Melisa");
        Estudiante[] estudiantes = {estudiante1, estudiante2, estudiante3, estudiante4, estudiante5 };

        Curso curso = new Curso();

        for (int i = 0; i < 5; i++) {
            curso.agregarEstudiante(estudiantes[i]);
            curso.asignarNota(estudiantes[i], notas[i]);
            System.out.println(estudiantes[i].toString());
            curso.calcularDatos(estudiantes[i]);
            System.out.println();
        }
     */
}
