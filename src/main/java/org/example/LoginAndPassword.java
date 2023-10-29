package org.example;

public class LoginAndPassword {
    /**
     * Класс, описывающий логин, пароль и совпадание пароля и подтверждения.
     * Длина login и password должна быть меньше 20 символов.
     * Если login и password не соответствуют этим требованиям,
     * выбрасываются WrongLoginException или WrongPasswordException.
     */
    private String login;
    private String password;
    private String confirmPassword;


    public LoginAndPassword(String login, String password, String confirmPassword) {
        this.login = login;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    /**
     * Метод, проверяющий правильность введенного логина и пароля
     * @param s  - логин/пароль
     * @return - возвращает true или  false в зависимости от результата проверки
     */
    public static boolean isStringTrue(String s) {
        if (s == null || s.isEmpty() || s.length() > 20) return false;

        String s1 = s.replaceAll("[^a-zA-Z0-9_]", "");

        return s1.equals(s);
    }

    /**
     * Статический метод который принимает на вход три параметра: login, password и confirmPassword.
     * Конструктор с сообщением
     * @param login - логин
     * @param password - пароль
     * @param confirmPassword - подтверждение пароля
     * @throws WrongLoginException - исключение: неверный логин
     * @throws WrongPasswordException - исключение:  неверный пароль или подтверждение
     */
    public static void isLoginPasswordTrue(String login, String password, String confirmPassword)
            throws WrongLoginException, WrongPasswordException {
        if (!isStringTrue(login)) throw new WrongLoginException("Неверный логин!");
        if (!isStringTrue(password)) throw new WrongLoginException("Неверный пароль!");
        if (!password.equals(confirmPassword)) throw new WrongPasswordException("Неверное подтверждение пароля!");
        System.out.println(isStringTrue(login) && isStringTrue(password) && password.equals(confirmPassword));
    }

    /**
     * Статический метод который принимает на вход три параметра: login, password и confirmPassword.
     * Пустой конструктор
     */
    public static void isLoginPasswordTrue2(String login, String password, String confirmPassword)
            throws WrongLoginException, WrongPasswordException {
        if (!isStringTrue(login)) throw new WrongLoginException();
        if (!isStringTrue(password)) throw new WrongLoginException();
        if (!password.equals(confirmPassword)) throw new WrongPasswordException();
        System.out.println(isStringTrue(login) && isStringTrue(password) && password.equals(confirmPassword));
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }
}
