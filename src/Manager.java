class Manager extends Employee{

    String company;

    Manager(String name){
        super(name);
    }

    Manager(String name, String Company){
        super(name);
        this.company = company;
    }

    void sayHello(String name) {
        System.out.println("Hello " + name + ", My name is " + this.name + " as a Manager");
    }
}