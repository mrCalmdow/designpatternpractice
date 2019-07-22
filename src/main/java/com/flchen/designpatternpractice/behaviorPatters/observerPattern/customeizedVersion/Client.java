package com.flchen.designpatternpractice.behaviorPatters.observerPattern.customeizedVersion;

public class Client {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData(10, "rain");

        ForecastPanel forecast = new ForecastPanel(weatherData);

        forecast.subscribe();
        weatherData.notification();

        forecast.display();

        weatherData.updateData(34, "hot");
        forecast.display();
    }
}
