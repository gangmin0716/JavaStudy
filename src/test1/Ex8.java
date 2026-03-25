package test1;
import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int step = (a <= b) ? 1 : -1;

        for (int i = 1; i <= 9; i++) {
            for (int j = a; ; j += step) {
                System.out.print(j + " * " + i + " = " + (j * i) + "   ");
                if (j == b) break;
            }
            System.out.println();
        }
    }
}