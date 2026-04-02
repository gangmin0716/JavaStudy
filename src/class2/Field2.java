package class2;

public class Field2 {

    private boolean bool;
    private int num1;
    private double num2;
    private String str;

    public void printFieldValue() {
        System.out.println(bool);
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(str);
    }

    public void printLocalValue() {
        int num;
        // System.out.println(num); // 지역변수는 초기화 안하면 오류
    }

    public static void main(String[] args) {
        Field2 field2 = new Field2();
        field2.printFieldValue();
        field2.printLocalValue();
    }
}