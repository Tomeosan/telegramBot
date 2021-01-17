package project.models.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Представляет видео для отправки
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class InputMediaVideo extends MediaType{

    /**
     * Необязательно . Миниатюра отправленного файла; можно игнорировать, если создание эскизов для файла поддерживается на стороне сервера. Миниатюра
     * должна быть в формате JPEG и размером менее 200 КБ. Ширина и высота эскиза не должны превышать 320. Игнорируется, если файл не загружен с
     * использованием multipart / form-data. Эскизы не могут быть повторно использованы и могут быть загружены только как новый файл, поэтому вы
     * можете передать «attach: // <file_attach_name>», если эскиз был загружен с использованием multipart / form-data в <file_attach_name>. Подробнее
     * об отправке файлов »
     */
    private InputFile thumb;

    /**
     * Необязательно . Ширина видео
     */
    private Integer width;

    /**
     * Необязательно . Высота видео
     */
    private Integer height;

    /**
     * Необязательно . Продолжительность видео
     */
    private Integer duration;

    /**
     * Необязательно . Pass True , если загруженное видео подходит для потоковой передачи
     */
    @JsonProperty("supports_streaming")
    private Boolean supportsStreaming;
}
