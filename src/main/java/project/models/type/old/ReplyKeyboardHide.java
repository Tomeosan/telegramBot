package project.models.type.old;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * После получения сообщения с этим объектом, приложение Telegram свернёт клавиатуру бота и отобразит стандартную клавиатуру устройства (с буквами).
 * По умолчанию клавиатуры бота отображаются до тех пор, пока не будет принудительно отправлена новая или скрыта старая клавиатура.
 * Исключение составляют одноразовые клавиатуры, которые скрываются сразу после нажатия на какую-либо кнопку (см. ReplyKeyboardMarkup).
 */
@Data
public class ReplyKeyboardHide {

    /**
     * Указание клиенту скрыть клавиатуру бота
     */
    @JsonProperty("hide_keyboard")
    private Boolean hideKeyboard;

    /**
     * Опционально. Используйте этот параметр, чтобы скрыть клавиатуру только у определённых пользователей. Цели:
     * 1) пользователи, которые были @упомянуты в поле text объекта Message; 2) если сообщения бота является ответом (содержит поле reply_to_message_id), авторы этого сообщения.
     * Пример: Пользователь голосует в опросе, бот отправляет сообщение с подтверждением и скрывает клавиатуру у этого пользователя, в то время как у всех остальных клавиатура видна.
     */
    private Boolean selective;


}
