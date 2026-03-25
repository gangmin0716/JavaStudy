package test1;
import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int su = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                System.out.print(su + " ");

                su += 2;
                if (su > 9) {
                    su = 1;
                }
            }
            System.out.println();
        }
    }
}