package EjerciciosPrácticos;
// Ronda 1, con dificultad 1.

public class Ronda1D1 {
    public static void main(String[] args) {
        Password password = new Password("angel157ANGEL");
        password.esFuerte();
    }
}

//Ej9
/**
 * Crea una clase Password con atributo contraseña(String). Agrega un método esFuerte() que verifique
 * que tiene al menos 8 caracteres, una mayúscula, una minúscula y un número.
 */
class Password {
    private final String contraseña;

    Password(String contraseña) {
        this.contraseña = contraseña;
    }

    void esFuerte() {
        boolean strongPassword = true;
        if (contraseña.length() < 8) {
            System.out.println("Su contraseña es insegura. Menos de 8 caracteres.");
            return;
        }

        uno: for (int i = 0; i < contraseña.length(); i++) {
            for (int j = 0; j < 27; j++) {
                if (contraseña.charAt(i) == ((char) 'A' + j) ) {
                    strongPassword = true;
                    break uno;
                }
                strongPassword = false;
            }
        }
        if (!strongPassword) {
            System.out.println("Contraseña débil. Necesita el menos una mayúscula.");
            return;
        }

        dos: for (int i = 0; i < contraseña.length(); i++) {
            for (int j = 0; j < 27; j++) {
                if (contraseña.charAt(i) == ((char) 'a' + j) ) {
                    strongPassword = true;
                    break dos;
                }
                strongPassword = false;
            }
        }
        if (!strongPassword) {
            System.out.println("Contraseña débil. Necesita el menos una minúscula.");
            return;
        }

        // Esta vía es probando algo. Lo mejor para los números es almacenarlos en una matriz y comparar.
        tres: for (int i = 0; i < contraseña.length(); i++) {
            for (int j = 0; j < 10; j++) {
                if (contraseña.charAt(i) == ( (char) '0' + j)) {
                    strongPassword = true;
                    break tres;
                }
                strongPassword = false;
            }
        }
        if (!strongPassword) {
            System.out.println("Contraseña débil. Necesita el menos un número.");
            return;
        }

        System.out.println("Buena contraseña.");
    }
}

//Ej8
/*
Crea una clase Producto con: código(String), nombre, precio, stock(int). Agrega un método vender
(cantidad) que reduzca el stock si hay suficiente.
En el main:
        Producto producto = new Producto("0101112", "Laptop", 675.00, 10);
        producto.vender(5);
 */
class Producto {
    String código;
    String nombre;
    double precio;
    int stock;

    Producto(String c, String n, double p, int s) {
        código = c;
        nombre = n;
        precio = p;
        stock = s;
    }

    void vender(int num) { stock -= num; }
}

//Ej7
/*
Crea una clase Contador con un atributo valor(int). Agrega métodos para incrementar, decrementar y
resetear. No permitas valores negativos.
En el main:
        Contador cont = new Contador(4);
        cont.incrementar(10);
        cont.incrementar(12);
        cont.decrementar(6);
        cont.resetear();
 */
class Contador {
    private int valor;
    private int original;

    Contador(int num) {
        valor = num;
        original = num;
    }

    void incrementar(int suma) { valor += suma; }
    void decrementar(int resta) { valor-= resta; }
    void resetear() { valor = original; }
}

//Ej6
/*
Crea una clase Fecha con día, mes, año. Agrega un método esVálida() que verifique si es una fecha válida.
En el main:
        Fecha fecha = new Fecha(2, 2, 2002);
        boolean verificar = fecha.esVálida();
        System.out.println(verificar);
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

    boolean esVálida() {
        boolean fechaVálida = true;

        if (año > 2100) { fechaVálida = false; }
        else {
            if ( (mes < 0) || (mes > 12) || (día < 1) || (día > 31)) { fechaVálida = false; }
            else {
                if ( día > 28 && mes == 2) { fechaVálida = false; }
                if ( (mes != 2 ) && (mes%2 == 0) && (día > 30)) { fechaVálida = false; }
            }
        }
        return fechaVálida;
    }
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
