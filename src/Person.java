/**
 * Membuat Class
 * - Untuk membuat class, kita bisa menggunakan kata kunci class.
 * - Penamaan class biasa menggunakan format CamelCase.
 */

class Person {
    /**
     * FIELD
     * - Field/Properties/Atrribute adalah data yang bisa kita sisipkan kedalama Object.
     * - Namun sebelum kita bisa memasukkan data di fields,
     * kita harus mendeklarasikan data apa yang kita dimiliki Object tersebut didalam deklarasi class-nya.
     * - Membuat field sama seperti membuat variable, namun ditempatkan di block class.
     */
    String name;
    String address;
    final String country = "Indonesia";

    Person(String Name, String Address){
        this.name = Name;
        this.address = Address;
    }

    Person(String paramName){
        this(paramName,null);
    }

    Person(){
        this(null);
    }

    void sayHello(String Name) {
        System.out.println("Hello " + Name + ", My name is " + this.name);
    }

}
