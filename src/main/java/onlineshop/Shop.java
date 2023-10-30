package onlineshop;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс магазин. Создаются массивы покупатели, товары, заказы, а так же
 * метод создания заказов и метод вывода в терминал заказов и их
 * количества
 */
public class Shop {
    /** Массив покупателей */
    private List<Buyer> buyers;
    /** Массив товаров */
    private List<Product> products;
    /** Массив заказов */
    private List<Order> orders;

    public Shop() {
        this.buyers = new ArrayList<>();
        this.products = new ArrayList<>();
        this.orders = new ArrayList<>();
    }

    /**
     * Добавление покупателя в ArrayList (buyers).
     *
     * @param buyer - покупатель
     */
    public void addBuyer(Buyer buyer) {
        buyers.add(buyer);
    }

    /**
     * Добавление товара в ArrayList (products).
     *
     * @param product - товар
     */
    public void addProduct(Product product) {
        products.add(product);
    }

    /**
     * Метод создания заказа и добавление в ArrayList (orders).
     *
     * @param buyer    - покупатель
     * @param product  - товар
     * @param quantity - количество
     * @throws BuyerException    - ошибка имени покупателя
     * @throws ProductException  - ошибка товара
     * @throws QuantityException - ошибка количества товара
     */
    public void makeOrder(Buyer buyer, Product product, int quantity) throws BuyerException,
            ProductException, QuantityException {

        if (!buyers.contains(buyer)) throw new BuyerException("Несуществующий покупатель");
        if (!products.contains(product)) throw new ProductException("Неверный товар");
        if (quantity <= 0) throw new QuantityException("Неверное количество товара");

        Order order = new Order(buyer, product, quantity);
        orders.add(order);
    }

    /**
     * Печать всех заказов и общее количество заказов
     */
    public void print() {
        /** Счетчик заказов */
        int count = 0;

        for (Order order : orders) {
            Buyer buyer = order.getBuyer();
            Product product = order.getProduct();
            int quantity = order.getQuantity();

            System.out.println("Order info: {" +
                    "ID: " + buyer.getId() +
                    ", buyer - " + buyer.getName() +
                    ", " + buyer.getAge() + " age:" +
                    " product name - " + product.getName() +
                    " (price - " + product.getPrice() +
                    ", date of manufacture - " + product.getDateOfManufacture() +
                    "), quantity - " + quantity +
                    ", totalPrice - " + order.getTotalPrice() +
                    "}.");
            count++;

        }
        System.out.println("Orders quantity: " + count + ".");
    }
}
