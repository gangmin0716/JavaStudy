import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        for (int i = 0; i < a; i++) {
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            int d = gcd(num1, num2);
            System.out.println(num1 * num2 / d);
        }
    }

    public static int gcd(int num1, int num2) {
        while(num2 != 0) {
            int r = num1 % num2;

            num1 = num2;
            num2 = r;
        }
        return num1;
    }

}