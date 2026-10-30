package EjerciciosPrácticos.hilos;

public class TresHilos {
    static void main(String[] args) {
        HiloUno h1 = new HiloUno();
        HiloDos h2 = new HiloDos();
        HiloTres h3 = new HiloTres();

        h1.start();
        h2.start();
        h3.start();
    }
}

class HiloUno extends Thread {
    @Override
    public void run() {
        this.setName("Hilo 1");
        for (int i = 0; i < 5; i++) {
            System.out.println(this.getName());
        }
    }
}

class HiloDos extends Thread {
    @Override
    public void run() {
        this.setName("Hilo 2");
        for (int i = 0; i < 5; i++) {
            System.out.println(this.getName());
        }
    }
}

class HiloTres extends Thread {
    @Override
    public void run() {
        this.setName("Hilo 3");
        for (int i = 0; i < 5; i++) {
            System.out.println(this.getName());
        }
    }
}

/*
        Thread thread = new Thread(new EjCuatro());
        thread.start();

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
 */