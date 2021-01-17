package project.models.type.old;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import project.models.type.PhotoSize;

/**
 * Этот объект содержит фотографии профиля пользователя
 */
@Data
public class UserProfilePhotos {

    /**
     * Общее число доступных фотографий профиля
     */
    @JsonProperty("total_count")
    private Integer totalCount;

    /**
     * Массив массивов с объектами PhotoSize, Запрошенные изображения, каждое в 4 разных размерах.
     */
    private PhotoSize[][] photos;
}
