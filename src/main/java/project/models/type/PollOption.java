package project.models.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * Этот объект содержит информацию об одном варианте ответа в опросе.
 */
@Data
public class PollOption {

    /**
     * Текст опции, 1-100 знаков
     */
    private String text;

    /**
     * Количество пользователей, проголосовавших за этот вариант
     */
    @JsonProperty("voter_count")
    private Integer voterCount;

}
