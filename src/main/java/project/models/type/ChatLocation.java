package project.models.type;

import lombok.Data;

/**
 * Представляет расположение, к которому подключен чат.
 */
@Data
public class ChatLocation {

    /**
     * Местоположение, к которому подключена супергруппа. Не может быть живым местом.
     */
    private Location location;

    /**
     * Адрес местонахождения; 1-64 символа, как определено владельцем чата
     */
    private String address;
}
