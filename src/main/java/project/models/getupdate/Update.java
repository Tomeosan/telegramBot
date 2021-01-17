package project.models.getupdate;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import project.models.inlinemode.ChosenInlineResult;
import project.models.inlinemode.InlineQuery;
import project.models.payments.PreCheckoutQuery;
import project.models.payments.ShippingQuery;
import project.models.type.Poll;
import project.models.type.PollAnswer;
import project.models.type.CallbackQuery;
import project.models.type.Message;

/**
 * Этот объект представляет входящее обновление.
 * В любом данном обновлении может присутствовать не более одного из дополнительных параметров.
 */
@Data
public class Update {

    /**
     * Уникальный идентификатор обновления. Идентификаторы обновления начинаются с определенного положительного числа и последовательно увеличиваются.
     * Этот идентификатор становится особенно удобным, если вы используете Webhooks , поскольку он позволяет игнорировать повторяющиеся обновления или
     * восстанавливать правильную последовательность обновлений, если они выходят из строя. Если новых обновлений нет хотя бы неделю, то идентификатор
     * следующего обновления будет выбран случайным образом, а не последовательно.
     */
    @JsonProperty("update_id")
    private Integer updateId;

    /**
     * Необязательно . Новое входящее сообщение любого типа - текст, фото, стикер и т. Д.
     */
    private Message message;

    /**
     * Необязательно . Новая версия сообщения, известная боту и отредактированная
     */
    private Message edited;

    /**
     * Необязательно . Новые входящие сообщения на канале любого типа - текст, фото, стикеры и т. Д.
     */
    @JsonProperty("channel_post")
    private Message channelPost;

    /**
     * Необязательно . Новая версия поста на канале, известная боту и отредактированная
     */
    @JsonProperty("edited_channel_post")
    private Message editedChannelPost;

    /**
     * Необязательно . Новый входящий встроенный запрос
     */
    @JsonProperty("inline_query")
    private InlineQuery inlineQuery;

    /**
     * Необязательно . Результат встроенного запроса, который был выбран пользователем и отправлен своему партнеру по чату. Пожалуйста, ознакомьтесь с
     * нашей документацией по сбору отзывов, чтобы узнать, как включить эти обновления для вашего бота.
     */
    @JsonProperty("chosen_inline_result")
    private ChosenInlineResult chosenInlineResult;

    /**
     * Необязательно . Новый входящий запрос обратного вызова
     */
    @JsonProperty("allback_query")
    private CallbackQuery allbackQuery;

    /**
     * Необязательно . Новый входящий запрос на доставку. Только для счетов с гибкой ценой
     */
    @JsonProperty("shipping_query")
    private ShippingQuery shippingQuery;

    /**
     * Необязательно . Новый входящий предварительный запрос. Содержит полную информацию о кассе
     */
    @JsonProperty("pre_checkout_query")
    private PreCheckoutQuery preCheckoutQuery;

    /**
     * Необязательно . Новое состояние опроса. Боты получают только обновления об остановленных опросах и опросах, которые отправляет бот.
     */
    private Poll poll;

    /**
     * Необязательно . Пользователь изменил свой ответ в неанонимном опросе. Боты получают новые голоса только в опросах, которые отправил сам бот.
     */
    @JsonProperty("poll_answer")
    private PollAnswer pollAnswer;
}
