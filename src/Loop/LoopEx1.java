package Loop;

public class LoopEx1 {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        System.out.println("while문");
        while (i <= 3) {
            sum += i;
            System.out.println("i=" + i + " sum=" + sum);
            i++;
        }
        System.out.println("for문");
        for (i = 1, sum = 0; i <= 3; i++) {
            sum += i;
            System.out.println("i=" + i + " sum=" + sum);
        }
    }
}
