package project.models.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import project.models.type.PhotoSize;

/**
 * Этот объект представляет видеозапись.
 */
@Data
public class Video {

    /**
     * Уникальный идентификатор файла
     */
    @JsonProperty("file_id")
    private String fileId;

    /**
     * Уникальный идентификатор этого файла, который должен быть одинаковым с течением времени и для разных ботов. Невозможно использовать для
     * загрузки или повторного использования файла
     */
    @JsonProperty("file_unique_id")
    private String fileUniqueId;

    /**
     * Ширина видео, заданная отправителем
     */
    private Integer width;

    /**
     * Высота видео, заданная отправителем
     */
    private Integer height;

    /**
     * Продолжительность видео, заданная отправителем
     */
    private Integer duration;

    /**
     * Опционально. Превью видео
     */
    private PhotoSize thumb;

    /**
     * Необязательно . Исходное имя файла, определенное отправителем
     */
    @JsonProperty("file_name")
    private String fileName;

    /**
     * Опционально. MIME файла, заданный отправителем
     */
    @JsonProperty("mime_type")
    private String mimeType;

    /**
     * Опционально. Размер файла
     */
    @JsonProperty("file_size")
    private Integer fileSize;
}
