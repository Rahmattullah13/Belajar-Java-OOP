class VicePresident extends Manager {

    VicePresident(String company){
        super(company);
    }

    void sayHello(String name) {
        System.out.println("Hello " + name + ", My name is " + this.name + " as a Vice President");
    }
}