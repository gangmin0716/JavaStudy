package operator;


public class OperationEx5 {
    public static void main(String[] args) {
        int a = 1;
        String x = a % 2 == 1 ? "홀수" : "짝수";
        System.out.println("x = " +a % 2+", " + x);
    }
}
