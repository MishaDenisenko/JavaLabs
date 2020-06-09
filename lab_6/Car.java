package lab_6;

import java.util.Objects;

public class Car {

    public String carModel;
    public int carPrice;
    public int fuelWaste;
    public int maxSpeed;
    public String carColor;
    private int carNumber; // это поле добавленно для 7-ой лабораторной

    public Car(int carNumber) {
        this.carNumber = carNumber;
    }

    public Integer getWaste() {
        return fuelWaste;
    }

    // эти методы добавленны для 7-ой лабораторной

    @Override
    public String toString() {
        return "\nМарка и модель авто: " + carModel +
                ",\nцена - " + carPrice + " грн."+
                ",\nрасход топлива - " + fuelWaste+ " л/100км" +
                ",\nмаксимальная скорость - " + maxSpeed + " км/ч" +
                ",\nцвет - " + carColor + "\nномер серии - " + carNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return carNumber == car.carNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(carNumber);
    }
}
