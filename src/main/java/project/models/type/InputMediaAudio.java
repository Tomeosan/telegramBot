package project.models.type;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Представляет аудиофайл, который будет рассматриваться как музыка для отправки.
 */
@Data()
@EqualsAndHashCode(callSuper = true)
public class InputMediaAudio extends MediaType {

    /**
     * Необязательно . Миниатюра отправленного файла; можно игнорировать, если создание эскизов для файла поддерживается на стороне сервера. Миниатюра
     * должна быть в формате JPEG и размером менее 200 КБ. Ширина и высота эскиза не должны превышать 320. Игнорируется, если файл не загружен с
     * использованием multipart / form-data. Эскизы не могут быть повторно использованы и могут быть загружены только как новый файл, поэтому вы
     * можете передать «attach: // <file_attach_name>», если эскиз был загружен с использованием multipart / form-data в <file_attach_name>. Подробнее
     * об отправке файлов »
     */
    private InputFile thumb;

    /**
     * Необязательно . Продолжительность звука в секундах
     */
    private Integer duration;

    /**
     * Необязательно . Исполнитель аудио
     */
    private String performer;

    /**
     * Необязательно . Название аудио
     */
    private String title;
}
