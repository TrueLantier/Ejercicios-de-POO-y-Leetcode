package EjerciciosPrácticos.hilos.productoresconsumidores;

/*
  Los consumidores se inicializan primero porque ellos esperan por los movimientos de los productores.
 */

public class Consumidores implements Runnable{
    public Thread thread;
    public Clientes cls;
    Productores productores;
    public String nombre = "Consumidor #";
    public int id = 0;
    boolean suspended;
    boolean stopped;

    public Consumidores(String nombre) {
        id = Integer.parseInt(nombre);
        String nombreCompleto = this.nombre + nombre;
        thread = new Thread(this, nombreCompleto);
        suspended = false;
        stopped = false;
    }

    @Override
    public void run() {

        for (int i = 0; i < 5; i++) {
            System.out.println(thread.getName() + " iniciando: " + i);
            decrementar();
            mysuspend();
            productores.myresume();

            try {
                if (i == 4) {
                    productores.myresume();
                    Thread.sleep(100);
                    myresume();
                }

                synchronized (this) {
                    while (suspended) {
                        wait();
                    }
                }
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread() + " interrumpido.");
            }
        }

        System.out.println("Terminando: " + thread.getName());
    }

    public void iniciar() {
        thread.start();
    }

    public void asignarClientes(Clientes cls) {
        this.cls = cls;
    }

    public void asignarProductor(Productores p) {
        this.productores = p;
    }

    public void decrementar() {
        --cls.nums[id];
        System.out.println("Se ha decrementado nums[" + id + "] --> " + cls.nums[id]);
    }

    synchronized void mystop() {
        stopped = true;
        suspended = false;
        notify();
    }

    synchronized void mysuspend() {
        suspended = true;
    }

    synchronized void myresume() {
        suspended = false;
        notify();
    }
}
