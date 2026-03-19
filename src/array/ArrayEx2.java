package array;
import java.util.Scanner;

public class ArrayEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numList = new int[5];
        for (int i = 0; i < 5; i++) {
            int num = sc.nextInt();
            numList[i] = num;
        }
        for (int i = 0; i < numList.length; i++) {
            System.out.print(numList[i]);
            if (i == 4) {
                break;
            } else {
                System.out.print(",");
            }
        }
    }
}
