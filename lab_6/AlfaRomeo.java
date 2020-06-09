package lab_6;

public class AlfaRomeo extends Car {

    public AlfaRomeo(String carModel, int carPrice, int fuelWaste, int maxSpeed, String carColor) {
        super(11); // это поле для 7-ой лабораторной
        this.carModel = carModel;
        this.carPrice = carPrice;
        this.fuelWaste = fuelWaste;
        this.maxSpeed = maxSpeed;
        this.carColor = carColor;
    }
}
