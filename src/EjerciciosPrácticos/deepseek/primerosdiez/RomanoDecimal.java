package EjerciciosPrácticos.deepseek.primerosdiez;

/*
  Convierte un número decimal (1-3999) a romano y viceversa. Debe validar entradas incorrectas.
 */

public class RomanoDecimal {
    String uno = "I";
    String cinco = "V";
    String diez = "X";
    String l50 = "L";
    String cien = "C";
    String d500 = "D";
    String mil = "M";



    public void convertirARomano(int num) {
        if (num < 1 || num > 3999) {
            System.out.println("Número fuera de rango.");
            return;
        }

        int u = num % 10;
        int d = ((num - u) % 100) / 10;
        int c = ((num-u-d*10) % 1000) / 100;
        int um = (num-u-d*10-c*100) / 1000;

        if (num < 10) {
            System.out.println(verUnidades(num));
            return;
        }

        if (num < 100) {
            System.out.println(verDecenas(d) + verUnidades(u));
            return;
        }

        if (num < 1000) {
            System.out.println(verCentenas(c) + verDecenas(d) + verUnidades(u));
            return;
        }

        System.out.println(um + " " + c + " " + d + " " + u);
        System.out.println(verUM(um) + verCentenas(c) + verDecenas(d) + verUnidades(u));
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

}
