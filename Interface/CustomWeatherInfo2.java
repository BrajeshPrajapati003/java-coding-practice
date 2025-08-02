interface WeatherService{
    String getWeatherInfo(String location);
}

public class CustomWeatherInfo2 {
    public static void main(String[] args) {
        WeatherService weatherService = (String location) -> {
            // For simplicity, we'll return a static response. In a real app, you would fetch data from an external API.

            if(location.equalsIgnoreCase("Bhopal")){
                return "Weather in Bhopal: Sunny, 66°C";
            }else if(location.equalsIgnoreCase("Narmadapuram")){
                return "Weather in Narmadapuram: Cloudy, 43°C";
            }else{
                return "Weather information not available for " + location;
            }
        };

        String location = "Narmadapuram";
        String weatherInfo = weatherService.getWeatherInfo(location);
        System.out.println(weatherInfo);

        String location2 = "Bhopal";
        String weatherInfo2 = weatherService.getWeatherInfo(location2);
        System.out.println(weatherInfo2);

        String location3 = "Unknown Location";
        String weatherInfo3 = weatherService.getWeatherInfo(location3);
        System.out.println(weatherInfo3);
    }
}
