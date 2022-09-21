import exception.WrongLoginException;
import exception.WrongPasswordException;

public class Main {
    public static void main(String[] args) {
        System.out.println(check("java_skypro.go",
                "D_1hWiKjjP_9",
                "D_1hWiKjjP_9"));
    }

    public static boolean check(String login, String password, String confirmPassword) {
        try {
            if (login.length() >= 20) {
                throw new WrongLoginException("Неправильный логин");
            }
            if (password.length() >= 20){
                throw new WrongPasswordException("Неправильный пароль");
            }
            if (!password.equals(confirmPassword)){
                throw new WrongPasswordException("Пароли не совпадают");
            }
        } catch (WrongLoginException | WrongPasswordException e){
            e.printStackTrace();
            return false;
        } finally {
            System.out.println("Метод check отработал");
        }
        return true;
    }
}