package cond;
import java.util.Scanner;

public class CondEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int record = sc.nextInt();

        if (record >= 90) {
            System.out.println("A");
        } else if (record >= 80) {
            System.out.println("B");
        } else if (record >= 70) {
            System.out.println("C");
        } else if (record >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}
