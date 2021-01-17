package project.models.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Представляет общий файл для отправки
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class InputMediaDocument extends MediaType {

    /**
     * Необязательно . Миниатюра отправленного файла; можно игнорировать, если создание эскизов для файла поддерживается на стороне сервера. Миниатюра
     * должна быть в формате JPEG и размером менее 200 КБ. Ширина и высота эскиза не должны превышать 320. Игнорируется, если файл не загружен с
     * использованием multipart / form-data. Эскизы не могут быть повторно использованы и могут быть загружены только как новый файл, поэтому вы
     * можете передать «attach: // <file_attach_name>», если эскиз был загружен с использованием multipart / form-data в <file_attach_name>. Подробнее
     * об отправке файлов »
     */
    private InputFile thumb;

    /**
     * Необязательно . Отключает автоматическое определение типа содержимого на стороне сервера для файлов, загруженных с использованием multipart /
     * form-data. Всегда верно, если документ отправляется в составе альбома.
     */
    @JsonProperty("disable_content_type_detection")
    private Boolean disableContentTypeDetection;
}
