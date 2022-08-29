package rifki.rahmattullah.data;

// Contoh Interface dan Multi Interface
public interface Car extends HasBrand, IsMaintenance{

    void drive();

    int getTier();

    // Contoh Default Method
    default boolean isBig(){
        return false;
    }
}
