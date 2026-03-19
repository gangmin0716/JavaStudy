package array;

import java.util.Scanner;

public class ArrayEx3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numList = new int[5];
        for (int i = 0; i < 5; i++) {
            int num = sc.nextInt();
            numList[i] = num;
        }
        for (int i = numList.length - 1; i >= 0; i--) {
            System.out.print(numList[i]);
            if (i != 0) {
                System.out.print(",");
            }
        }
    }
}
