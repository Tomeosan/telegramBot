package project.models.getupdate;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * Используйте этот метод для удаления интеграции с веб-перехватчиком, если вы решите вернуться к getUpdates . В случае успеха возвращает True .
 */
@Data
public class deleteWebhook {

    /**
     * Необязательный	Передайте True, чтобы удалить все ожидающие обновления
     */
    @JsonProperty("drop_pending_updates")
    private Boolean dropPendingUpdates;
}
