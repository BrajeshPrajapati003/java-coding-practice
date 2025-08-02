
import java.util.Scanner;

public class FutureInvestment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Investment Amount: ");
        double invest = sc.nextDouble();
        System.out.print("Enter the rate of Interest: ");
        double rate = sc.nextDouble();
        System.out.print("Enter the number of Years: ");
        int year = sc.nextInt();
        sc.close();

        // Convert the annual interest rate (entered as a percentage) to a decimal
        rate *= 0.01;

        System.out.println("\nYears     FutureValue");
        System.out.println(".....................");
        for(int i=1; i<=year; i++){
            int format = 19;
            if(i>=10) format = 18;
            System.out.printf(i+"%"+format+".2f\n", futureValue(invest, rate/12, i));
        }
    }

    public static double futureValue(double investAmt, double monthlyInvestRate, int years){
        return investAmt * Math.pow(1+monthlyInvestRate, years*12);
    }
}
