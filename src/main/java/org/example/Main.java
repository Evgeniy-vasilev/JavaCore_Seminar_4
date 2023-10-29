package org.example;

public class Main {
    public static void main(String[] args) {
        /**
         * 1. Задача: Проверка логина и пароля
         */
        LoginAndPassword lap = new LoginAndPassword("Evgeny", "asdf", "asdf3");
        /**
         * Запуск метода с конструктором с сообщением
         */
        try {
            LoginAndPassword.isLoginPasswordTrue(lap.getLogin(), lap.getPassword(), lap.getConfirmPassword());
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
        }

        /**
         * Запуск метода с пустым конструктором
         */
        try {
            LoginAndPassword.isLoginPasswordTrue2(lap.getLogin(), lap.getPassword(), lap.getConfirmPassword());
        } catch (WrongLoginException  | WrongPasswordException e) {
            throw new RuntimeException(e);
        }
    }
}