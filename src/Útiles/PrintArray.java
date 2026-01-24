package Útiles;

public class PrintArray {
    public static void arrayPrint(int[][] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
    }

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

    public static void arrayPrint(String[][] strings) {
        for (int i = 0; i < strings.length; i++) {
            for (int j = 0; j < strings[i].length; j++) {
                System.out.print(strings[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void arrayPrint(String[] strings) {
        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + " ");
        }
        System.out.println();
    }


}
