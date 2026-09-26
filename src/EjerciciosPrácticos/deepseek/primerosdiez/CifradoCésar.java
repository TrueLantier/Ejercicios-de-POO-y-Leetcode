package EjerciciosPrácticos.deepseek.primerosdiez;

/*
  Implementa un programa que codifique y decodifique mensajes usando el cifrado César, permitiendo elegir
  el desplazamiento.
 */

import java.util.Scanner;

public class CifradoCésar {
   Scanner sc = new Scanner(System.in);
   int clave;

    public CifradoCésar() throws NumberFormatException{
        System.out.println("Bienvenido al sistema de cifrado César.");

        do {
            System.out.println("\nPulse '0' para salir.");

            operación();




        } while (clave != 0);

    }

    public void operación() {
        System.out.println("Seleccione la operación a realizar");
        System.out.println("0: Salir.\n1: Codificar mensaje.\n2: Decodificar mensaje.");

        String elección = sc.nextLine();

        switch (elección) {
            case "0":
                clave = 0;
                System.out.println("Ha salido del sistema.");
                break;
            case "1":
                codificarMensaje();
                break;
            case "2":
                decodificarMensaje();
                break;
            default:
                System.out.println("Operación insertada incorrecta.");
        }

    }

    public boolean verificarClave(int clave) {
        if (clave > 25 || clave < 0) {
            System.out.println("Clave fuera de rango: 0-25");
            return true;
        }
        return false;
    }

    public void codificarMensaje() {
        System.out.print("Elija la clave o desplazamiento: ");
        clave = sc.nextInt();
        sc.nextLine(); // El querido retorno de carro otra vez. Al menos ya lo identifico rápido.

        if (verificarClave(clave)) {
            return;
        }

        System.out.print("\nEscriba la frase a codificar: ");
        String mensaje = sc.nextLine();
        StringBuilder mensajeCodificado = new StringBuilder();
        String espacio = " ";

        for (int i = 0; i < mensaje.length(); i++) {
            int letra = mensaje.charAt(i);

            if (espacio.equals(String.valueOf((char) letra))) {
                mensajeCodificado.append((char) letra);
                continue;
            }

            if ((65 <= (int) letra) && ((int) letra <= 90)) {
                letra += clave;
                if (letra > 90) {
                    letra -= 26;
                }
            }

            if ((97 <= (int) letra) && ((int) letra <= 122)) {

            }

            mensajeCodificado.append((char) letra);
        }

        System.out.println("\n" + mensajeCodificado);
    }

    public void decodificarMensaje() {

    }

    public void cambiarClave() {

    }
}
