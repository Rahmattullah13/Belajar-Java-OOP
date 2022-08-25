public class PolymorphismApp {
    public static void main(String[] args) {

        Employee employee = new Employee("Rifki");
        employee.sayHello("Hasby");

        employee = new Manager("Rifki");
        employee.sayHello("Hasby");

        employee =  new VicePresident("Rifki");
        employee.sayHello("Hasby");

        sayHello(new Employee("Rifki"));
        sayHello(new Manager("Fikri"));
        sayHello(new VicePresident("Hardlan"));
    }

    static void sayHello(Employee employee){
        System.out.println("Hello " + employee.name);
    }
}
