package method;

public class MethidCasting1 {
    public static void main(String[] args) {
        double number = 1.5;
        printNumber(number);
        printNumber((int) number);
    }
//    public static void  printNumber(int n) {
//        System.out.println("숫자: "+ n);
//    }

    public static void printNumber(double n) {
        System.out.println("숫자: " + n);
    }
}
