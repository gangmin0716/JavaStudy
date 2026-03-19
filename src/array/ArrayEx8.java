package array;

public class ArrayEx8 {
    public static void main(String[] args) {
        int[][] arr = new int[9][9];

        for (int i = 0; i < 9; i++){
            for (int j = 0; j < 9; j++) {
                arr[i][j] = (i + 1) * (j + 1);
            }
        }

        for (int i = 0; i < 9; i++) {
            System.out.print("[");
            for (int j = 0; j < 9; j++){
                System.out.print(arr[i][j]);
                if (j < 8) System.out.print(", ");
            }
            System.out.println("]");
        }
    }
}
