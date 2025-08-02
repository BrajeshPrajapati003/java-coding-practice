interface TemperatureConverter{
    double celsius2Fahrenheit(double celsius);
    double fahrenheit2Celsius(double fahrenheit);
}

public class CustomTemperatureConversion {
    public static void main(String[] args) {
        TemperatureConverter tempConverter = new TemperatureConverter() {
            @Override
            public double celsius2Fahrenheit(double celsius){
                // Implement celsius to fahrenheit conversion
                return (celsius * 9/5) + 32;
            }

            @Override
            public double fahrenheit2Celsius(double fahrenheit){
                // Implement fahrenheit to celsius conversion
                return (fahrenheit - 32) * 5/9;
            }
        };

        double celsiusVal = 25.0;
        double fahrenheitVal = 77.0;

        // Convert celsius to fahrenheit
        double fahrenheitResult = tempConverter.celsius2Fahrenheit(celsiusVal);
        System.out.println(celsiusVal + "°C is " + fahrenheitResult + "°F");

        double celsiusResult = tempConverter.fahrenheit2Celsius(fahrenheitVal);
        System.out.println(fahrenheitVal + "°F is " + celsiusResult + "°C");
    }
}
