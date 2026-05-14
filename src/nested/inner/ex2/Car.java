package nested.inner.ex2;

public class Car {
    private String model;
    private int chargeLevel;
    private Engine engine;

    public Car(String model, int chargeLevel) {
        this.model = model;
        this.chargeLevel = chargeLevel;
        this.engine = new Engine(); // 이제 this를 넘길 필요가 없어요!
    }

    public void start() {
        engine.start();
        System.out.println(model + " 시작 완료");
    }

    // 내부 클래스로 변경
    private class Engine {
        public void start() {
            // 바깥 클래스의 private 변수에 직접 접근! (Getter가 필요 없음)
            System.out.println("충전 레벨 확인: " + chargeLevel);
            System.out.println(model + "의 엔진을 구동합니다.");
        }
    }
}