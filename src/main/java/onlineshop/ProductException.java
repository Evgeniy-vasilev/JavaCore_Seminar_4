package onlineshop;

/**
 * Класс, выбрасывает исключение ошибки с товаром
 */
public class ProductException extends Exception {
    public ProductException(String message) {
        super(message);
    }
}
