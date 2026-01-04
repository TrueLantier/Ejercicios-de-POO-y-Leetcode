package EjerciciosPrácticos;
// Ronda 1, con dificultad 1.

public class Ronda1D1 {
    public static void main(String[] args) {


    }
}

//Ej6
/*
Crea una clase Fecha con día, mes, año. Agrega un método esVálida() que verifique si es una fecha válida.
En el main:
 */
class Fecha {
    int día;
    int mes;
    int año;
    Fecha(int día, int mes, int año) {
        this.día = día;
        this.mes = mes;
        this.año = año;
    }

//    boolean esVálida(int día, int mes, int año) {
//
//    }
}

//Ej5
/*
Crea una clase Estudiante con: nombre, notas(array con 5 doubles). Agrega métodos para calcular promedio y
determinar si aprobó(promedio >=6).
En el main:
        int[] notas = {4, 6, 8, 10};
        Estudiante es = new Estudiante("Ernesto", notas);
        System.out.println(es.promedio);
        es.aprobar();
 */
class Estudiante {
    // Se pueden hacer muchas más cosas, pero no las piden.
    private String nombre;
    private int[] notas;
    double promedio;

    Estudiante(String nombre, int[] notas) {
        this.nombre = nombre;
        this.notas = notas;
        promedio = promedioNotas(notas);
    }

    private double promedioNotas(int[] nums) {
        promedio = 0;
        for (int nota: nums) {
            promedio += nota;
        }
        return promedio / nums.length;
    }
    void aprobar() {
        if (promedio >= 6) {
            System.out.println("El estudiante aprobó");
        }   else {
            System.out.println("El estudiante no aprobó");
        }
    }
}

//Ej4
/*
Crea una clase Círculo con un radio (double). Agrega métodos para calcular área y perímetro.
Valida que el radio no sea negativo.
En el main:
        Círculo c1 = new Círculo(4);
        Círculo c2 = new Círculo(8);

        System.out.println(c1.área());
        System.out.println(c1.perímetro());

        System.out.println(c2.área());
        System.out.println(c2.perímetro());
 */
class Círculo {
    private double radio;
    Círculo(double radio) { this.radio = radio; }

    double área() {
        return Math.PI * radio * radio;
    }
    double perímetro() {
        return 2 * Math.PI * radio;
    }
}

//Ej3
/*
Crea una clase Libro con: título, autor, páginas (int), precio (double). Agrega un método aplicarDescuento(porcentaje)
que modifique el precio.
En el main:
        Libro l1 = new Libro("1984", "George Owell", 348, 99);
        Libro l2 = new Libro("El libro del mindfulness", "Bhante Henepola " +
                "Gunaratana", 210, 80);
        l1.mostrarInfo();
        l2.mostrarInfo();

        l1.aplicarDescuento(20);
        l2.aplicarDescuento(30);
        l1.mostrarInfo();
        l2.mostrarInfo();
 */
class Libro {
    private String título;
    private String autor;
    private int páginas;
    private double precio;

    Libro(String título, String autor, int páginas, double precio) {
        this.título = título;
        this.autor = autor;
        this.páginas = páginas;
        this.precio = precio;
    }

    void aplicarDescuento(double porcentaje) {
        precio = precio - (precio * (porcentaje / 100));

    }
    void mostrarInfo() {
        System.out.println(título);
        System.out.println(autor);
        System.out.println(páginas);
        System.out.println(precio);
        System.out.println();
    }
}

//Ej2
/*
Crea una clase Calculadora con métodos para sumar, restar, multiplicar y dividir dos números (double). Incluye
un método mostrarOperaciones() que liste todas las operaciones posibles.
En el main:
        Calculadora c1 = new Calculadora();
        System.out.println(c1.suma(1,2) );
        System.out.println(c1.resta(10,222));
        System.out.println(c1.multiplicación(99, 888));
        System.out.println(c1.división(1,0));
        System.out.println(c1.división(22,7));
        c1.mostrarInfo();
 */
class Calculadora {
    double suma( double a, double b) { return a + b; }
    double resta(double a, double b) { return a - b; }
    double multiplicación(double a, double b) { return a * b; }
    double división(double a, double b) {
        if (b == 0) {
            System.out.println("Operación inválida. División por cero.");
            return 0.0;
        }
        return a / b;
    }

    void mostrarInfo() {
        System.out.println("Operaciones:");
        System.out.println("Sumar \nRestar \nMultiplicar \nDividir");
    }
}

//Ej1
/*
Crea una clase persona con atributos: nombre(String), edad (int). Agrega un método mostrarInfo() que
imprima los datos. En el main, crea 2 objetos y muestra su información.
En el main:
        Persona p1 = new Persona("Pedro", 28);
        Persona p2 = new Persona("Amanda", 12);
        p1.mostrarInfo();
        p2.mostrarInfo();
*/
class Persona {
    String nombre;
    int edad;
    Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    void mostrarInfo() {
        System.out.println(nombre);
        System.out.println(edad);
        System.out.println();
    }
}
