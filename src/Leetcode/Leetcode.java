package Leetcode;

public class Leetcode {
    public static void main(String[] args) {
        String[] ejemplo = {"1", "4", "+", "3", "*", "5", "/"};
        String[] ejemploDos = {"4", "13", "5", "/", "+"};
        int a = EjerciciosParte1.evaluatePolishNotation(ejemplo);
        System.out.println(a);
    }

    // Métodos auxiliares.
    public static void arrayPrint(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
    public static void arrayPrint(int[] nums, int k) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == k) continue;
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
}
