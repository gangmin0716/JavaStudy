package Loop;

import java.util.Scanner;

public class LoopEx4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int sum = 0;
        int i = 0;

        while(true){
            if (i == a){
                break;
            }
            i++;
            sum += i;
            System.out.print(sum + " ");
        }
        System.out.println();

        for (i = 1, sum = 0; i <= a; i++) {
            sum += i;
            System.out.print(sum + " ");
        }

    }
}
