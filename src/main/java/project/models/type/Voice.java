package project.models.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * Этот объект представляет голосовое сообщение
 */
@Data
public class Voice {

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
     * Продолжительность аудиофайла, заданная отправителем
     */
    private Integer duration;

    /**
     * Опционально. MIME-тип файла, заданный отправителем
     */
    @JsonProperty("mime_type")
    private String mimeType;

    /**
     * Опционально. Размер файла
     */
    @JsonProperty("file_size")
    private Integer fileSize;
}
