package project.models.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * Этот объект представляет файл, готовый к загрузке. Он может быть скачан по ссылке вида
 * https://api.telegram.org/file/bot<token>/<file_path>. Ссылка будет действительна как минимум в течение 1 часа.
 * По истечении этого срока она может быть запрошена заново с помощью метода getFile.
 * <p>
 * Максимальный размер файла для скачивания — 20 МБ
 */
@Data
public class File {

    /**
     * Уникальный идентификатор файла
     */
    @JsonProperty("file_id")
    private String fileId;

    /**
     * Уникальный идентификатор этого файла, который должен быть одинаковым с течением времени и для разных ботов. Невозможно использовать для
     * загрузки или повторного использования файла
     */
    @JsonProperty("file_unique_id")
    private String fileUniqueId;

    /**
     * Опционально. Размер файла, если известен
     */
    @JsonProperty("file_size")
    private Integer fileSize;

    /**
     * Опционально. Расположение файла. Для скачивания воспользуйтейсь ссылкой вида https://api.telegram.org/file/bot<token>/<file_path>
     */
    @JsonProperty("file_path")
    private String filePath;
}
