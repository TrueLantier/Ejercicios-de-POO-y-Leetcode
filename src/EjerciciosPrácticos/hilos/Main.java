package EjerciciosPrácticos.hilos;

// Este es el main de hilos.

import EjerciciosPrácticos.hilos.productorconsumidor.*;

import java.util.Arrays;

public class Main {
    static void main(String[] args) {
        Productor p = new Productor();
        Consumidor c = new Consumidor();

        p.thread.start();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        c.thread.start();

        try {
            p.thread.join();
            c.thread.join();
        } catch (InterruptedException e) {
            System.out.println("Error en algún hilo.");
        }

        System.out.println("Main finalizado.");
    }
}
