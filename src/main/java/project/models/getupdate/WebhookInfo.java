package project.models.getupdate;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 * Содержит информацию о текущем состоянии веб-перехватчика.
 */
@Data
public class WebhookInfo {

    /**
     * URL-адрес веб-перехватчика, может быть пустым, если веб-перехватчик не настроен
     */
    private String url;

    /**
     * Верно, если для проверки сертификата веб-перехватчика был предоставлен настраиваемый сертификат
     */
    @JsonProperty("has_custom_certificate")
    private Boolean hasCustomCertificate;

    /**
     * Количество обновлений, ожидающих доставки
     */
    @JsonProperty("pending_update_count")
    private Integer pendingUpdateCount;

    /**
     * Необязательно . Текущий IP-адрес веб-перехватчика
     */
    @JsonProperty("ip_address")
    private String ipAddress;

    /**
     * Необязательно . Время Unix для самой последней ошибки, которая произошла при попытке доставить обновление через webhook
     */
    @JsonProperty("last_error_date")
    private Integer lastErrorDate;

    /**
     * Необязательно . Сообщение об ошибке в удобочитаемом формате для самой последней ошибки, которая произошла при попытке доставить обновление
     * через веб-перехватчик
     */
    @JsonProperty("last_error_message")
    private String lastErrorMessage;

    /**
     * Необязательно . Максимально допустимое количество одновременных HTTPS-подключений к веб-перехватчику для доставки обновлений
     */
    @JsonProperty("max_connections")
    private Integer maxConnections;

    /**
     * Необязательно . Список типов обновлений, на которые подписан бот. По умолчанию для всех типов обновлений
     */
    @JsonProperty("allowed_updates")
    private List<String> allowedUpdates;
}
