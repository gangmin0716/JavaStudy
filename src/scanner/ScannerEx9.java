package scanner;
import java.util.Scanner;

public class ScannerEx9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int total = 0; // 총 금액

        while (true) {
            System.out.println("\n1: 상품 입력, 2: 결제, 3: 종료");
            int option = scanner.nextInt();

            if (option == 1) {
                // 상품 입력
                System.out.print("상품명: ");
                String name = scanner.next();

                System.out.print("가격: ");
                int price = scanner.nextInt();

                System.out.print("수량: ");
                int quantity = scanner.nextInt();

                total += price * quantity;
                System.out.println(name + " 추가 완료!");

            } else if (option == 2) {
                // 결제
                System.out.println("총 비용: " + total + "원");
                total = 0; // 초기화

            } else if (option == 3) {
                // 종료
                System.out.println("프로그램 종료");
                break;

            } else {
                System.out.println("잘못된 입력입니다.");
            }
        }

        scanner.close();
    }
}
