package onlineshop;

import lombok.*;

/**
 * Класс заказ. В заказ включены покупатель, товар, количество товаров и
 * общая стоимость товаров (вычисляется по формуле в конструкторе).
 */
@Getter
@Setter
public class Order {
    private Buyer buyer;
    private Product product;
    private int quantity;
    private double totalPrice;

    public Order(Buyer buyer, Product product, int quantity) {
        this.buyer = buyer;
        this.product = product;
        this.quantity = quantity;
        this.totalPrice = product.getPrice() * quantity;
    }
}
