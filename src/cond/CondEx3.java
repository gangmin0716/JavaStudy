package cond;
import java.util.Scanner;

public class CondEx3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();

        if (M <= 1) {
            System.out.println("도보");
        } else if (M <= 10) {
            System.out.println("자전거");
        } else if (M <= 100) {
            System.out.println("자동차");
        } else {
            System.out.println("비행기");
        }
    }
}
