package Leetcode;
//Primeros 10 ejercicios.

public class EjerciciosParte1 {
    // 1 rotate array in Java. Eje: {1, 2, 3, 4, 5, 6, 7 } y k=3 ==> { 5, 6, 7, 1, 2, 3, 4 }
    static int[] rotarArrayDerecha(int[] array, int pasos) {
        int largo = array.length;
        if (largo < pasos) { pasos = pasos % largo; }
        int guardarUno = array[0];
        int guardarDos;

        for (int i = 0; i < pasos; i++) {
            for (int j = 1; j < largo; j++) {
                guardarDos = array[j];
                array[j] = guardarUno;
                guardarUno = guardarDos;

                if (j == array.length-1) { array[0] = guardarUno; }
            }
        }
        return array;
    }
    static int[] rotarArrayDerechaDos(int[] array, int pasos) {
        int largo = array.length;
        if (largo < pasos) { pasos = pasos % largo; }
        int[] arrayDerecho = new int[largo];
        int inmovibles = 0;

        for (int i = 0; i < largo; i++) {
            if (i < pasos) {
                arrayDerecho[i] = array[largo - pasos + i];
            }   else {
                arrayDerecho[i] = array[inmovibles];
                ++inmovibles;
            }
        }

        System.arraycopy(arrayDerecho, 0, array, 0, largo);
        return array;
    }

    // 2 Evaluate Reverse Polish Notation.
    // ["2", "1", "+", "3", "*"] ==> ((2+1) * 3) -> 9
    // ["4", "13", "5", "/", "+"] ==> (4 + (13/5)) -> 6

    static boolean esOperador(String valor) {
        boolean esOperador = false;
        String[] operadores = {"+", "-", "*", "/"};
        for (String operador: operadores) {
            if (operador == valor) {
                esOperador = true;
            }
        }
        return esOperador;
    }

    static int evaluatePolishNotation(String[] matriz) {
        String operación = "";
        int resultado = 0;
        int primerValor = 0;
        int segundoValor = 0;
        for (int i = 1; i < matriz.length; i++) {
            if (matriz[i] == "") { continue;}

            if (esOperador(matriz[i])) {
                operación = matriz[i];
                switch (operación){
                    case "+":
                        resultado = primerValor + segundoValor;
                        matriz[i] = String.valueOf(resultado);
                        matriz[i-1] = matriz[i-2] = "";
                        continue ;
                    case "-":
                        resultado = primerValor - segundoValor;
                        matriz[i] = String.valueOf(resultado);
                        matriz[i-1] = matriz[i-2] = "";
                        continue ;
                    case "*":
                        resultado = primerValor * segundoValor;
                        matriz[i] = String.valueOf(resultado);
                        matriz[i-1] = matriz[i-2] = "";
                        continue ;
                    case "/":
                        resultado = primerValor / segundoValor;
                        matriz[i] = String.valueOf(resultado);
                        matriz[i-1] = matriz[i-2] = "";
                        continue ;
                }
            }
            primerValor = Integer.parseInt(matriz[i-1]);
            segundoValor = Integer.parseInt(matriz[i]);

        }
        return resultado;
    }
}
