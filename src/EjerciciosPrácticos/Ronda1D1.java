package EjerciciosPrácticos;
// Ronda 1, con dificultad 1.

public class Ronda1D1 {
    public static void main(String[] args) {

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

/*
Ej2: Crea una clase Calculadora con métodos para sumar, restar, multiplicar y dividir dos números (double). Incluye
un método mostrarOperaciones() que liste todas las operaciones posible.
 */
class Calculadora {
}