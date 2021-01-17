package project.models.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * Этот объект представляет аудиозапись, которую клиенты Telegram воспинимают как музыкальный трек.
 */
@Data
public class Audio {

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
     * Продолжительность звука в секундах, определенная отправителем
     */
    private Integer duration;

    /**
     * Опционально . Исполнитель аудио, определенный отправителем или аудио тегами
     */
    private String performer;

    /**
     * Опционально . Название аудио, определенное отправителем или тегами аудио
     */
    private String title;

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

    /**
     * Необязательно . Миниатюра обложки альбома, к которому принадлежит музыкальный файл
     */
    private PhotoSize thumb;
}
