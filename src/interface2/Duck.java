package interface2;

public class Duck extends AbstractAnimal implements Fly, Swim {

    @Override
    public void sound() {
        System.out.println("꽥꽥");
    }

    @Override
    public void move() {
        System.out.println("오리 이동");
    }

    @Override
    public void fly() {
        System.out.println("날개를 퍼덕이며 날아갑니다.");
    }

    @Override
    public void swim() {
        System.out.println("물 위에서 헤엄칩니다.");
    }

    @Override
    public void introduce() {
        System.out.println("저는 오리입니다. 눈은 " + DEFAULT_EYE_COUNT + "개를 가지고 있습니다.");
        System.out.println("날 수 있고 수영도 할 수 있습니다.");
    }
}