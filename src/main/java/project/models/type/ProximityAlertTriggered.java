package project.models.type;

import lombok.Data;

/**
 * Этот объект представляет содержимое служебного сообщения, отправляемого всякий раз, когда пользователь в чате запускает оповещение о близости,
 * установленное другим пользователем.
 */
@Data
public class ProximityAlertTriggered {

    /**
     * Пользователь, вызвавший оповещение
     */
    private User traveler;

    /**
     * Пользователь, установивший оповещение
     */
    private User watcher;

    /**
     * Расстояние между пользователями
     */
    private Integer distance;
}
