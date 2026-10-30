package EjerciciosPrácticos.hilos;

public class EjCinco implements Runnable{
    int [] array;
    int posición;
    int suma;
    Thread thread;

    public EjCinco(int[] array, int posición) {
        thread = new Thread(this);
        this.array = array;
        this.posición = posición;
    }

    @Override
    public void run() {
        System.out.println(posición + " en hilo: " + thread.getName());
        suma = calcularSuma(posición);
    }

    public static int[] generarArray(int num) {
        int[] array = new int[16];
        for (int i = 0; i < 16; i++) {
            array[i] = i + num;
        }
        return array;
    }

    // NOTA: Quiero proporcionar datos a otros hilos: MÉTODOS.

    public int calcularSuma(int posición) {
        int suma = 0;
        for (int i = 0; i < 4; i++) {
            suma += array[posición+i];
        }

        return suma;
    }
}

/*
  int[] array = EjCinco.generarArray(0);
        System.out.println(Arrays.toString(array));

        EjCinco ob1 = new EjCinco(array, 0);
        EjCinco ob2 = new EjCinco(array, 4);
        EjCinco ob3 = new EjCinco(array, 8);
        EjCinco ob4 = new EjCinco(array, 12);

        ob1.thread.start();
        ob2.thread.start();
        ob3.thread.start();
        ob4.thread.start();

        try {
            ob1.thread.join();
            ob2.thread.join();
            ob3.thread.join();
            ob4.thread.join();

            System.out.println(ob1.suma+ ob2.suma+ ob3.suma+ob4.suma);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
 */
