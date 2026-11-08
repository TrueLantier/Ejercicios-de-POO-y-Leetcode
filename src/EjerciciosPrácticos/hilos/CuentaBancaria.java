package EjerciciosPrácticos.hilos;

// Ejemplo de race condition.

public class CuentaBancaria {
    public int saldo = 0;

    public void depositar(int num) {
        saldo += num;
    }
    public void retirar(int num) {
        saldo -= num;
    }
}

class HiloCuatro implements Runnable{
    Thread thread;
    CuentaBancaria cb;

    HiloCuatro() {
        thread = new Thread(this);
    }

    @Override
    public void run() {
        cb.depositar(100);
        cb.depositar(100);
        cb.retirar(20);
        System.out.println(Thread.currentThread().getName());
    }

    public void asignarCB(CuentaBancaria cb) {
        this.cb = cb;
    }
}

/*
  CuentaBancaria cb = new CuentaBancaria();
        HiloCuatro h1 = new HiloCuatro();
        HiloCuatro h2 = new HiloCuatro();

        h1.asignarCB(cb);
        h2.asignarCB(cb);

        h1.thread.start();
        h2.thread.start();

        try {
            h1.thread.join(1000);
        } catch (InterruptedException e) {
            System.out.println("Hilo main interrumpido.");
        }
        System.out.println(cb.saldo);
 */