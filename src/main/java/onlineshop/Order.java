package onlineshop;

import lombok.*;

/**
 * Класс заказ. В заказ включены покупатель, товар, количество товаров и
 * общая стоимость товаров (вычисляется по формуле в конструкторе).
 */
@Getter
@Setter
public class Order {
    /** Экземляр покупателя */
    private Buyer buyer;
    /** Экземляр товара */
    private Product product;
    /** Поле количество товара */
    private int quantity;
    /** Поле итоговая стоимость */
    private double totalPrice;

    public Order(Buyer buyer, Product product, int quantity) {
        this.buyer = buyer;
        this.product = product;
        this.quantity = quantity;
        this.totalPrice = product.getPrice() * quantity;
    }
}
