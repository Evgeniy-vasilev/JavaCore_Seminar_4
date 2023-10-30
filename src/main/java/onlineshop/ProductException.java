package onlineshop;

/**
 * Класс, выбрасывает исключение ошибки с товаром
 */
public class ProductException extends Exception {
    /**
     * Исключение выбрасывается, если такого товара не существует
     * @param message - сообщение об ошибке: "неверный товар"
     */
    public ProductException(String message) {
        super(message);
    }
}
