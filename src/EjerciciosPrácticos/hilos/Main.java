package EjerciciosPrácticos.hilos;

// Este es el main de hilos.

import EjerciciosPrácticos.hilos.productoresconsumidores.*;
import java.util.Arrays;

public class Main {
    static void main(String[] args) {
        Clientes clientes = new Clientes();
        Productores p1 = new Productores("1");
        Consumidores c1 = new Consumidores("1");

        p1.asignarClientes(clientes);
        p1.asignarConsumidor(c1);
        c1.asignarClientes(clientes);
        c1.asignarProductor(p1);

        p1.iniciar();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        c1.iniciar();

        try {

            //Thread.sleep(3000);
            //System.out.println(p1.thread.isAlive());
            //System.out.println(c1.thread.isAlive());
            p1.thread.join();
            c1.thread.join();
        } catch (InterruptedException e) {
            System.out.println("Error en algún hilo.");
        }

        System.out.println("Main finalizado.");
    }
}
