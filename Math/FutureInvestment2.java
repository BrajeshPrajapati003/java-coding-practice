import java.util.Scanner;

public class FutureInvestment2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Investment Amout: ");
        double invest = sc.nextDouble();
        System.out.print("Enter the rate of Interest: ");
        double rate = sc.nextDouble();
        System.out.print("Enter the number of Years: ");
        int year = sc.nextInt();
        sc.close();

        // Convert the annual interest rate (entered as %) to decimal
        rate *= 0.01;

        // Header for the future value table
        System.out.println("\n Years \t FutureValue");
        System.out.println("--------------------------");

        for(int i=1; i<=year; i++){
            // future value for the current year using the futureValue()
            double futureVal = futureValue(invest, rate/12, i);

            // print the year and the future value, formatted to 2 decimal places
            System.out.printf("%-8d \t %.2f\n", i, futureVal);
        }
    }

    public static double futureValue(double investAmt, double monInvestRate, int years){
        // Formula for future value with compound interest:
        // FV(future value) = PV(present value) * (1+r)^n

        // FV = future value, PV = present value(investAmt), r = periodic interest rate(monInvestRate), n = total number of periods (year*12 for monthly compouding)

        return investAmt * Math.pow(1+monInvestRate, years*12);
    }
}
