package homework8;

public class LoginValidator {
    public static boolean validateLoginAndPassword(String login, String password, String confirmPassword) {
        try {
            if (login.length() >= 20 || login.contains(" ")) {
                throw new WrongLoginException("The login must be less than 20 characters and contain no spaces");
            }

            if (password.length() >= 20 || password.contains(" ") || !password.matches(".*\\d.*")) {
                throw new WrongPasswordException("The password must be less than 20 characters, contain no spaces and contain at least one digit");
            }

            if (!password.equals(confirmPassword)) {
                throw new WrongPasswordException("Password and password confirmation do not match");
            }

            return true;
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println("Error: " + e.getMessage());
            return false;
        }

    }
}