package rifki.rahmattullah.data;

public record LoginRequest(String username, String password) {

    public LoginRequest{
        System.out.println("Membuat object LoginRequest");
    }

    // Record Class Constructor
    public LoginRequest(String username){
        this(username, "");
    }

    public LoginRequest() {
        this("", "");
    }


}
