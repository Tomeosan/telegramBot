package project.models.type;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * Этот объект представляет собой чат
 */
@Data
public class Chat {

    /**
     * Уникальный идентификатор чата. Абсолютное значение не превышает 1e13
     */
    private Integer id;

    /**
     * Тип чата: “private”, “group”, “supergroup” или “channel”
     */
    private String type;

    /**
     * Опционально. Название, для каналов или групп
     */
    private String title;

    /**
     * Опционально. Username, для чатов и некоторых каналов
     */
    private String username;

    /**
     * Опционально. Имя собеседника в чате
     */
    @JsonProperty("first_name")
    private String firstName;

    /**
     * Опционально. Фамилия собеседника в чате
     */
    @JsonProperty("last_name")
    private String lastName;

    /**
     * Необязательно . Фото чата. Вернул только в getChat .
     */
    private ChatPhoto photo;

    /**
     * Необязательно . Биография собеседника в приватном чате. Вернул только в getChat .
     */
    private String bio;

    /**
     * Необязательно . Описание, для групп, супергрупп и чатов каналов. Вернул только в getChat .
     */
    private String description;

    /**
     * Необязательно . Ссылка для приглашения в чат для групп, супергрупп и чатов каналов. Каждый администратор в чате генерирует свои собственные
     * пригласительные ссылки, поэтому бот должен сначала создать ссылку с помощью exportChatInviteLink . Вернул только в getChat .
     */
    @JsonProperty("invite_link")
    private String inviteLink;

    /**
     * Необязательно . Последнее закрепленное сообщение (по дате отправки). Вернул только в getChat .
     */
    @JsonProperty("pinned_message")
    private Message pinnedMessage;

    /**
     * Необязательно . Разрешения участников чата по умолчанию для групп и супергрупп. Вернул только в getChat .
     */
    private ChatPermissions permissions;

    /**
     * Необязательно . Для супергрупп - минимально допустимая задержка между последовательными сообщениями, отправляемыми каждым непривилегированным
     * пользователем. Вернул только в getChat .
     */
    @JsonProperty("slow_mode_delay")
    private Integer slowModeDelay;

    /**
     * Необязательно . Для супергрупп - название набора групповых стикеров. Вернул только в getChat .
     */
    @JsonProperty("sticker_set_name")
    private String stickerSetName;

    /**
     * Необязательно . Правда, если бот умеет менять групповой набор стикеров. Вернул только в getChat .
     */
    @JsonProperty("can_set_sticker_set")
    private Boolean canSetStickerSet;

    /**
     * Необязательно . Уникальный идентификатор связанного чата, т. Е. Идентификатор группы обсуждения для канала и наоборот; для супергрупп и чатов
     * каналов. Длина этого идентификатора может превышать 32 бита, и некоторые языки программирования могут иметь затруднения / молчаливые дефекты
     * при его интерпретации. Но он меньше 52 бит, поэтому 64-битное целое число со знаком или плавающий тип двойной точности безопасны для хранения
     * этого идентификатора. Вернул только в getChat .
     */
    @JsonProperty("linked_chat_id")
    private Integer linkedChatId;

    /**
     * Необязательно . Для супергрупп - место, к которому супергруппа подключена. Вернул только в getChat .
     */
    private ChatLocation location;

}
