// Nama Package
package rifki.rahmattullah.data;

import java.util.Objects;

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

    // Contoh Override Method toString()
    public String toString(){
        return "Product name: " + name + ", price: " + price;
    }



    // Meng-Override Equals Method ketika membuat class
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (price != product.price) return false;
        return Objects.equals(name, product.name);
    }

    // Meng-Override hashCode
    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + price;
        return result;
    }


    //    public boolean equals(Object o){
//        if (o == this){
//            return true;
//        }
//
//        if (!(o instanceof Product)){
//            return false;
//        }
//
//        Product product = (Product) o;
//
//        if (this.price != product.price){
//            return false;
//        }
//
//        if (this.name != null){
//            return this.name.equals(product.name);
//        }else {
//            return product.name == null;
//        }
//    }
}
