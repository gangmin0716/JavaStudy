package array;

import java.util.Scanner;

public class ArrayEx5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Length = sc.nextInt();
        int[] numList = new int[Length];
        int sum = 0;
        for (int i = 0; i < numList.length; i++) {
            int num1 = sc.nextInt();
            numList[i] = num1;
        }

        for (int i = 0; i < numList.length; i++) sum += numList[i];
        int avg = sum / 5;

        System.out.println("sum: " + sum);
        System.out.println("avg: " + avg);
    }
}
