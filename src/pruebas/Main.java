package pruebas;

public class Main {
    public static void main(String[] args) {
        String palabra = "AnA";
        System.out.println(String.valueOf(palabra.charAt(0)) == String.valueOf(palabra.charAt(2)));

        String palabraDos = "AnA";
        System.out.println(String.valueOf(palabraDos.charAt(0)).equals(String.valueOf(palabraDos.charAt(2))));

        char a = 'a';
        int b = (int) 'a';
        System.out.println(a + " " + b + " " + (int) 'ñ' + " " + (int) 'Ñ');
        System.out.println((char) 97); // Comienzo de las minúsculas.
        System.out.println((char) 65); // Comienzo de las mayúsculas.

        System.out.println();
        for (int i = 0; i < 26; i++) {
            System.out.print((char) (65 + i) + " ");
        }

        System.out.println();
        for (int i = 0; i < 26; i++) {
            System.out.print((char) (97 + i) + " ");
        }

        System.out.println();
        char[] tildes = {'Á', 'É', 'Í', 'Ó', 'Ú', 'á', 'é', 'í', 'ó', 'ú'};
        for (char tilde : tildes) {
            System.out.print((int) tilde + " ");
        }

        System.out.println("\n&*&*&*".toUpperCase() + " " + "á".toUpperCase());
    }
}
