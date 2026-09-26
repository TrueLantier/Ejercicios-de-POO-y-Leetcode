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
        operación();
    }

    public void operación() {
        do {
            System.out.println("\nSeleccione la operación a realizar");
            System.out.println("0: Salir.\n1: Codificar mensaje.\n2: Decodificar mensaje.");

            String elección = sc.nextLine();

            switch (elección) {
                case "0":
                    clave = 0;
                    System.out.println("Ha salido del sistema.");
                    break;
                case "1":
                    codificaciónMensaje(true);
                    break;
                case "2":
                    codificaciónMensaje(false);
                    break;
                default:
                    System.out.println("Operación insertada incorrecta.");
            }
        } while (clave != 0);
    }

    public boolean verificarClave(int clave) {
        if (clave > 25 || clave < 0) {
            System.out.println("Clave fuera de rango: 0-25");
            return true;
        }
        return false;
    }

    public void codificaciónMensaje(boolean codificar) {
        System.out.print("Elija la clave o desplazamiento: ");
        clave = sc.nextInt();
        sc.nextLine(); // El querido retorno de carro otra vez. Al menos ya lo identifico rápido.
        if (verificarClave(clave)) { return;}

        if (codificar) {
            System.out.print("Escriba la frase a codificar: ");
        }   else {
            System.out.print("Escriba la frase a decodificar: ");
        }

        String mensaje = sc.nextLine();
        StringBuilder mensajeAlterado = new StringBuilder();
        String espacio = " ";

        for (int i = 0; i < mensaje.length(); i++) {
            int letra = mensaje.charAt(i);

            if (espacio.equals(String.valueOf((char) letra))) {
                mensajeAlterado.append((char) letra);
                continue;
            }
            if ((65 <= (int) letra) && ((int) letra <= 90)) {
                if (codificar) {
                    letra += clave;
                    if (letra > 90) {
                        letra -= 26;
                    }
                }   else {
                    letra -= clave;
                    if (letra < 65) {
                        letra += 26;
                    }
                }
            }

            if ((97 <= (int) letra) && ((int) letra <= 122)) {
                if (codificar) {
                    letra += clave;
                    if (letra > 122) {
                        letra -= 26;
                    }
                }   else {
                    letra -= clave;
                    if (letra < 97) {
                        letra += 26;
                    }
                }
            }
            mensajeAlterado.append((char) letra);
        }
        System.out.println("\n" + mensajeAlterado);
    }

    public void decodificarMensaje() {

    }
}
