package onlineshop;

/**
 * Класс, выбрасывает исключение ошибки с количеством товара
 */
public class QuantityException extends Exception {
    /**
     * Исключение выбрасывается, если количество товаров равно 0 или
     * является отрицательным
     * @param message - сообщение об ошибке: "ошибка количества товара"
     */
    public QuantityException(String message) {
        super(message);
    }
}
