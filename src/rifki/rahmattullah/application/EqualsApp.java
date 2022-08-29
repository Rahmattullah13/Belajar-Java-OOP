package rifki.rahmattullah.application;

public class EqualsApp {
    public static void main(String[] args) {

        String first = "Rifki";
        first = first + " " + "Rahmattullah";

        System.out.println(first);

        String second = "Rifki Rahmattullah";
        System.out.println(second);

        // Perbandingan pakai ==
        System.out.println(first == second); // Result: False
        System.out.println(first.equals(second)); // Result: True

        /**
         * Hasilnya true, karena walaupun object nya beda tetapi
         * di Java itu mengoptimasi memory jadi, jika isi nya String nya sama
         * maka dia tidak akan membuat ulang datanya dimemory, jadi dia akan mengarah ke object yang sudah ada.
         */
        String third = "Rifki Rahmattullah";
        System.out.println(second == third);
        System.out.println(second.equals(third));
    }
}
