interface WeatherService{
    String getWeatherInfo(String location);
}

public class CustomWeatherInfo {
    public static void main(String[] args) {
        WeatherService weatherService = new WeatherService() {
            @Override
            public String getWeatherInfo(String location){
                // Implement weather information retrieval logic here (e.g., using a weather API)
                return "Weather in " + location + " : Sunny, 43°C";
            }
        };
        
        String location = "Narmadapuram, MP";

        // Get weather information
        String weatherInfo = weatherService.getWeatherInfo(location);
        System.out.println(weatherInfo);
    }
}
