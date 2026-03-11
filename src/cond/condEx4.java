package cond;
import java.util.Scanner;
public class condEx4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int USD = sc.nextInt();
        int KRW = USD * 1460;
        if (USD < 0 ) {
            System.out.println("잘못된 금액입니다.");
        } else if (USD == 0) {
            System.out.println("환전할 금액이 없습니다.");
        } else {
            System.out.println("환전 금액은" + KRW + "원입니다.");
        }
    }
}
