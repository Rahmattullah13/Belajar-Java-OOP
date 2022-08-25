public class ParentApp {
    public static void main(String[] args) {

        Child child = new Child();
        child.name = "Rifki";
        child.doIt();
        System.out.println(child.name);

        // Variable Hidding
        Parent parent = child;
        parent.doIt();
        System.out.println(parent.name);

    }
}
