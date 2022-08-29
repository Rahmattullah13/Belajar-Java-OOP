package rifki.rahmattullah.application;

import rifki.rahmattullah.data.CreateUserRequest;
import rifki.rahmattullah.utils.ValidationUtil;

public class ReflectionApp {
    public static void main(String[] args) {

        CreateUserRequest request = new CreateUserRequest();
        request.setUsername("Rifki");
        request.setPassword("secret");
        request.setName("Rifki Rahmattullah");

        ValidationUtil.validationReflection(request);
    }
}
