package pruebas;

public class Main {
    public static void main(String[] args) {
        int[][] nums = {
                {1,2,  3,4},
                {5,1,  7,8},

                {3,4,  1,2},
                {5,6,  9,8}
        };

        int[][] intervalos = {
                {0, 0},
                {0, 2},
                {2, 0},
                {2, 2}
        };

        for (int[] rangos: intervalos) {
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    System.out.print(nums[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
