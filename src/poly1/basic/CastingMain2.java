package poly1.basic;

public class CastingMain2 {
    public static void main(String[] args) {
        Parent parent1 = new Parent();
        System.out.println("parent1 호출");
        String result1 = call1(parent1);
        String result2 = call2(parent1);
        compareResult(result1);
        compareResult(result2);

        Parent parent2 = new Child();
        System.out.println("parent2 호출");
        String result3 = call1(parent2);
        String result4 = call2(parent2);
        compareResult(result3);
        compareResult(result4);

        Child child1 = null;
        System.out.println(child1 instanceof Child);
    }

    private static String call1(Parent parent) {
        parent.parentMethod();
        if (parent instanceof Child) {
            Child child = (Child) parent;
            child.childMethod();
            return "Child 인스턴스 맞음";
        } else {
            return "Child 인스턴스 아님";
        }
    }

    private static String call2(Parent parent) {
        parent.parentMethod();
        if (parent instanceof Child child) {
            child.childMethod();
            return "Child 인스턴스 맞음";
        } else {
            return "Child 인스턴스 아님";
        }
    }

    private static void compareResult(String result) {
        System.out.println(result);

        if (result.equals("Child 인스턴스 맞음")) {
            System.out.println("정확히 'Child 인스턴스 맞음'");
        }

        if (result.contains("Child")) {
            System.out.println("'Child'라는 단어가 포함됨");
        }

        if (result.equals("Child")) {
            System.out.println("정확히 'Child'");
        } else {
            System.out.println("'Child'와 정확히 같지는 않음");
        }

        System.out.println();
    }
}