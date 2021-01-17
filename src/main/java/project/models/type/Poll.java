package project.models.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 * Этот объект содержит информацию об опросе
 */
@Data
public class Poll {

    /**
     * Уникальный идентификатор опроса
     */
    private String id;

    /**
     * Вопрос опроса, 1-300 знаков
     */
    private String question;

    /**
     * Список вариантов опроса
     */
    private List<PollOption> options;

    /**
     * Общее количество пользователей, проголосовавших в опросе
     */
    @JsonProperty("total_voter_count")
    private Integer totalVoterCount;

    /**
     * Правда, если опрос закрыт
     */
    @JsonProperty("is_closed")
    private Boolean isClosed;

    /**
     * Правда, если опрос анонимный
     */
    @JsonProperty("is_anonymous")
    private Boolean isAnonymous;

    /**
     * Тип опроса, в настоящее время может быть «обычный» или «викторина».
     */
    private String type;

    /**
     * Верно, если опрос допускает несколько ответов
     */
    @JsonProperty("allows_multiple_answers")
    private Boolean allowsMultipleAnswers;

    /**
     * Необязательно . Отсчитываемый от 0 идентификатор правильного варианта ответа. Доступно только для опросов в режиме викторины, которые закрыты,
     * были отправлены (не перенаправлены) ботом или в приватный чат с ботом.
     */
    @JsonProperty("correct_option_id")
    private Integer correctOptionId;

    /**
     * Необязательно . Текст, который отображается, когда пользователь выбирает неправильный ответ или нажимает значок лампы в опросе в стиле
     * викторины, 0–200 символов
     */
    private String explanation;

    /**
     * Необязательно . Специальные объекты, такие как имена пользователей, URL-адреса, команды ботов и т. Д., Которые появляются в объяснении
     */
    @JsonProperty("explanation_entities")
    private List<MessageEntity> explanationEntities;

    /**
     * Необязательно . Время в секундах, в течение которого опрос будет активен после создания
     */
    @JsonProperty("open_period")
    private Integer openPeriod;

    /**
     * Необязательно . Момент времени (временная метка Unix), когда опрос будет автоматически закрыт
     */
    @JsonProperty("close_date")
    private Integer closeDate;
}
