package onlineshop;

/**
 * Класс, выбрасывает исключение ошибки с покупателем
 */
public class BuyerException extends Exception {
    /**
     * Исключение выбрасывается, если такого покупателя не существует
     * @param message - сообщение об ошибке: "ошибка имени покупателя"
     */
    public BuyerException(String message) {
        super(message);
    }
}
