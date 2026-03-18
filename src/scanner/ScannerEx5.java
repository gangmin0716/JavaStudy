package scanner;
import java.util.Scanner;

public class ScannerEx5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while (true) {
            int num = sc.nextInt();

            sum += num;
            if (num == 0) {
                System.out.println(sum);
                break;
            }
        }
    }
}
