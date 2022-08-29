package rifki.rahmattullah.application;

import rifki.rahmattullah.data.LoginRequest;

public class RecordApp {
    public static void main(String[] args) {

        LoginRequest loginRequest = new LoginRequest("Rifki", "secretpassword");

        // untuk mengakses datanya
        System.out.println(loginRequest.username());
        System.out.println(loginRequest.password());
        System.out.println(loginRequest);

        // Mengakses Record Class Constructor
        System.out.println(new LoginRequest());
        System.out.println(new LoginRequest("Hasby"));
        System.out.println(new LoginRequest("Hasby", "rahasia"));
    }
}
