package project.models.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * Этот объект представляет бота или пользователя Telegram
 */
@Data
public class User {

    /**
     * Уникальный идентификатор пользователя или бота
     */
    private Integer id;

    /**
     * Верно, если этот пользователь бот
     */
    @JsonProperty("is_bot")
    private Boolean isBot;

    /**
     * Имя бота или пользователя
     */
    @JsonProperty("first_name")
    private String firstName;

    /**
     * Опционально. Фамилия бота или пользователя
     */
    @JsonProperty("last_name")
    private String lastName;

    /**
     * Опционально. Username пользователя или бота
     */
    private String username;

    /**
     * Необязательно . Языковой тег IETF языка пользователя
     */
    @JsonProperty("language_code")
    private String languageCode;

    /**
     * Необязательно . Правда, если бота можно приглашать в группы. Вернулся только в getMe .
     */
    @JsonProperty("can_join_groups")
    private Boolean canJoinGroups;

    /**
     * Необязательно . Верно, если для бота отключен приватный режим . Вернулся только в getMe .
     */
    @JsonProperty("can_read_all_group_messages")
    private Boolean canReadAllGroupMessages;

    /**
     * Необязательно . Правда, если бот поддерживает встроенные запросы. Вернулся только в getMe .
     */
    @JsonProperty("supports_inline_queries")
    private Boolean supportsInlineQueries;
}
