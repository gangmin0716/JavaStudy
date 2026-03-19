package array;
import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;

public class ArrayEx6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ea = sc.nextInt();
        int[] numList = new int[ea];
        for (int i = 0; i < ea; i++) {
            int num = sc.nextInt();

            numList[i] = num;
        }
        Arrays.sort(numList);
        System.out.println("가장 작은수: " + numList[0]);
        System.out.println("가장 큰수: " + numList[ea - 1]);
    }
}
