package array;

public class ArrayEx7 {
    public static void main(String[] args) {

        int[][] arr = new int[5][5];

        for (int i = 0; i < 5; i++) {
            arr[i][2] = 1; // index 2 = 3번째 열
        }

        for (int i = 0; i < 5; i++) {
            System.out.print("[");
            for (int j = 0; j < 5; j++) {
                System.out.print(arr[i][j]);
                if (j < 4) System.out.print(", ");
            }
            System.out.println("]");
        }
    }
}