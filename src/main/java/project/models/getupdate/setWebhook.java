package project.models.getupdate;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import project.models.type.InputFile;

import java.util.List;

/**
 * Используйте этот метод, чтобы указать URL-адрес и получать входящие обновления через исходящий веб-перехватчик. При каждом обновлении для бота мы
 * отправляем запрос HTTPS POST на указанный URL-адрес, содержащий сериализованное обновление JSON . В случае неудачного запроса мы откажемся от него
 * после разумного количества попыток. В случае успеха возвращает True .
 * <p>
 * Если вы хотите убедиться, что запрос Webhook исходит от Telegram, мы рекомендуем использовать секретный путь в URL-адресе, например
 * https://www.example.com/<token>. Поскольку никто другой не знает токен вашего бота, можете быть уверены, что это мы.
 */
@Data
public class setWebhook {

    /**
     * Обязательное.	URL HTTPS для отправки обновлений. Используйте пустую строку, чтобы удалить интеграцию с веб-перехватчиком
     */
    private String url;

    /**
     * Необязательный	Загрузите сертификат открытого ключа, чтобы можно было проверить используемый корневой сертификат. См. Подробности в нашем
     * самоподписанном руководстве .
     */
    private InputFile certificate;

    /**
     * Необязательный	Фиксированный IP-адрес, который будет использоваться для отправки запросов веб-перехватчика вместо IP-адреса, разрешенного через
     * DNS.
     */
    @JsonProperty("ip_address")
    private String ipAddress;

    /**
     * Максимально допустимое количество одновременных HTTPS-подключений к веб-перехватчику для доставки обновлений, 1–100. По умолчанию 40 .
     * Используйте более низкие значения, чтобы ограничить нагрузку на сервер вашего бота, и более высокие значения, чтобы увеличить пропускную
     * способность вашего бота.
     */
    @JsonProperty("max_connections")
    private Integer maxConnections;

    /**
     * Необязательный	Сериализованный в формате JSON список типов обновлений, которые должен получать ваш бот. Например, укажите [«сообщение»,
     * «edited_channel_post», «callback_query»], чтобы получать обновления только этих типов. См. Обновление для получения полного списка доступных
     * типов обновлений. Укажите пустой список для получения всех обновлений независимо от типа (по умолчанию). Если не указано, будет использоваться
     * предыдущая настройка. Обратите внимание, что этот параметр не влияет на обновления, созданные до вызова setWebhook, поэтому нежелательные
     * обновления могут быть получены в течение короткого периода времени.
     */
    @JsonProperty("allowed_updates")
    private List<String> allowedUpdates;

    /**
     * Необязательный	Передайте True, чтобы удалить все ожидающие обновления
     */
    @JsonProperty("drop_pending_updates")
    private Boolean dropPendingUpdates;

}