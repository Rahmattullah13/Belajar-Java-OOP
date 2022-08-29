package rifki.rahmattullah.application;

// Contoh static import
import static rifki.rahmattullah.data.Application.PROCESSORS;
import static rifki.rahmattullah.data.Constant.*;
import rifki.rahmattullah.data.Country;
import rifki.rahmattullah.utils.MathUtil;

public class StaticApp {
    public static void main(String[] args) {

        // Contoh mengakses static variable dan static import
        System.out.println(APPLICATION);
        System.out.println(VERSION);

        // Contoh mengakses static method
        System.out.println(
                MathUtil.sum(1,1,1,1,1)
        );

        // Contoh mengakses static inner class
        Country.City city = new Country.City();
        city.setName("Cirebon");

        System.out.println(city.getName());

        // Contoh mengakses static block dan static import
        System.out.println(PROCESSORS);
    }
}
