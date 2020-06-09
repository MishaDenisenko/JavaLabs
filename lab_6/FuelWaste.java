package lab_6;

import java.util.Comparator;

public class FuelWaste implements Comparator<Car> {
    public int compare(Car a, Car b) {
    return a.getWaste().compareTo(b.getWaste());
    }
}
