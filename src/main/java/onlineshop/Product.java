package onlineshop;

import lombok.*;

/**
 * Класс товар.
 */

@Getter
@Setter
@AllArgsConstructor
public class Product {
    private String name;
    private double price;
    private String dateOfManufacture;
}
