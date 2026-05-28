//package exception.ex1;
//
//import java.io.FileInputStream;
//import java.io.InputStreamReader;
//
//class A {
//    protected Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }
//}
//
//public class CheckedException {
//    public static void main(String[] args) {
//
//        // InterruptedException
//        Thread.sleep(1000);
//
//        // ClassNotFoundException
//        Class cls = Class.forName("java.lang.Object");
//
//        // IOException
//        InputStreamReader in = new InputStreamReader(System.in);
//        in.read();
//
//        // FileNotFoundException
//        FileInputStream fis = new FileInputStream("text.txt");
//
//        // CloneNotSuppotedException
//        A a1 = new A();
//        A a2 = (A) a1.clone();
//    }
//}