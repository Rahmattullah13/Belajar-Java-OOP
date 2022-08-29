package rifki.rahmattullah.data;

// Contoh Interface, kita wajib meng-override semua method nya.
public class Avanza implements Car{

    public void drive() {
        System.out.println("Avanza drive");
    }

    public int getTier() {
        return 4;
    }

    public String getBrand() {
        return "Toyota";
    }

    public boolean isMaintenance() {
        return false;
    }
}
