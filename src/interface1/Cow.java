package interface1;

public class Cow implements InterfaceAnimal {

    @Override
    public void sound() {
        System.out.println("음매");
    }

    @Override
    public void move() {
        System.out.println("소 이동");
    }

    @Override
    public void introduce() {
        System.out.println("저는 소입니다. 눈은 " + DEFAULT_EYE_COUNT + "개를 가지고 있습니다.");
        System.out.println("온순하고 힘이 센 동물입니다.");
    }
}