package EjerciciosPrácticos.hilos.productorconsumidor;

public class Consumidor implements Runnable{
    Thread thread;

    public Consumidor() {
        thread = new Thread(this, "Productor");
    }

    @Override
    public void run() {
        tomar();
    }

    public synchronized void tomar() {
        --Cliente.num;
        Cliente.estado = "Tomado";
    }
}
