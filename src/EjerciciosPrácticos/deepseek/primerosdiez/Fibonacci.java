package EjerciciosPrácticos.deepseek.primerosdiez;

/*
  Calcula el n-ésimo número de Fibonacci usando un array o `HashMap` para almacenar resultados ya calculados y
  evitar recursión ineficiente.
 */

import java.util.Arrays;

public class Fibonacci {
    int fb1 = 0;
    int fb2 = 1;

    public int calcularFibonacciN(int n) {
        int i = 1;
        int fibonacciUno = fb1;
        int fibonacciDos = fb2;
        int fibonacciN = 0;


        if (n==1) { return fb1; }
        if (n==2) { return fb2; }

        while (i < n-1) {
            fibonacciN = fibonacciUno + fibonacciDos;
            fibonacciUno = fibonacciDos;
            fibonacciDos = fibonacciN;

            i++;
        }

        return fibonacciN;
    }

    public void calcularArrayFibonacci(int n) {
        int[] numsFibonacci = new int[n];
        numsFibonacci[0] = 0;
        numsFibonacci[1] = 1;

        for (int i = 2; i < n; i++) {
            numsFibonacci[i] = numsFibonacci[i-1] + numsFibonacci[i-2];
        }

        System.out.println(Arrays.toString(numsFibonacci));
    }
}
