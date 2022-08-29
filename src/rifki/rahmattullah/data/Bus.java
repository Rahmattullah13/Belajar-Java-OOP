package rifki.rahmattullah.data;

public class Bus implements Car{

    public void drive() {
        System.out.println("Bus Drive");
    }

    public int getTier() {
        return 8;
    }

    public String getBrand() {
        return "HINO";
    }

    public boolean isMaintenance() {
        return false;
    }


    // Override Default Method
    public boolean isBig() {
        return true;
    }
}
