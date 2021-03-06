package project.models.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * После получения сообщения с этим объектом клиенты Telegram будут отображать интерфейс ответа для пользователя (действовать так, как если бы
 * пользователь выбрал сообщение бота и нажал «Ответить»). Это может быть чрезвычайно полезно, если вы хотите создавать удобные пошаговые интерфейсы,
 * не жертвуя режимом конфиденциальности .
 */
@Data
public class ForceReply {

    /**
     * Показывает интерфейс ответа пользователю, как если бы он вручную выбрал сообщение бота и нажал «Ответить»
     */
    @JsonProperty("force_reply")
    private Boolean forceReply;

    /**
     * Необязательно . Используйте этот параметр, если вы хотите принудительно отвечать только определенным пользователям. Цели: 1) пользователи,
     * которые @mentioned в тексте этого сообщения объекта; 2) если сообщение бота является ответом (имеет reply_to_message_id ), отправитель
     * исходного сообщения.
     */
    private Boolean selective;
}
