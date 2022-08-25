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

    // Type Check and Casts
    static void sayHello(Employee employee){
        if (employee instanceof  VicePresident){
            VicePresident vicePresident = (VicePresident) employee;
            System.out.println("Hello VP " + vicePresident.name);
        } else if (employee instanceof  Manager) {
            Manager manager = (Manager) employee;
            System.out.println("Hello Manager " + manager.name);
        }else {
            System.out.println("Hello " + employee.name);
        }
    }
}
