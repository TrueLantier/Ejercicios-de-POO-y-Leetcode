package EjerciciosPrácticos;
// Ronda 1, con dificultad 1.

public class Ronda1D1 {
    public static void main(String[] args) {

    }
}

/*
Ej2: Crea una clase Calculadora con métodos para sumar, restar, multiplicar y dividir dos números (double). Incluye
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

/*
Ej1: Crea una clase persona con atributos: nombre(String), edad (int). Agrega un método mostrarInfo() que
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
