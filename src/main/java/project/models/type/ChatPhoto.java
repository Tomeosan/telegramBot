package project.models.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * Этот объект представляет собой фотографию чата.
 */
@Data
public class ChatPhoto {

    /**
     * Идентификатор файла небольшой (160x160) фотографии чата. Этот file_id можно использовать только для загрузки фотографий и только до тех пор,
     * пока фотография не будет изменена.
     */
    @JsonProperty("small_file_id")
    private String smallFileId;

    /**
     * Уникальный идентификатор файла небольшой (160x160) фотографии чата, который должен быть одинаковым с течением времени и для разных ботов.
     * Невозможно использовать для загрузки или повторного использования файла.
     */
    @JsonProperty("small_file_unique_id")
    private String smallFileUniqueId;

    /**
     * Идентификатор файла большой (640x640) фотографии чата. Этот file_id можно использовать только для загрузки фотографий и только до тех пор, пока
     * фотография не будет изменена.
     */
    @JsonProperty("big_file_id")
    private String bigFileId;

    /**
     * Уникальный идентификатор файла большой (640x640) фотографии чата, который должен быть одинаковым с течением времени и для разных ботов.
     * Невозможно использовать для загрузки или повторного использования файла.
     */
    @JsonProperty("big_file_unique_id")
    private String bigFileUniqueId;
}
