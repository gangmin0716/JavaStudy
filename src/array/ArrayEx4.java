package array;
import java.util.Scanner;

public class ArrayEx4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numList = new int[5];
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            int num1 = sc.nextInt();
            numList[i] = num1;
        }

        for (int i = 0; i < numList.length; i++) sum += numList[i];
        int avg = sum / 5;

        System.out.println("sum: " + sum);
        System.out.println("avg: " + avg);
    }
}
