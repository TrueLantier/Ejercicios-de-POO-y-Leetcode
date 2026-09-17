package EjerciciosPrácticos.deepseek.primerosdiez;

import java.util.Scanner;

public class Palíndromo {

    /**
     * Ejercicio 1: Palíndromo
     * Palíndromo.palíndromo(Palíndromo.frases[0]);
     * Palíndromo.pedirFrase();
     */

    public static Scanner sc = new Scanner(System.in);

    public static String[] frases = {"Yo hago yoga hoy.", "AsSénésSa", "oso", "Somos o no somos", "reconoceR",
            "Arepera", "s ome te mos", "Neuquén", "Dábale arroz a la zorra el abad.",
            "La ruta nos aportó otro paso natural", "Sé verlas al revés", "Oír sin reír, ni serio.",
            "A man, a plan, a canal: Panama", ",,,a"};

    public static void palíndromo(String frase) {
        boolean esPalíndromo = true;
        int contInicial = 0;
        int contFinal = frase.length()-1;

        while (contInicial < contFinal) {

            while (esSigno(frase.charAt(contInicial)) && (contInicial < contFinal)) {
                ++contInicial;
            }
            while (esSigno(frase.charAt(contFinal)) && (contInicial < contFinal)) {
                --contFinal;
            }

            if (!comprobar(frase.charAt(contInicial), frase.charAt(contFinal))) {
                esPalíndromo = false;
                break;
            }

            ++contInicial;
            --contFinal;
        }

        if (esPalíndromo) {
            System.out.println(frase + " es palíndromo.");
        }   else {
            System.out.println(frase + " no es palíndromo.");
        }
    }

    public static boolean comprobar(char charUno, char charDos) {

        String uno = String.valueOf(charUno).toUpperCase();
        String dos = String.valueOf(charDos).toUpperCase();

        uno = cambiarTildes(uno);
        dos = cambiarTildes(dos);

        return uno.equals(dos);
    }

    public static boolean esSigno(char letra) {
        int[] numsLetras = {193, 201, 205, 211, 218, 225, 233, 237, 243, 250, 209, 241, 220, 252};

        if ((65 <= (int) letra) && ((int) letra <= 90)) {
            return false;
        }

        if ((97 <= (int) letra) && ((int) letra <= 122)) {
            return false;
        }

        if ((209 == (int) letra) || ((int) letra == 241)) {
            return false;
        }

        for (int num: numsLetras) {
            if ((int) letra == num) {
                return false;
            }
        }

        return true;
    }

    public static String cambiarTildes(String letra) {
        switch (letra) {
            case "Á":
                letra = "A";
                break;
            case "É":
                letra = "E";
                break;
            case "Í":
                letra = "I";
                break;
            case "Ó":
                letra = "O";
                break;
            case "Ú":
                letra = "U";
                break;
        }

        return letra;
    }

    public static void pedirFrase() {
        System.out.println("Escriba una frase para ver si es palíndroma: ");
        String frase = sc.nextLine();
        palíndromo(frase);
    }
}
