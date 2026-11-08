package EjerciciosPrácticos.hilos.productoresconsumidores;

/*
  19. Productor-consumidor con buffer acotado (tu propia cola sobre `LinkedList`, capacidad N), varios
  productores y varios consumidores. Usa `notifyAll()` y demuestra con un caso concreto por qué `notify()`
  simple puede dejar hilos dormidos para siempre.
 */

public class Productores implements Runnable{
    public Thread thread;
    public Clientes cls;
    Consumidores consumidores;
    public String nombre = "Productor #";
    public int id = 0;
    boolean suspended;
    boolean stopped;

    public Productores(String nombre) {
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
            incrementar();
            mysuspend();
            consumidores.myresume();

            try {
                synchronized (this) {
                    while (suspended) {
                        wait();
                    }
                    // if(stopped) break;
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

    public void asignarConsumidor(Consumidores c) {
        this.consumidores = c;
    }

    public void incrementar() {
        ++cls.nums[id];
        System.out.println("Se ha incrementado nums[" + id + "] --> " + cls.nums[id]);
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
