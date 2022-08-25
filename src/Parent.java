class Parent {
    String name;
    void doIt(){
        System.out.println("Do it in Parent");
    }
}

class Child extends Parent{
    // Harusnya jangan membuat nama variable yang sama dengan Parent-nya.
    String name;
    void doIt(){
        System.out.println("Do it in Child");
        // Cara mengakses variable Parent
        System.out.println("Parent name is " + super.name);
    }
}
