package interface2;

import interface1.InterfaceAnimal;

public class Pig extends AbstractAnimal {

    @Override
    public void sound() {
        System.out.println("꿀꿀");
    }

    @Override
    public void move() {
        System.out.println("돼지 이동");
    }

    @Override
    public void introduce() {
        System.out.println("저는 돼지입니다. 눈은 " + DEFAULT_EYE_COUNT + "개를 가지고 있습니다.");
        System.out.println("똑똑하고 깨끗한 동물입니다.");
    }
}