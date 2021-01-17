package project.models.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * Этот объект представляет собой видеосообщение (доступно в приложениях Telegram начиная с версии 4.0 ).
 */
@Data
public class VideoNote {

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
     * Ширина и высота видео (диаметр видеосообщения), определенные отправителем
     */
    private Integer length;

    /**
     * Продолжительность видео в секундах, определенная отправителем
     */
    private Integer duration;

    /**
     * Необязательно . Миниатюра видео
     */
    private PhotoSize thumb;

    /**
     * Необязательно . Размер файла
     */
    @JsonProperty("file_size")
    private Integer fileSize;
}
