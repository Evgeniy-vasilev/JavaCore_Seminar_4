package onlineshop;

import lombok.*;

/**
 * Класс товар.
 */

@Getter
@Setter
@AllArgsConstructor
public class Product {
    /** Поле названия товара */
    private String name;
    /** Поле стоимости */
    private double price;
    /** Поле даты изготовления */
    private String dateOfManufacture;
}
