package super2;

public class B extends A{
    public B(int a) {
        this(a, 0);
        System.out.println("B 생성자 a = " + a);
    }
    public B(int a, int b) {
        super();
        System.out.println("B 생성자 a = " + a + " b = " + b);
    }
}
