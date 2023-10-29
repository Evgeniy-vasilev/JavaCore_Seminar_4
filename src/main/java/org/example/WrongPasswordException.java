package org.example;

public class WrongPasswordException extends Exception {
    /**
     * Пользовательский класс исключения с двумя конструкторами –
     * один по умолчанию, второй принимает сообщение исключения и
     * передает его в конструктор класса Exception.
     *
     * @param message - сообщение об исключении
     */
    public WrongPasswordException(String message) {
        super(message);
    }

    public WrongPasswordException() {
    }
}
