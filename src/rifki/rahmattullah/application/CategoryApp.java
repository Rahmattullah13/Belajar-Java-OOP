package rifki.rahmattullah.application;

import rifki.rahmattullah.data.Category;

public class CategoryApp {
    public static void main(String[] args) {

        var category = new Category();
        category.setId("ID");
        // Null akan diskip
        category.setId(null);

        System.out.println(category.getId());
    }
}
