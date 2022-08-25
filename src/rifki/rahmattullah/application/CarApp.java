package rifki.rahmattullah.application;

import rifki.rahmattullah.data.Avanza;
import rifki.rahmattullah.data.Car;

/**
 * Ideal nya kalau kita ingin membuat Kontrak kita memakai Interface jangan menggunakan Abstract Class.
 * Contoh penggunaan Interface.
 */
public class CarApp {
    public static void main(String[] args) {

        Car car = new Avanza();
        car.drive();
        System.out.println(car.getTier());
    }
}
