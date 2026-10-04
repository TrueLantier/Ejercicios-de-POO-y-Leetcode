package EjerciciosPrácticos.deepseek.primerosdiez;

/*
  Convierte un número decimal (1-3999) a romano y viceversa. Debe validar entradas incorrectas.
 */

public class RomanoDecimal {

    public int convertirADecimal(String letras) {
        int num = 0;
        int len = letras.length();
        int valorAnterior = 0;
        int j = 0;

        while (j < len) {
            int valorActual = valorarLetra(String.valueOf(letras.charAt(len-j-1)));

            if (valorActual < valorAnterior) {
                num -= valorActual;
                valorAnterior = valorarLetra(String.valueOf(letras.charAt(len-j-1)));
                j++;
                continue;
            }

            num += valorActual;
            valorAnterior = valorarLetra(String.valueOf(letras.charAt(len-j-1)));
            j++;
        }

        return num;
    }

    public String convertirARomano(int num) {
        if (num < 1 || num > 3999) {
            return "Número fuera de rango.";
        }

        int u = num % 10;
        int d = ((num - u) % 100) / 10;
        int c = ((num-u-d*10) % 1000) / 100;
        int um = (num-u-d*10-c*100) / 1000;

        if (num < 10) {
            return verUnidades(num);
        }

        if (num < 100) {
            return verDecenas(d) + verUnidades(u);
        }

        if (num < 1000) {
            return verCentenas(c) + verDecenas(d) + verUnidades(u);
        }

        // System.out.println(um + " " + c + " " + d + " " + u);
        return verUM(um) + verCentenas(c) + verDecenas(d) + verUnidades(u);
    }

    public String verUnidades(int u) {
        return switch (u) {
            case 1 -> "I";
            case 2 -> "II";
            case 3 -> "III";
            case 4 -> "IV";
            case 5 -> "V";
            case 6 -> "VI";
            case 7 -> "VII";
            case 8 -> "VIII";
            case 9 -> "IX";
            default -> "";
        };
    }

    public String verDecenas(int d) {
        return switch (d) {
            case 1 -> "X";
            case 2 -> "XX";
            case 3 -> "XXX";
            case 4 -> "XL";
            case 5 -> "L";
            case 6 -> "LX";
            case 7 -> "LXX";
            case 8 -> "LXXX";
            case 9 -> "XC";
            default -> "";
        };
    }

    public String verCentenas(int c) {
        return switch (c) {
            case 1 -> "C";
            case 2 -> "CC";
            case 3 -> "CCC";
            case 4 -> "CD";
            case 5 -> "D";
            case 6 -> "DC";
            case 7 -> "DCC";
            case 8 -> "DCCC";
            case 9 -> "CM";
            default -> "";
        };
    }

    public String verUM(int um) {
        return switch (um) {
            case 1 -> "M";
            case 2 -> "MM";
            case 3 -> "MMM";
            default -> "";
        };
    }

    public int valorarLetra(String a) {
        return switch (a) {
            case "I" -> 1;
            case "V" -> 5;
            case "X" -> 10;
            case "L" -> 50;
            case "C" -> 100;
            case "D" -> 500;
            case "M" -> 1000;
            default -> 0;
        };
    }
}

/*
        int[] nums = {8, 16, 29, 92, 99, 14, 19, 40, 44, 49, 50, 90};
        int[] nums2 = {160, 165, 199, 256, 387, 995, 3199, 100, 400, 444, 500, 900, };
        int[] nums3 = {1665, 3199, 1000, 1994, 2024, 3999, 1111, 1666, -1};
        String[] letras = { "VIII", "XVI", "XXIX", "XCII", "XCIX", "XIV", "XIX", "XL", "XLIV", "XLIX", "L", "XC"};
        for (int num : nums3) {
            String letra = rd.convertirARomano(num);
            System.out.println(letra + " " + rd.convertirADecimal(letra));
        }
 */
