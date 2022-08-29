package rifki.rahmattullah.application;

import rifki.rahmattullah.annotation.Fancy;
import rifki.rahmattullah.data.Animal;
import rifki.rahmattullah.data.Cat;

/**
 * Jadi kalo kita ingin memaksa semua turunannya memiliki method tersebut
 * kita tinggal bikin abstract method di abstract class nya.
 */

@Fancy(name = "AnimalApp", tags = {"Application", "Java"})
public class AnimalApp {
    public static void main(String[] args) {

        Animal animal = new Cat();
        animal.name = "Puss";
        animal.run();
    }
}
