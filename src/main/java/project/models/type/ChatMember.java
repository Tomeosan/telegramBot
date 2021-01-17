package project.models.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * Этот объект содержит информацию об одном участнике чата
 */
@Data
public class ChatMember {

    /**
     * Информация о пользователе
     */
    private User user;

    /**
     * Статус участника в чате. Может быть «создатель», «администратор», «участник», «ограничен», «покинул» или «исключен».
     */
    private String status;

    /**
     * Необязательно . Только владелец и администраторы. Индивидуальный заголовок для этого пользователя
     */
    @JsonProperty("custom_title")
    private String customTitle;

    /**
     * Необязательно . Только владелец и администраторы. Правда, если присутствие пользователя в чате скрыто
     */
    @JsonProperty("is_anonymous")
    private Boolean isAnonymous;

    /**
     * Необязательно . Только администраторы. Верно, если боту разрешено редактировать права администратора этого пользователя
     */
    @JsonProperty("can_be_edited")
    private Boolean canBeEdited;

    /**
     * Необязательно . Только администраторы. Правда, если администратор может оставлять сообщения в канале; только каналы
     */
    @JsonProperty("can_post_messages")
    private Boolean canPostMessages;

    /**
     * Необязательно . Только администраторы. Правда, если администратор может редактировать сообщения других пользователей и может закреплять
     * сообщения; только каналы
     */
    @JsonProperty("can_edit_messages")
    private Boolean canEditMessages;

    /**
     * Необязательно . Только администраторы. Правда, если администратор может удалять сообщения других пользователей
     */
    @JsonProperty("can_delete_messages")
    private Boolean canDeleteMessages;

    /**
     * Необязательно . Только администраторы. Правда, если администратор может ограничивать, банить или разблокировать участников чата
     */
    @JsonProperty("can_restrict_members")
    private Boolean canRestrictMembers;

    /**
     * Необязательно . Только администраторы. Верно, если администратор может добавлять новых администраторов с подмножеством их собственных
     * привилегий или понижать в должности администраторов, которых он повысил, прямо или косвенно (продвинутых администраторами, назначенными
     * пользователем)
     */
    @JsonProperty("can_promote_members")
    private Boolean canPromoteMembers;

    /**
     * Необязательно . Только администраторы и с ограничениями. Правда, если пользователю разрешено изменять название чата, фото и другие настройки
     */
    @JsonProperty("can_change_info")
    private Boolean canChangeInfo;

    /**
     * Необязательно . Только администраторы и с ограничениями. Верно, если пользователю разрешено приглашать новых пользователей в чат
     */
    @JsonProperty("can_invite_users")
    private Boolean canInviteUsers;

    /**
     * Необязательно . Только администраторы и с ограничениями. Истинно, если пользователю разрешено закреплять сообщения; только группы и
     * супергруппы
     */
    @JsonProperty("can_pin_messages")
    private Boolean canPinMessages;

    /**
     * Необязательно . Только с ограничениями. Верно, если пользователь является участником чата на момент запроса
     */
    @JsonProperty("is_member")
    private Boolean isMember;

    /**
     * Необязательно . Только с ограничениями. Верно, если пользователю разрешено отправлять текстовые сообщения, контакты, местоположения и места
     * проведения
     */
    @JsonProperty("can_send_messages")
    private Boolean canSendMessages;

    /**
     * Необязательно . Только с ограничениями. Верно, если пользователю разрешено отправлять аудио, документы, фотографии, видео, видеозаметки и
     * голосовые заметки
     */
    @JsonProperty("can_send_media_messages")
    private Boolean canSendMediaMessages;

    /**
     * Необязательно . Только с ограничениями. Верно, если пользователю разрешено отправлять опросы
     */
    @JsonProperty("can_send_polls")
    private Boolean canSendPolls;

    /**
     * Необязательно . Только с ограничениями. Верно, если пользователю разрешено отправлять анимацию, игры, стикеры и использовать встроенных ботов
     */
    @JsonProperty("can_send_other_messages")
    private Boolean canSendOtherMessages;

    /**
     * Необязательно . Только с ограничениями. Верно, если пользователю разрешено добавлять превью веб-страниц в свои сообщения
     */
    @JsonProperty("can_add_web_page_previews")
    private Boolean canAddWebPagePreviews;

    /**
     * Необязательно . Только с ограничениями и пинками. Дата снятия ограничений для этого пользователя; время unix
     */
    @JsonProperty("until_date")
    private Integer untilDate;
}
