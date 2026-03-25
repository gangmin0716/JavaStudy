package test1;
import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int i = 1; i <= a ; i++) {
            for (int j = i; j < i + b ; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
