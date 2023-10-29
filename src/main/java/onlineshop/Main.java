package onlineshop;

/**
 * 2. Задача: Эмуляция интернет-магазина.
 */
public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();
/**
 * Создание покупателей и добавление в массив.
 */
        Buyer buyer1 = new Buyer(1, "John", 34);
        Buyer buyer2 = new Buyer(2, "Petr", 23);
        shop.addBuyer(buyer1);
        shop.addBuyer(buyer2);
/**
 * Создание продуктов и добавление в массив.
 */
        Product product1 = new Product("Cheese", 300, "23.10.2023");
        Product product2 = new Product("Milk", 120, "24.10.2023");
        Product product3 = new Product("Sugar", 50, "10.09.2023");
        shop.addProduct(product1);
        shop.addProduct(product2);
        shop.addProduct(product3);

        try {
            shop.makeOrder(buyer1, product1, 3);
            shop.makeOrder(buyer1, product2, 6);
            shop.makeOrder(buyer2, product3, 2);
        } catch (BuyerException | ProductException | QuantityException e) {
            System.out.println(e.getMessage());
        }

        shop.print();
    }
}
