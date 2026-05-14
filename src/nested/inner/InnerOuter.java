package nested.inner;

public class InnerOuter {
    private static int outClassValue = 3;
    private int outInstanceValue = 2;

    class Inner {
        private int innerInstanceValue = 1;

        public void print() {
            // 1. 자신의 멤버에 접근
            System.out.println(innerInstanceValue);

            // 2. 바깥 클래스의 인스턴스 멤버에 접근 가능 (static이 없어서 가능)
            System.out.println(outInstanceValue);

            // 3. 바깥 클래스의 클래스 멤버(static)에 접근 가능
            System.out.println(InnerOuter.outClassValue);
        }
    }
}