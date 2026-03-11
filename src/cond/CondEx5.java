package cond;
import java.util.Scanner;

public class CondEx5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double rating = sc.nextDouble();

        if (rating >= 9) {
            System.out.println("어바웃타임 - 평점9");
        } if (rating >= 8) {
            System.out.println("토이 스토리 - 평점8");
        } if (rating >= 7) {
            System.out.println("고질라 - 평점7");
        } else {
            System.out.println("평점이 낮은 영화입니다.");
        }
    }
}
