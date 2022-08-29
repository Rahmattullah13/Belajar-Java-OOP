package rifki.rahmattullah.application;

import rifki.rahmattullah.data.Company;

public class CompanyApp {
    public static void main(String[] args) {

        Company company = new Company();
        company.setName("Google");

        // Membuat object Inner Class
        Company.Employee employee = company.new Employee();
        employee.setName("Rifki Rahmattullah");

        System.out.println(employee.getName());
        System.out.println(employee.getCompany());

        Company company2 = new Company();
        company2.setName("Belum ada");

        Company.Employee employee2 = company2.new Employee();
        employee2.setName("Hardlan");

        System.out.println(employee2.getName());
        System.out.println(employee2.getCompany());
    }
}
