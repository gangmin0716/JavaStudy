package Loop;
import java.util.Scanner;

public class LoopEx3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i = 0;
        if (num % 2 == 1) {
            num++;
        }
        while(i < 5) {
            System.out.print(num + " ");
            num += 2;
            i++;
        }


        for (i = 0, num = sc.nextInt(); i < 5; i++) {
            if (num % 2 == 1) {
                num++;
            }
            System.out.print(num + " ");
            num += 2;
        }
    }
}
