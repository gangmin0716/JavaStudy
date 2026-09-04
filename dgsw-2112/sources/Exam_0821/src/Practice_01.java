import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.*;

public class Practice_01 {
    public static void main(String[] args) {
        //Lambda---------------------------------------------------------

        Myfunction my01 = new Myfunction() {
            @Override
            public int max(int a, int b) {
                return a > b ? a : b;
            }
        };

        int max01 = my01.max(1, 2);
        Myfunction my02 = (a, b) -> a > b ? a : b;

        List<String> list = Arrays.asList("a", "b", "c", "d", "e");
        Collections.sort(list, (s1, s2) -> s1.compareTo(s2));

        Myfunction my05 = (s1, s2) -> s1*s2;
        Myfunction my06 = (s1, s2) -> s1+s2;

        //-------------------------------------------------------------------
        IntBinaryOperator max = (a, b) -> a > b ? a : b;
        int num01 = max.applyAsInt(1, 2);

        //---------------------------------------------------------------------
        BiConsumer<String, Integer> bicon01 = (name, i) -> System.out.println(name + "=" + i);

        //---------------------------------------------------------------------
        IntUnaryOperator intU01 = x -> x * x;

        //---------------------------------------------------------------------
        Supplier<Integer> sup01 = () -> (int)(Math.random() * 6);
        IntSupplier sup02 = () -> (int)(Math.random()*6);

        //---------------------------------------------------------------------
        IntPredicate isEven = n -> n % 2 == 0;

        //---------------------------------------------------------------------
        Function<String, String> greet = name -> "Hello, " + name + "!";

        //---------------------------------------------------------------------
        ToIntFunction<int[]> sumAll = arr -> {
            int sum = 0;
            for (int n : arr) sum += n;
            return sum;
        };
        sumAll.applyAsInt(new int[]{1,2,3,4,5});
        //---------------------------------------------------------------------
        BiFunction<String, Integer, String> repeat = (s,n) -> {
            String result = "";
            for (int i = 0; i < n; i++) result += s;
            return result;
        };

        repeat.apply("result", 5);

        //---------------------------------------------------------------------
        Comparator<String> compare = (s1, s2) -> s1.length() - s2.length();

        //---------------------------------------------------------------------
        Predicate<String> isValidPassword = (pw) -> {
            if(pw == null || pw.length() < 8) return false;
            for (char c: pw.toCharArray()) {
                if(Character.isDigit(c)) return true;
            }
            return false;
        };

        /**
         * 리턴형(무조건 1개) 함수이름 ( 매개변수(B, 1개이상) ) { 구현 부 }
         * A, B둘다 없거나 -  Runable, run()
         * A만 있거나 - Supplier
         * B만 있거나 - Consumer (소비만 하는 놈)
         * A, B 둘다 있거나 - Function
         *
         * Predicate - 판단하는 놈.
         * Comparator - 비교하는 놈.
         * Operator - 계산하는놈 (숫자 - int 전용)
         *
         * */
        Predicate<String> testPre = s -> s.length() >= 8;
        String s = "";
        if (testPre.test(s)) {
            //8자 이상
        } else {
            //8자 이하
        }

        List<Integer> _arrList = new java.util.ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        _arrList.forEach(i -> System.out.println(i));

        _arrList.removeIf(x -> x%2 == 0 || x%3 == 0);
        _arrList.forEach( value -> System.out.println(value) );

        // 3. 모든 요소에 10을 곱한뒤에 출력
        _arrList.forEach( x -> System.out.println(x * 10) );

        _arrList.replaceAll( x -> x * 10);
        _arrList.forEach( value -> System.out.println(value) );


        Function<String, Integer> f1 = (s1) -> Integer.parseInt(s1, 16);

        Function<Integer, String> g1 = (i1) -> Integer.toBinaryString(i1);

        Function<String, String> h = f1.andThen(g1);
        h.apply("1000");

        Function<Integer, String> f2 = (s2) -> Integer.toBinaryString(s2);

        Function<String, Integer> g2 = (i2) -> Integer.parseInt(i2, 16);

        Function<Integer, Integer> h2 = g2.compose(f2);


        Predicate<Integer> p10 = i10 -> i10 < 100;
        Predicate<Integer> p11 = i11 -> i11 < 200;
        Predicate<Integer> p12 = i12 -> i12 % 3 == 0;

        Predicate<Integer> notP = p10.negate();

        Predicate<Integer> allP = notP.and(p11).or(p12);

        Predicate<Integer> allNotP = notP.and(p11.or(p12));
        System.out.println(allP.test(2));
        System.out.println(allNotP.test(2));

        Function<String, Integer> func20 = (String s1) -> Integer.parseInt(s1, 10);

        BiFunction<String, String, Boolean> func22 = (s22, s23) -> s22.equals(s23);

        BiFunction<String, String, Boolean> func23 = String :: equals;

        Object obj01 = new Object();
        Predicate<Object> obj02 = (x) -> obj01.equals(x);

        Predicate<Object> obj03 = obj01 :: equals;


        Supplier<MyClass> myClass01 = () -> new MyClass();
        Supplier<MyClass> myClass02 = MyClass::new;
        Function<Integer, MyClass> myClass03 = (myX01) -> new MyClass((myX01));
        Function<Integer, MyClass> myClass04 = MyClass::new;

        Function<Integer, int[]> arr01 = size -> new int[size];
        Function<Integer, int[]> arr02 = int[]::new;

        Function<Integer, Integer> fun44 =x -> Math.abs(x);
        Function<Integer, Integer> fun45 = Math::abs;

        Consumer<String> con01 = x -> System.out.println(x);
        Consumer<String> con02 =  System.out::println;
        con02.accept("3");
    }

    static Integer methodA(String s1) {
        return Integer.parseInt(s1);
    }

}

@FunctionalInterface
interface Myfunction {
    int max(int a, int b);
}

class MyClass {
    public MyClass() {}
    public MyClass(int a) {}
}