package onlineshop;

import lombok.*;

/**
 * Класс покупатель.
 */
@Getter
@Setter
@AllArgsConstructor
public class Buyer {
    /** Поле id покупателя */
    private int id;
    /** Поле имени */
    private String name;
    /** Поле возраста */
    private int age;
}
