package project.models.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 * Этот объект представляет встроенную клавиатуру, которая появляется под соответствующим сообщением
 */
@Data
public class InlineKeyboardMarkup {

    /**
     * Массив массивов с InlineKeyboardButton	Массив строк, каждая из которых является массивом объектов InlineKeyboardButton.
     */
    @JsonProperty("inline_keyboard")
    private List<List<InlineKeyboardButton>> inlineKeyboard;
}
