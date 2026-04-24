package interface2;

public class Dog extends AbstractAnimal {

    @Override
    public void sound() {
        System.out.println("멍멍");
    }

    @Override
    public void move() {
        System.out.println("개 이동");
    }

    @Override
    public void introduce() {
        System.out.println("저는 개입니다. 눈은 " + DEFAULT_EYE_COUNT + "개를 가지고 있습니다.");
        System.out.println("충성심이 강하고 사람을 좋아합니다.");
    }
}