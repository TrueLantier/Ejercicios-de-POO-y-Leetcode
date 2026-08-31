package EjerciciosPrácticos.deepseek;

public class Palíndromo {
    /**
     * Ejercicio 1: Palíndromo
     */

    public static String[] frases = {"Yo hago yoga hoy.", "Ana", "oso", "Somos o no somos", "reconoceR", "Arepera", "sometemos",
            "Neuquén", "Dábale arroz a la zorra el abad.", "La ruta nos aportó otro paso natural",
            "Sé verlas al revés", "Oír sin reír, ni serio."};

    public static void palíndromo(String frase) {
        boolean esPalíndromo = true;
        int longitud = frase.length();
        int contInicial = 0;
        int contFinal = 0;

        for (int i=0; i < longitud / 2; i++) {

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

        return uno.equals(dos);
    }

    //public static
}
