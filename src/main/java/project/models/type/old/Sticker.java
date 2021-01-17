package project.models.type.old;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import project.models.type.PhotoSize;

/**
 * Этот объект представляет стикер.
 */
@Data
public class Sticker {

    /**
     * Уникальный идентификатор файла
     */
    @JsonProperty("file_id")
    private String fileId;

    /**
     * Ширина стикера
     */
    private Integer width;

    /**
     * Высота стикера
     */
    private Integer height;

    /**
     * Опционально. Превью стикера в формате .webp или .jpg
     */
    private PhotoSize thumb;

    /**
     * Опционально. Размер файла
     */
    @JsonProperty("file_size")
    private Integer fileSize;
}
