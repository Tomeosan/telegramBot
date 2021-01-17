package project.models.type;

import lombok.Data;

/**
 * Этот объект представляет собой команду бота
 */
@Data
public class BotCommand {

    /**
     * Текст команды, 1-32 символа. Может содержать только строчные английские буквы, цифры и символы подчеркивания.
     */
    private String command;

    /**
     * Описание команды, 3–256 знаков.
     */
    private String description;

}
