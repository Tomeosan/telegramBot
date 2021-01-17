package project.models.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import project.models.games.Game;
import project.models.passport.PassportData;
import project.models.payments.Invoice;
import project.models.payments.SuccessfulPayment;
import project.models.type.old.*;

import java.util.List;

/**
 * Этот объект представляет собой сообщение.
 */
@Data
public class Message {

    /**
     * Уникальный идентификатор сообщения
     */
    @JsonProperty("message_id")
    private Integer messageId;

    /**
     * Опционально. Отправитель. Может быть пустым в каналах.
     */
    private User from;

    /**
     * Дата отправки сообщения (Unix time)
     */
    private Integer date;

    /**
     * Необязательно . Отправитель сообщения, отправленного от имени чата. Сам канал для сообщений канала. Сама супергруппа для сообщений от
     * администраторов анонимных групп. Связанный канал для сообщений, автоматически перенаправляемых в группу обсуждения
     */
    @JsonProperty("sender_chat")
    private Chat senderChat;


    /**
     * Диалог, в котором было отправлено сообщение
     */
    private Chat chat;

    /**
     * Опционально. Для пересланных сообщений: отправитель оригинального сообщения
     */
    @JsonProperty("forward_from")
    private User forwardFrom;

    /**
     * Необязательно . Для сообщений, пересылаемых по каналам или от анонимных администраторов, информация об исходном чате отправителя.
     */
    @JsonProperty("forward_from_chat")
    private Chat forwardFromChat;

    /**
     * Необязательно . Для сообщений, пересылаемых из каналов, идентификатор исходного сообщения в канале.
     */
    @JsonProperty("forward_from_message_id")
    private Integer forwardFromMessageId;

    /**
     * Необязательно . Для сообщений, пересылаемых с каналов, подпись автора сообщения, если есть
     */
    @JsonProperty("forward_signature")
    private String forwardSignature;

    /**
     * Необязательно . Имя отправителя сообщений, пересылаемых от пользователей, которые не разрешают добавлять ссылку на свою учетную запись в
     * пересылаемых сообщениях.
     */
    @JsonProperty("forward_sender_name")
    private String forwardSenderName;

    /**
     * Опционально. Для пересланных сообщений: дата отправки оригинального сообщения
     */
    @JsonProperty("forward_date")
    private Integer forwardDate;

    /**
     * Опционально. Для ответов: оригинальное сообщение. Note that the Message object in this field will not contain further reply_to_message fields
     * even if it itself is a reply.
     */
    @JsonProperty("reply_to_message")
    private Message replyToMessage;

    /**
     * Необязательно . Бот, через который было отправлено сообщение
     */
    @JsonProperty("via_bot")
    private User viaBot;

    /**
     * Необязательно . Дата последнего редактирования сообщения по времени Unix
     */
    @JsonProperty("edit_date")
    private Integer editDate;

    /**
     * Необязательно . Уникальный идентификатор группы мультимедийных сообщений, к которой принадлежит это сообщение.
     */
    @JsonProperty("media_group_id")
    private String mediaGroupId;

    /**
     * Необязательно . Подпись автора сообщения для сообщений в каналах или настраиваемый заголовок анонимного администратора группы
     */
    @JsonProperty("author_signature")
    private String authorSignature;

    /**
     * Опционально. Для текстовых сообщений: текст сообщения, 0-4096 символов
     */
    private String text;

    /**
     * Опционально. Для текстовых сообщений: особые сущности в тексте сообщения.
     */
    private List<MessageEntity> entities;

    /**
     * Необязательно . Сообщение - это анимация, информация об анимации. Для обратной совместимости, когда это поле установлено, поле документа также
     * будет установлено
     */

    private Animation animation;

    /**
     * Опционально. Информация об аудиофайле
     */
    private Audio audio;

    /**
     * Опционально. Информация о файле
     */
    private Document document;

    /**
     * Опционально. Доступные размеры фото
     */
    private List<PhotoSize> photo;

    /**
     * Опционально. Информация о стикере
     */
    private Sticker sticker;

    /**
     * Опционально. Информация о видеозаписи
     */
    private Video video;

    /**
     * Необязательно . Сообщение - видеозаметка , информация о видеосообщении.
     */
    @JsonProperty("video_note")
    private VideoNote videoNote;

    /**
     * Опционально. Информация о голосовом сообщении
     */
    private Voice voice;

    /**
     * Опционально. Подпись к файлу, фото или видео, 0-200 символов
     */
    private String caption;

    /**
     * Необязательно . Для сообщений с подписью в подписи используются специальные объекты, такие как имена пользователей, URL-адреса, команды ботов и
     * т. Д.
     */
    @JsonProperty("caption_entities")
    private List<MessageEntity> captionEntities;

    /**
     * Опционально. Информация об отправленном контакте
     */
    private Contact contact;

    /**
     * Необязательно . Сообщение - это игральные кости со случайным значением
     */
    private Dice dice;

    /**
     * Необязательно . Сообщение - это игра, информация об игре. Подробнее об играх »
     */
    private Game game;

    /**
     * Необязательно . Сообщение - это нативный опрос, информация об опросе
     */
    private Poll poll;

    /**
     * Опционально. Информация о местоположении
     */
    private Location location;

    /**
     * Опционально. Информация о месте на карте
     */
    private Venue venue;

    /**
     * Опционально. Информация о пользователе, добавленном в группу
     */
    @JsonProperty("new_chat_member")
    private User newChatMember;

    /**
     * Опционально. Информация о пользователе, удалённом из группы
     */
    @JsonProperty("left_chat_member")
    private User leftChatMember;

    /**
     * Опционально. Название группы было изменено на это поле
     */
    @JsonProperty("new_chat_title")
    private String newChatTitle;

    /**
     * Опционально. Фото группы было изменено на это поле
     */
    @JsonProperty("new_chat_photo")
    private List<PhotoSize> newChatPhoto;

    /**
     * Опционально. Сервисное сообщение: фото группы было удалено
     */
    @JsonProperty("delete_chat_photo")
    private Boolean deleteChatPhoto;

    /**
     * Опционально. Сервисное сообщение: группа создана
     */
    @JsonProperty("group_chat_created")
    private Boolean groupChatCreated;

    /**
     * Опционально. Сервисное сообщение: супергруппа создана
     */
    @JsonProperty("supergroup_chat_created")
    private Boolean supergroupChatCreated;

    /**
     * Опционально. Сервисное сообщение: канал создан
     */
    @JsonProperty("channel_chat_created")
    private Boolean channelChatCreated;

    /**
     * Опционально. Группа была преобразована в супергруппу с указанным идентификатором. Не превышает 1e13
     */
    @JsonProperty("migrate_to_chat_id")
    private Integer migrateToChatId;

    /**
     * Опционально. Cупергруппа была создана из группы с указанным идентификатором. Не превышает 1e13
     */
    @JsonProperty("migrate_from_chat_id")
    private Integer migrateFromChatId;

    /**
     * Опционально. Указанное сообщение было прикреплено. Note that the Message object in this field will not contain further reply_to_message fields
     * even if it is itself a reply.
     */
    @JsonProperty("pinned_message")
    private Message pinnedMessage;

    /**
     * +Необязательно . Сообщение - это счет на оплату , информация о счете. Подробнее о платежах »
     */
    private Invoice invoice;

    /**
     * Необязательно . Сообщение - служебное сообщение об успешном платеже, информация о платеже. Подробнее о платежах »
     */
    @JsonProperty("successful_payment")
    private SuccessfulPayment successfulPayment;

    /**
     * Необязательно . Доменное имя сайта, на котором пользователь вошел в систему. Подробнее о входе в Telegram »
     */
    @JsonProperty("connected_website")
    private String connectedWebsite;

    /**
     * Необязательно . Данные Telegram Passport
     */
    @JsonProperty("passport_data")
    private PassportData passportData;

    /**
     * Необязательно . Сервисное сообщение. Пользователь в чате активировал оповещение о близости другого пользователя, когда делился своим
     * местоположением в реальном времени.
     */
    @JsonProperty("proximity_alert_triggered")
    private ProximityAlertTriggered proximityAlertTriggered;

    /**
     * Необязательно . Встроенная клавиатура, прикрепленная к сообщению. login_urlкнопки представлены как обычные urlкнопки.
     */
    @JsonProperty("reply_markup")
    private InlineKeyboardMarkup keyboardMarkup;
}
