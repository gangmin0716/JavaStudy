package cond;

import java.util.Scanner;

public class CondEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int item = sc.nextInt();
        int age = sc.nextInt();
        if (item >= 10000) {
            item -= 1000;
        } else if (age <= 10) {
            item -= 1000;
        }
        System.out.println(item);
    }
}
