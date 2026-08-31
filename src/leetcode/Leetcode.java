package leetcode;

public class Leetcode {
    public static void main(String[] args) {
        String[] ejemplo = {"1", "4", "+", "3", "*", "5", "/"};
        String[] ejemploDos = {"4", "13", "5", "/", "+"};
        int a = EjerciciosParte1.evaluatePolishNotation(ejemplo);
        System.out.println(a);
    }
}
