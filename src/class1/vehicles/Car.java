package class1.vehicles;

import java.util.Date;

public class Car {

    private String brand;
    private String model;
    private Date manufactureDate;
    private Engine engine;

    public Car(String brand, String model, Date manufactureDate, String engineType, int horsepower) {
        this.brand = brand;
        this.model = model;
        this.manufactureDate = manufactureDate;
        this.engine = new Engine(engineType, horsepower);
    }

    public void displayCarInfo() {

        System.out.println("브랜드: " + brand);
        System.out.println("모델: " + model);
        System.out.println("제조일자: " + manufactureDate);
        engine.displayEngineInfo();
    }

    public void startCar() {

        engine.startEngine();
        System.out.println(model + " 차량이 출발합니다.");
    }
}