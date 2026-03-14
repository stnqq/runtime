package Practices.march14;

public class Registration {
    public static void validateCredentials(String phone, String password) {
        static final int PHONE_LENGTH = 11;
        static final int MIN_PASSWORD_LENGTH = 8;

        if (phone.length() != PHONE_LENGTH) {
            System.out.println("Введите номер в формате 7xxxxxxxxxxx, где x - любая цифра.");
        }
        if (password.length() < MIN_PASSWORD_LENGTH) {
            System.out.println("Минимальная длина пароля: 8 знаков.");
        }
    }

    public static void main(String[] args) {
        validateCredentials("7901000000", "Qwerty");
    }
}