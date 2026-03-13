package Loop;

import java.util.Scanner;

public class LoopEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i = 0;

        while (i < 5) {
            System.out.println(num++);
            i++;
        }

        for(i = 0, num = sc.nextInt(); i < 5; i++) {
            System.out.println(num++);
        }
    }
}
