package rifki.rahmattullah.application;

import rifki.rahmattullah.data.LoginRequest;
import rifki.rahmattullah.error.ValidationException;
import rifki.rahmattullah.utils.ValidationUtil;

public class ValidationApp {
    public static void main(String[] args) {

        LoginRequest loginRequest = new LoginRequest(null, null);

        // Cara menggunakan try-catch
        try {
            ValidationUtil.validate(loginRequest);
            System.out.println("Data Valid");
        } catch (ValidationException | NullPointerException exception) {
            System.out.println("Terjadi Error dengan pesan : " + exception.getMessage());
            // Contoh menggunakan keyword finally
        } finally {
            System.out.println("Selalu di eksekusi");
        }

        LoginRequest loginRequest2 = new LoginRequest(null, null);
        ValidationUtil.validateRuntime(loginRequest2);
    }
}
