package EjerciciosPrácticos.hilos.productorconsumidor;

public class Consumidor implements Runnable{
    public Thread thread;

    public Consumidor() {
        thread = new Thread(this, "Consumidor");
    }

    @Override
    public void run() {

        for (int i = 0; i < 5; i++) {
            synchronized (Cliente.class) {
                tomar();
                System.out.println("Hilo " + thread.getName() + " " + i + " " + Cliente.num);
                System.out.println(Cliente.estado);

                Cliente.class.notify();
                if (i == 4) {break;} // Notifica y libera a Productor.
                while (Cliente.estado.equals("Tomado")) {
                    try {
                        Cliente.class.wait();
                    } catch (InterruptedException e) {
                        System.out.println("Error en el hilo " + thread.getName());
                    }
                }

            }
        }


    }

    public void iniciar() {
        thread.start();
    }

    public void tomar() {
        --Cliente.num;
        Cliente.estado = "Tomado";
    }
}
