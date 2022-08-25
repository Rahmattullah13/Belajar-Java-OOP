// Nama Package
package rifki.rahmattullah.data;

// Bisa diakes dimana saja.
public class Product {

    // bisa diakses dimana saja
    public String name;
    public int price;

    // Hanya bisa diakses dipackage data saja.
//    protected String name;
//    protected int price;

    public Product(String name, int price){
        this.name = name;
        this.price = price;
    }
}
