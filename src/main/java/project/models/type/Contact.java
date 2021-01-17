package project.models.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * Этот объект представляет контакт с номером телефона.
 */
@Data
public class Contact {

    /**
     * Номер телефона
     */
    @JsonProperty("phone_number")
    private String phoneNumber;

    /**
     * Имя
     */
    @JsonProperty("first_name")
    private String firstName;

    /**
     * Опционально. Фамилия
     */
    @JsonProperty("last_name")
    private String lastName;

    /**
     * Опционально. Идентификатор пользователя в Telegram
     */
    @JsonProperty("user_id")
    private Integer userId;

    /**
     * Необязательно . Дополнительные данные о контакте в виде vCard
     */
    public String vcard;
}
