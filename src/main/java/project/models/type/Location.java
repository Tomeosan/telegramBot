package project.models.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * Этот объект представляет точку на карте
 */
@Data
public class Location {

    /**
     * Долгота, заданная отправителем
     */
    private Float longitude;

    /**
     * Широта, заданная отправителем
     */
    private Float latitude;

    /**
     * Необязательно . Радиус неопределенности местоположения, измеряемый в метрах; 0-1500
     */
    @JsonProperty("horizontal_accuracy")
    private Float horizontalAccuracy;

    /**
     * Необязательно . Время относительно даты отправки сообщения, в течение которого местоположение может быть обновлено, в секундах. Только для
     * активных живых локаций.
     */
    @JsonProperty("live_period")
    private Integer livePeriod;

    /**
     * Необязательно . Направление, в котором движется пользователь, в градусах; 1-360. Только для активных живых локаций
     */
    private Integer heading;

    /**
     * Необязательно . Максимальное расстояние для оповещений о приближении к другому участнику чата в метрах. Только для отправленных живых
     * местоположений.
     */
    @JsonProperty("proximity_alert_radius")
    private Integer proximityAlertRadius;
}