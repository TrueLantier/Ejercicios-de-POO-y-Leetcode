package EjerciciosPrácticos.deepseek;

/*
 ¿Por qué equals() y == no son lo mismo?
 ¿Cómo se llaman las letras en números a = 97?
 ¿Por qué IntelliJ me pone reemplazar los souts con logpoints?
 */

public class Palíndromo {
    /**
     * Ejercicio 1: Palíndromo
     */

    public static String[] frases = {"Yo hago yoga hoy.", "Assénéssa", "oso", "Somos o no somos", "reconoceR", "Arepera",
            "sometemos", "Neuquén", "Dábale arroz a la zorra el abad.", "La ruta nos aportó otro paso natural",
            "Sé verlas al revés", "Oír sin reír, ni serio."};

    public static void palíndromo(String frase) {
        boolean esPalíndromo = true;
        int longitud = frase.length();
        int contInicial = 0;
        int contFinal = 0;

        for (int i=0; i < longitud / 2; i++) {

            if (esSigno(frase.charAt(i + contInicial))) {
                ++contInicial;
            }
            if (esSigno(frase.charAt(longitud-1-i-contFinal))) {
                ++contFinal;
            }

            if (!comprobar(frase.charAt(i + contInicial), frase.charAt(longitud-1-i-contFinal))) {
                esPalíndromo = false;
                break;
            }
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
        int[] numsLetras = {193, 201, 205, 211, 218, 225, 233, 237, 243, 250, 209, 241};

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
}
