package org.example;

public class WrongLoginException extends Exception {
    /**
     * Неверный логин.
     * Пользовательский класс исключения с двумя конструкторами –
     * один по умолчанию, второй принимает сообщение исключения и
     * передает его в конструктор класса Exception.
     *
     * @param message - сообщение об исключении
     */
    public WrongLoginException(String message) {
        super(message);
    }

    public WrongLoginException() {
    }


}
