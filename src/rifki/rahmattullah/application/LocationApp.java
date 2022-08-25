package rifki.rahmattullah.application;

import rifki.rahmattullah.data.City;

// Contoh penggunaan Abstract Class
public class LocationApp {
    public static void main(String[] args) {

//        var location = new Location(); // ERROR
        var city = new City();
        city.name = "Cirebon";

        System.out.println(city.name);
    }
}
