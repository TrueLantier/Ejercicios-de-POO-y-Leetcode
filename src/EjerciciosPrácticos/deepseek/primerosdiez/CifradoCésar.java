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

            try {
                System.out.println("\nPulse '0' para salir.");
                System.out.println("Elija la clave o desplazamiento: ");
                clave = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Entrada de clave incorrecta. Intente otra vez.");
            }
            if (verificarClave(clave)) {
                continue;
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

    public void codificarMensaje(String mensaje) {

    }

    public void decodificarMensaje(String mensaje) {

    }

    public void cambiarClave() {

    }
}
