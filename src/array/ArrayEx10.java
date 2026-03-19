package array;
import java.util.Scanner;

public class ArrayEx10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] names = new String[10];
        int[] prices = new int[10];
        int count = 0;

        while (true) {
            System.out.println("\n1. 상품 등록 | 2. 상품 목록 | 3. 종료");
            System.out.print("선택: ");
            int choice = sc.nextInt();

            if (choice == 1) {
                if (count >= 10) {
                    System.out.println("더 이상 등록할 수 없습니다.");
                    continue;
                }

                System.out.print("상품 이름: ");
                String name = sc.next();
                System.out.print("가격: ");
                int price = sc.nextInt();

                names[count] = name;
                prices[count] = price;
                count++;

                System.out.println("상품 등록 완료!");

            } else if (choice == 2) {
                if (count == 0) {
                    System.out.println("등록된 상품이 없습니다.");
                    continue;
                }

                System.out.println("\n[상품 목록]");
                for (int i = 0; i < count; i++) {
                    System.out.println(names[i] + " - " + prices[i] + "원");
                }

            } else if (choice == 3) {
                System.out.println("프로그램 종료");
                break;
            } else {
                System.out.println("잘못된 입력입니다.");
            }
        }

        sc.close();
    }
}