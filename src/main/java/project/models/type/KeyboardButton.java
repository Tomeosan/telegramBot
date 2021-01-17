package project.models.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * Этот объект представляет одну кнопку в клавиатуре ответа. Для обычных текстовых кнопок этот объект может быть заменён на строку, содержащую текст
 * на кнопке.
 */
@Data
public class KeyboardButton {

    /**
     * Текст на кнопке. Если ни одно из опциональных полей не использовано, то при нажатии на кнопку этот текст будет отправлен боту как простое
     * сообщение.
     */
    private String text;

    /**
     * Опционально. Если значение True, то при нажатии на кнопку боту отправится контакт пользователя с его номером телефона. Доступно только в
     * диалогах с ботом.
     */
    @JsonProperty("request_contact")
    private Boolean requestContact;

    /**
     * Опционально. Если значение True, то при нажатии на кнопку боту отправится местоположение пользователя. Доступно только в диалогах с ботом.
     */
    @JsonProperty("request_location")
    private Boolean requestLocation;

    /**
     * Необязательно . Если указано, пользователю будет предложено создать опрос и отправить его боту при нажатии кнопки. Доступно только в приватных
     * чатах
     */
    @JsonProperty("request_poll")
    private KeyboardButtonPollType requestPoll;
}
