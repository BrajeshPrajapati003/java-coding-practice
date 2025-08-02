interface CurrencyConverter{
    double convertCurrency(double amt, String fromCurr, String toCurr);
}

public class CustomCurrencyConversion2 {
    public static void main(String[] args) {
        CurrencyConverter currConverter = (double amt, String fromCurr, String toCurr) -> {
            if(fromCurr.equals("USD") && toCurr.equals("INR")){
                return amt * 83.0;
            }
            else if(fromCurr.equals("INR") && toCurr.equals("USD")){
                return amt;
            }
            else if(fromCurr.equals(toCurr)){
                return amt / 83.0;
            }
            else{
                // Handle other currency conversions or throw an exception
                System.out.println("Currency conversion not implemented for " + fromCurr + " to " + toCurr);
                return amt;
            }
        };

        double amt = 25000.0;
        String fromCurrency = "USD";
        String toCurrency = "INR";

        double convertedAmount = currConverter.convertCurrency(amt, fromCurrency, toCurrency);
        System.out.println("Converted Amount: " + convertedAmount + " " + toCurrency);

        double amt2 = 100000.0;
        String fromCurrency2 = "INR";
        String toCurrency2 = "USD";

        double convertedAmount2 = currConverter.convertCurrency(amt2, fromCurrency2, toCurrency2);
        System.out.println("Converted Amount: " + convertedAmount2 + " " + toCurrency2);

        double amt3 = 50.0;
        String fromCurrency3 = "EUR";
        String toCurrency3 = "JPY";

        double convertedAmount3 = currConverter.convertCurrency(amt3, fromCurrency3, toCurrency3);
        System.out.println("Converted Amount: " + convertedAmount3 + " " + toCurrency3);

        double amt4 = 100.0;
        String fromCurrency4 = "USD";
        String toCurrency4 = "USD";

        double convertedAmount4 = currConverter.convertCurrency(amt4, fromCurrency4, toCurrency4);
        System.out.println("Converted Amount: " + convertedAmount4 + " " + toCurrency4);

    }
}
