package rifki.rahmattullah.data;

public class Company {

    private  String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // inner Class
    public class Employee {

        private String name;

        // Mengakses Outer Class
        public String getCompany() {
            return Company.this.getName();
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}