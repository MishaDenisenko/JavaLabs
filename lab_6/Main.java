package lab_6;

//C13 = 9

public class Main {
    public static void main(String[] args) {

        Car carM1 = new Mercedes(
                "Mercedes-Benz E 220 d4 MATIC",
                1552000,
                5,
                239,
                "черный");

        Car carM2 = new Mercedes(
                "Mercedes-Benz E 200 4MATIC",
                1470000,
                7,
                232,
                "белый");

        Car carB1 = new BMW("BMW 520i",
                1614000,
                5,
                234,
                "матово-серый");

        Car carB2 = new BMW("BMW 540i xDrive",
                2185000,
                6,
                250,
                "серебристый");

        Car carB3 = new BMW("BMW 520d xDrive",
                1819000,
                4,
                232,
                "темно-синий");

        Car carA1 = new AlfaRomeo("Alfa Romeo Giulia",
                839000,
                5,
                230,
                "рубиновый");

        Car carA2 = new AlfaRomeo("Alfa Romeo Giulietta",
                569900,
                5,
                218,
                "светло-бежевый");

        Car carF1 = new Ford("FORD MUSTANG",
                1312000,
                9,
                234,
                "грязно-оранжевый");

        TaxiPark taxiPark = new TaxiPark(new Car[]{
                carA1,
                carF1,
                carB2,
                carB1,
                carM2,
                carB3
        });

        System.out.println("Список машин такси, отсортированный по расходу топлива:");
        taxiPark.sortByWaste();

        taxiPark.taxiParkPrice();

        taxiPark.speedIndex();
    }
}

