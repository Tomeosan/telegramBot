package project.models.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * Описывает действия, которые пользователь без прав администратора может выполнять в чате
 */
@Data
public class ChatPermissions {

    /**
     * Необязательно . Верно, если пользователю разрешено отправлять текстовые сообщения, контакты, местоположения и места проведения
     */
    @JsonProperty("can_send_messages")
    private Boolean canSendMessages;

    /**
     * Необязательно . Правда, если пользователю разрешено отправлять аудио, документы, фотографии, видео, видеозаметки и голосовые заметки,
     * подразумевается can_send_messages
     */
    @JsonProperty("can_send_media_messages")
    private Boolean canSendMediaMessages;

    /**
     * Необязательно . Правда, если пользователю разрешено отправлять опросы, подразумевается can_send_messages
     */
    @JsonProperty("can_send_polls")
    private Boolean canSendPolls;

    /**
     * Необязательно . Правда, если пользователю разрешено отправлять анимацию, игры, стикеры и использовать встроенных ботов, подразумевается
     * can_send_media_messages
     */
    @JsonProperty("can_send_other_messages")
    private Boolean canSendOtherMessages;

    /**
     * Необязательно . Верно, если пользователю разрешено добавлять превью веб-страницы в свои сообщения, подразумевается can_send_media_messages
     */
    @JsonProperty("can_add_web_page_previews")
    private Boolean canAddWebPagePreviews;

    /**
     * Необязательно . Верно, если пользователю разрешено менять название чата, фото и другие настройки. Игнорируется в публичных супергруппах
     */
    @JsonProperty("can_change_info")
    private Boolean canChangeInfo;

    /**
     * Необязательно . Верно, если пользователю разрешено приглашать новых пользователей в чат
     */
    @JsonProperty("can_invite_users")
    private Boolean canInviteUsers;

    /**
     * Необязательно . Верно, если пользователю разрешено закреплять сообщения. Игнорируется в публичных супергруппах
     */
    @JsonProperty("can_pin_messages")
    private Boolean canPinMessages;
}
