package Loop;

public class LoopEx11 {
    public static void main(String[] args) {
//        for (int i = 4; i > 0; i--) {
//            for (int j = 0; j < i; j++) {
//                System.out.print(i + " ");
//            }
//            System.out.println();
//        }
        for (int i = 4; i > 0; i--) {
            System.out.println((i + " ").repeat(i));
        }
    }
}
