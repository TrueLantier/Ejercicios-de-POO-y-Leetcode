package pruebas;

import EjerciciosPrácticos.deepseek.primerosdiez.*;
import java.text.Collator;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Collator collator = Collator.getInstance(); // Collator para el locale por defecto.
        Collator collatorSpain = Collator.getInstance(new Locale("es", "ES"));

        String palabras = "Angel, Eduardo Pedraza Ordoñez. Angel Eduardo Pedraza Ordoñez.";
        String word = "";
        String texto = Texto.textoCero;
        HashMap<String, Integer> contador = new HashMap<>();

        for (int i = 0; i < palabras.length(); i++) {
            if (Character.isLetter(palabras.charAt(i))) {
                word += palabras.charAt(i);
            } else {
                if (!word.isEmpty()) {
                    if (contador.containsKey(word)) {
                        Integer valor = contador.get(word);
                        contador.replace(word, valor, valor + 1);
                        word = "";
                        continue;
                    }

                    contador.put(word, 1);
                    word = "";
                }
            }
        }

        System.out.println(contador + "\n");

        List<Map.Entry<String, Integer>> lista = new ArrayList<>(contador.entrySet());
        lista.sort(Map.Entry.comparingByKey(collatorSpain));
        System.out.println(lista);
    }
}
