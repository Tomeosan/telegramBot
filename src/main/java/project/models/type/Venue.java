package project.models.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import project.models.type.Location;

/**
 * Этот объект представляет объект на карте
 */
@Data
public class Venue {

    /**
     * Координаты объекта
     */
    private Location location;

    /**
     * Название объекта
     */
    private String title;

    /**
     * Адрес объекта
     */
    private String address;

    /**
     * Опционально. Идентификатор объекта в Foursquare
     */
    @JsonProperty("foursquare_id")
    private String foursquareId;

    /**
     * Необязательно . Тип площадки Foursquare. (Например, «arts_entertainment / default», «arts_entertainment / aquarium» или «food / icecream».)
     */
    @JsonProperty("foursquare_type")
    private String foursquareType;

    /**
     * Необязательно . Идентификатор места проведения в Google Places
     */
    @JsonProperty("google_place_id")
    private String googlePlaceId;

    /**
     * Необязательно . Тип места проведения Google Places. (См. Поддерживаемые типы .)
     */
    @JsonProperty("google_place_type")
    private String googlePlaceType;
}
