package project.models.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import project.models.type.Message;
import project.models.type.User;

/**
 * Этот объект представляет входящий запрос обратной связи от инлайн-кнопки с заданным callback_data.
 * <p>
 * Если кнопка, создавшая этот запрос, была привязана к сообщению, то в запросе будет присутствовать поле message.
 * <p>
 * Если кнопка была показана в сообщении, отправленном при помощи встроенного режима, в запросе будет присутствовать поле inline_message_id.
 */
@Data
public class CallbackQuery {

    /**
     * Уникальный идентификатор запроса
     */
    private String id;

    /**
     * Отправитель
     */
    private User from;

    /**
     * Опционально. Сообщение, к которому была привязана вызвавшая запрос кнопка. Обратите внимание: если сообщение слишком старое, содержание
     * сообщения и дата отправки будут недоступны.
     */
    private Message message;

    /**
     * Опционально. Идентификатор сообщения, отправленного через вашего бота во встроенном режиме
     */
    @JsonProperty("inline_message_id")
    private String inlineMessageId;

    /**
     * Глобальный идентификатор, однозначно соответствующий чату, в который было отправлено сообщение с кнопкой обратного вызова. Полезно для высоких
     * результатов в играх .
     */
    @JsonProperty("chat_instance")
    private String chatInstance;

    /**
     * Данные, связанные с кнопкой. Обратите внимание, что клиенты могут добавлять свои данные в это поле.
     */
    private String data;

    /**
     * Необязательно . Краткое название игры, которое должно быть возвращено, служит уникальным идентификатором игры.
     */
    @JsonProperty("game_short_name")
    private String gameShortName;
}
