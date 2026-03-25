package test1;
import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int start = Math.min(num1, num2);
        int end = Math.max(num1, num2);

        int sum = 0;
        int count = 0;

        for (int i = start; i <= end; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
                count++;
            }
        }
        double avg = (double) sum / count;

        System.out.println("sum : " + sum);
        System.out.printf("avg : %.1f", avg);
    }
}
