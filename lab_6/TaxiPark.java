package lab_6;

import java.util.Arrays;
import java.util.Scanner;

public class TaxiPark extends Car {

    public Car[] taxiPark;
    private int parkPrice;
    private String indeX;

    public TaxiPark(Car[] taxiPark) {
        super(1);
        this.taxiPark = taxiPark;
    }

    @Override
    public String toString() {
        StringBuilder taxiCar = new StringBuilder();
        for (Car car : taxiPark) {
            taxiCar.append(car.toString());
        }
        return taxiCar.toString();
    }

    public void sortByWaste() {
        FuelWaste carComparator = new FuelWaste();
        Arrays.sort(taxiPark, carComparator);

        for (Car car : taxiPark) {
            System.out.println(car);
        }
    }

    public void taxiParkPrice(){
        for (int i = 0; i < taxiPark.length; i++) {
            parkPrice += taxiPark[i].carPrice;
        }
        System.out.println("\nЦена таксопарка - " + parkPrice);
    }

    public void speedIndex() {
        Scanner st = new Scanner(System.in);
        System.out.println("\nВведите показатель скорости машины: ");

        indeX = st.nextLine();
        if (indeX.length() == 0) {
            System.out.println("\nВы ввели пустую строку.");
        }

        else {
            try {
                int speed = Integer.parseInt(indeX);
                int s = 0;
                String[] speedlist = new String[8];
                for (int i = 0; i < taxiPark.length; i++) {
                    if (speed == taxiPark[i].maxSpeed){
                        speedlist[s] = taxiPark[i].carModel;
                        s+=1;
                    }
                }
                if (s == 0){
                    System.out.println("Авто с такой макс.скоростью не найдены..");
                }
                else {
                    System.out.println("\nПод такие параметры подпадают такие авто:");
                    for (int i = 0; i < s; i++) {
                        System.out.println((i+1) + ") " +speedlist[i]);
                    }
                }
            }
            catch (NumberFormatException nfe){
                System.out.println("Попробуйте еще раз. Введите, пожалуйста, цифры.");
                indeX = st.nextLine();
            }
        }
    }
}