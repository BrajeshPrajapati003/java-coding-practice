enum Currency{
    USD, EUR, GBP
}

class CurrencyConverter{
    double convert(Currency from, Currency to, double amt){
        return 0.0; // Implement currency conversion logic
    }

    double convert(Currency from, Currency to, double... amts){
        double total = 0.0;
        for(double amt: amts){
            total += convert(from, to, amt);
        }
        return total;
    }
}

public class Main {
    public static void main(String[] args) {
        CurrencyConverter convertor = new CurrencyConverter();
        double amt1 = convertor.convert(Currency.EUR, Currency.USD, 100.0);
        double totalAmt = convertor.convert(Currency.USD, Currency.EUR, 50.0, 75.0, 125.0);

        System.out.println("Converted amount: " + amt1);
        System.out.println("Total converted amout: " + totalAmt);
    }
}
