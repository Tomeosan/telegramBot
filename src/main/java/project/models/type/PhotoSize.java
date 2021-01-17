package project.models.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * Этот объект представляет изображение определённого размера или превью файла / стикера.
 */
@Data
public class PhotoSize {

    /**
     * Уникальный идентификатор файла
     */
    @JsonProperty("file_id")
    private String fileId;

    /**
     * Уникальный идентификатор этого файла, который должен быть одинаковым с течением времени и для разных ботов. Невозможно использовать для загрузки или повторного использования файла.
     */
    @JsonProperty("file_unique_id")
    private String fileUniqueId;

    /**
     * Photo width
     */
    private Integer width;

    /**
     * Photo height
     */
    private Integer height;

    /**
     * Опционально. Размер файла
     */
    @JsonProperty("file_size")
    private Integer fileSize;
}
