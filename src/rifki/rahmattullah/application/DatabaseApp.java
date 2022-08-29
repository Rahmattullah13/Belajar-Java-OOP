package rifki.rahmattullah.application;

import rifki.rahmattullah.error.DatabaseError;

public class DatabaseApp {
    public static void main(String[] args) {
        connectDatabase("Rifki", "secret");
        System.out.println("Sukses");
    }

    // Jika terjadi Error akan dieksekusi
    public static void connectDatabase(String username, String password){
        if(username == null || password == null) {
            throw new DatabaseError("Tidak bisa conect ke database");
        }
    }
}
