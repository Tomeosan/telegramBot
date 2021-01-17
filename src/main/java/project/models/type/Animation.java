package project.models.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * Этот объект представляет собой файл анимации (видео в формате GIF или H.264 / MPEG-4 AVC без звука).
 */
@Data
public class Animation {

    /**
     * Идентификатор этого файла, который можно использовать для загрузки или повторного использования файла.
     */
    @JsonProperty("file_id")
    private String fileId;

    /**
     * Уникальный идентификатор этого файла, который должен быть одинаковым с течением времени и для разных ботов. Невозможно использовать для
     * загрузки или повторного использования файла.
     */
    @JsonProperty("file_unique_id")
    private String fileUniqueId;

    /**
     * Ширина видео, определенная отправителем
     */
    private Integer width;

    /**
     * Высота видео, определенная отправителем
     */
    private Integer height;

    /**
     * Продолжительность видео в секундах, определенная отправителем
     */
    private Integer duration;

    /**
     * Необязательно . Миниатюра анимации, определенная отправителем
     */
    private PhotoSize thumb;

    /**
     * Необязательно . Исходное имя файла анимации, определенное отправителем
     */
    @JsonProperty("file_name")
    private String fileName;

    /**
     * Необязательно . MIME-тип файла, определенный отправителем
     */
    @JsonProperty("mime_type")
    private String mimeType;

    /**
     * Необязательно . Размер файла
     */
    @JsonProperty("file_size")
    private Integer fileSize;
}
