class Manager {
    String name;

    String company;

    Manager(String Company){
        this.company = company;
    }

    void sayHello(String name) {
        System.out.println("Hello " + name + ", My name is " + this.name + " as a Manager");
    }
}