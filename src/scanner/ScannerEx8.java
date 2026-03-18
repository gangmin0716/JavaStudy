package scanner;
import java.util.Scanner;

public class ScannerEx8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }

        System.out.print("`");
        for (int i = num1; i <= num2; i++){
            System.out.print(i + ",");
        }
        System.out.print("`");
    }
}
