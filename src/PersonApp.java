public class PersonApp {
    /**
     * Membuat Object
     * - Object adalah hasil dari instansiasi dari sebuah class.
     * - Untuk membuat Object kita bisa menggunakan kata kunci new, dan diikuti dengan nama Class dan tanda kurung().
     */

    public static void main(String[] args) {
        /**
         * Memanipulasi Field
         * - Field yg ada di Object, bisa kita manipulasi. Tergantung final atau bukan.
         * - Jika final, berarti kita tidak bisa mengubah data field nya,
         * namun jika tidak, kita bisa mengubah field nya
         * - Untuk memanipulasi data field, sama seperti cara pada variable.
         * - Untuk mengakses field, kita butuh kata kunci .(titik) setelah nama object dan diikuti nama fieldnya.
         */
        var person1 = new Person("Rifki", "Cirebon");
        // person1.country = "Swiss"; // ERROR

        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);

        person1.sayHello("Hardlan");

        Person person2 = new Person("Hasby");

        Person person3;
        person3 = new Person();
        person3.name = "Agifa";
        person3.sayHello("Hardlan");
    }
}
