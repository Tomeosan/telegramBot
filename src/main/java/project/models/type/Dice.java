package project.models.type;

import lombok.Data;

/**
 * Этот объект представляет собой анимированный смайлик, который отображает случайное значение.
 */
@Data
public class Dice {

    /**
     * Эмодзи, на которых основана анимация броска кости
     */
    private String emoji;

    /**
     * Значение кубика: 1-6 для базовых смайлов « 🎲» и « 🎯», 1-5 для базовых смайлов « 🏀» и « ⚽», 1-64 для 🎰базовых смайлов «».
     */
    private Integer value;
}