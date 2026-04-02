package weather;

public class WeatherTracker {
    String currentConditions;
    Notifier phone;
    Notifier email;

    public WeatherTracker() {
        phone = NotifierFactory.getNotifier("phone");
        email = NotifierFactory.getNotifier("email");
    }

    public void setCurrentConditions(String weatherDescription) {
        this.currentConditions = weatherDescription;
        if (weatherDescription == "rainy") {
            String alert = phone.generateWeatherAlert(weatherDescription);
            System.out.print(alert);
        }
        if (weatherDescription == "sunny") {
            String alert = email.generateWeatherAlert(weatherDescription);
            System.out.print(alert);
        }
    }
}