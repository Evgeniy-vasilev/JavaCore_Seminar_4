package onlineshop;

/**
 * Класс, выбрасывает исключение ошибки с покупателем
 */
public class BuyerException extends Exception {
    public BuyerException(String message) {
        super(message);
    }
}
