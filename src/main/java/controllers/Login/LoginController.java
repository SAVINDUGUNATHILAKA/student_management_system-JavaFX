package controllers.Login;

public class LoginController {
    public static boolean checkUserNameAndPassword(String username, String password) {
        if (username.equals("nimal") && password.equals("1234")) {
            return true;
        }
        return false;
    }
}
