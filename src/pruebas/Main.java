package pruebas;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("h");
        List<StringBuilder> l = new ArrayList<>();
        l.add(sb);
        System.out.println(l.getLast());
        System.out.println("".isEmpty());
    }
}
