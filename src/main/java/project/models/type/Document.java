package project.models.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import project.models.type.PhotoSize;

/**
 * Этот объект представляет файл, не являющийся фотографией, голосовым сообщением или аудиозаписью.
 */
@Data
public class Document {

    /**
     * Уникальный идентификатор файла
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
     * Опционально.Миниатюра документа, определенная отправителем
     */
    public PhotoSize thumb;

    /**
     * Опционально. Исходное имя файла, определенное отправителем
     */
    @JsonProperty("file_name")
    private String fileName;

    /**
     * Опционально. MIME файла, заданный отправителем
     */
    @JsonProperty("mimeType")
    private String mime_type;

    /**
     * Опционально. Размер файла
     */
    @JsonProperty("file_size")
    private Integer fileSize;
}
