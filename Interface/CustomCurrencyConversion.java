interface CurrencyConverter{
    double convertCurrency(double amt, String fromCurrency, String toCurrency);
}

public class CustomCurrencyConversion {
    public static void main(String[] args) {
        CurrencyConverter currencyConverter = new CurrencyConverter() {
            @Override
            public double convertCurrency(double amt, String fromCurr, String toCurr){
                // Implement currency conversion logic here
                // For simplicity, we'll return the same amount without conversion
                return amt;
            }
        };

        double amt = 25000.0;
        String fromCurrency = "USD";
        String toCurrency = "INR";

        double convertedAmount = currencyConverter.convertCurrency(amt, fromCurrency, toCurrency);
        System.out.println("Converted Amount: " + convertedAmount + " " + toCurrency);
    }
}
