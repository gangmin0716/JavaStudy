package nested.test;

public class OuterClass4Main {
    public static void main(String[] args) {

        Hello helloInstance = new Hello() {
            @Override
            public void hello() {
                System.out.println("Hello.hello");
            }
        };

        helloInstance.hello();
    }
}