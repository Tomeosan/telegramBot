package project.models.type;


import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public abstract class MediaType {

    /**
     * Тип результата (фото, видео, анимация, аудио)
     */
    private String type;

    /**
     * Файл для отправки. Передайте file_id для отправки файла, который существует на серверах Telegram (рекомендуется), передайте URL-адрес HTTP для
     * Telegram, чтобы получить файл из Интернета, или передайте «attach: // <file_attach_name>», чтобы загрузить новый, используя multipart / данные
     * формы под именем <file_attach_name>. Подробнее об отправке файлов »
     */
    private String media;

    /**
     * Необязательно . Заголовок отправляемого, 0-1024 символа после синтаксического анализа сущностей
     */
    private String caption;

    /**
     * Необязательно . Режим разбора сущностей  . См. Дополнительные сведения в параметрах форматирования .
     */
    @JsonProperty("parse_mode")
    private String parseMode;

    /**
     * Необязательно . Список специальных сущностей, которые появляются в заголовке, которые можно указать вместо parse_mode
     */
    @JsonProperty("caption_entities")
    private List<MessageEntity> captionEntities;
}
