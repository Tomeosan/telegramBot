package project.models.type;

import lombok.Data;

/**
 *
 */
@Data

public class InputMedia {

    /**
     * Этот объект представляет содержимое отправляемого мультимедийного сообщения. Это должен быть один из
     * <p>
     * InputMediaAnimation InputMediaDocument InputMediaAudio InputMediaPhoto InputMediaVideo
     */
    private MediaType inputMedia;
}
