package abstract1;

public class AnimalSoundMain4 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();
        Pig pig = new Pig();

        AbstractAnimal[] animalArr = {dog, cat, cow, pig};

        for (AbstractAnimal animal : animalArr) {
            soundAnimal(animal);
        }

        // AbstractAnimal animal = new AbstractAnimal();
    }

    private static void soundAnimal(AbstractAnimal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}