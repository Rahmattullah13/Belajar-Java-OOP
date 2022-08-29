package rifki.rahmattullah.application;

import rifki.rahmattullah.data.Customer;
import rifki.rahmattullah.data.Level;

// Mengakses Enum Class
public class EnumApp {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setName("Rifki");
        customer.setLevel(Level.VIP);

        System.out.println(customer.getName());
        System.out.println(customer.getLevel());
        System.out.println(customer.getLevel().getDescription());

        // Mengkonversi dari Enum ke String
        String levelName = Level.VIP.name();
        System.out.println(levelName);

        Level level = Level.valueOf("STANDARD");
        System.out.println(level);

        System.out.println("PRINT LEVEL!!!");

        // Mengambil semua opsi Enum
        for (var value : Level.values()) {
            System.out.println(value);
        }
    }

}
