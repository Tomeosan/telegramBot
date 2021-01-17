package project.models.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 * Этот объект представляет собой изображение профиля пользователя.
 */
@Data
public class UserProfilePhotos {

    /**
     * Общее количество изображений профиля целевого пользователя
     */
    @JsonProperty("total_count")
    private Integer totalCount;

    /**
     * Запрошенные изображения профиля (до 4 размеров каждое)
     */
    private List<PhotoSize> photos;
}
