package project.models.getupdate;

import lombok.Data;

/**
 * Используйте этот метод, чтобы получить текущий статус веб-перехватчика. Не требует параметров. В случае успеха возвращает объект WebhookInfo . Если
 * бот использует getUpdates , он вернет объект с пустым полем url .
 */
@Data
public class getWebhookInfo {

    private WebhookInfo webhookInfo;
}
