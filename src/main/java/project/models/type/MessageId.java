package project.models.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * Этот объект представляет собой уникальный идентификатор сообщения.
 */
@Data
public class MessageId {

    /**
     * Уникальный идентификатор сообщения
     */
    @JsonProperty("message_id")
    private Integer messageId;
}
