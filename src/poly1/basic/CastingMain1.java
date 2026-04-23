package poly1.basic;

public class CastingMain1 {
    public static void main(String[] args) {

        System.out.println("다운캐스팅");
        Parent poly1 = new Child();
        // poly1.childMethod();
        Child child1 = (Child) poly1;
        child1.childMethod();

        System.out.println("일시적 다운캐스팅");
        Parent poly2 = new Child();
        ((Child) poly2).childMethod();

        System.out.println("업캐스팅");
        Child child2 = new Child();
        Parent parent1 = (Parent) child2;
        Parent parent2 = child2;
        parent1.parentMethod();
        parent2.parentMethod();

        System.out.println("다운캐스팅 런타임 오류");
        Parent parent3 = new Child();
        Child child3 = (Child) parent3;
        child3.childMethod();
        Parent parent4 = new Parent();
        Child child4 = (Child) parent4;
        child4.childMethod();
    }
}