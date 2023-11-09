package homework8;

import static homework8.LoginValidator.validateLoginAndPassword;

public class Main {
    public static void main(String[] args) {
        String login = "admin";
        String password = "12345qwerty";
        String confirmPassword = "12345qwerty";

        boolean isValid = validateLoginAndPassword(login, password, confirmPassword);

        if (isValid) {
            System.out.println("Registration is successful!");
        } else {
            System.out.println("Registration failed.");
        }
    }

}
