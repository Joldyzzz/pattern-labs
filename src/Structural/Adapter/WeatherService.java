package Structural.Adapter;

public interface WeatherService {
    double getTemperature();

    double getWind();

    double getFeelsLikeTemperature();

    void setPosition(String city);
}
