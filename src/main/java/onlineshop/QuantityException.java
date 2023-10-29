package onlineshop;

/**
 * Класс, выбрасывает исключение ошибки с количеством товара
 */
public class QuantityException extends Exception {
    public QuantityException(String message) {
        super(message);
    }
}
