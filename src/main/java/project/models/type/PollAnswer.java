package project.models.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 *Этот объект представляет собой ответ пользователя в неанонимном опросе
 */
@Data
public class PollAnswer {

    /**
     * Уникальный идентификатор опроса
     */
    @JsonProperty("poll_id")
    private String pollId;

    /**
     * Пользователь, изменивший ответ на опрос
     */
    private User user;

    /**
     * Отсчитываемые от 0 идентификаторы вариантов ответа, выбранных пользователем. Может быть пустым, если пользователь отозвал свой голос.
     */
    @JsonProperty("option_ids")
    private List<Integer> optionIds;
}
