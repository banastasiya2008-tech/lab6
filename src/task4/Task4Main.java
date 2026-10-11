package task4;

import java.util.Arrays;

public class Task4Main {
    public static void main(String[] args) {
        Car cheap = new Car(10000, 2015, 100);
        Car expensive = new Car(20000, 2015, 100);
        Car newer = new Car(10000, 2020, 100);
        Car stronger = new Car(10000, 2015, 150);

        System.out.println(cheap.compareTo(expensive)); //  1 (дешевша - "більша")
        System.out.println(expensive.compareTo(cheap)); // -1
        System.out.println(newer.compareTo(cheap));     //  1 (новіша - "більша")
        System.out.println(stronger.compareTo(cheap));  //  1 (потужніша - "більша")
        System.out.println(cheap.compareTo(new Car(10000, 2015, 100))); // 0

        Car[] cars = {expensive, cheap, stronger, newer};
        Arrays.sort(cars); // від "найменшого" до "найбільшого"
        for (Car c : cars) {
            System.out.println(c);
        }
    }
}