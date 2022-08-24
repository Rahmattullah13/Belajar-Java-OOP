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

    Person(String paramName, String paramAddress){
        name = paramName;
        address = paramAddress;
    }

    void sayHello(String paramName) {
        System.out.println("Hello " + paramName + ", My name is " + name);
    }

}
