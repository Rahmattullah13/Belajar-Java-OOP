public class ManageraApp {
    public static void main(String[] args) {

        var manager =  new Manager("Gojek");
        manager.name = "Rifki";
        manager.sayHello("Hasby");

        var vp = new VicePresident("Gojek");
        vp.name = "Agifa";
        vp.sayHello("Hasby");
    }
}
