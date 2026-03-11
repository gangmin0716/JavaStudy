package cond;
import java.util.Scanner;
public class CondEx7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int month = sc.nextInt();
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> System.out.println("31");
            case 4, 6, 9, 11 -> System.out.println("30");
            case 2 -> System.out.println("28");
            default -> System.out.println("잘못된 입력입니다.");
        }
    }
}
