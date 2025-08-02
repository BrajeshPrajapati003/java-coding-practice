import java.util.Scanner;
// public class CalcPower {
//     public static void main(String[] args) {
//         System.out.println("Enter the number: ");
//         Scanner sc = new Scanner(System.in);
//         int base = sc.nextInt();
//         System.out.println("Enter the power: ");
//         int pow = sc.nextInt();
//         sc.close();
//         double res = calcPow(base, pow);
//         System.out.println(res);
//     }

    //? Optimized Code but can be further optimized : O(n)
    // public static long calcPow(int base, int pow){
    //     if(base == 0) return 0;
    //     if(pow == 0) return 1;
    //     long res = 1;
    //     if(pow > 0){
    //         res = base * calcPow(base, pow-1);
    //     }
    //     return res;
    // }

    //? Further Optimization : O(n)
    // public static double calcPow(int base, int pow){
    //     if(base == 0 && pow == 0){
    //         throw new ArithmeticException("Indeterminate form 0^0");
    //     }
    //     if(pow == 0) return 1;
    //     if(pow > 0){
    //         return base * calcPow(base, pow-1);
    //     }
    //     return 1.0 / calcPow(base, -pow);
    // }

    //? Further Optimization : O(n)
    // public static double calcPow(int base, int pow){
    //     if(base == 0 && pow == 0){
    //         throw new ArithmeticException("Indeterminate form 0^0");
    //     }
    //     if(base == 0) return 0;
    //     if(pow == 0) return 1;
    //     if(pow > 0) return base * calcPow(base, pow-1);
    //     return 1.0 / calcPow(base, -pow);
    // }
// }

    //? Further Optimization (Using Exponentiation by Squaring): O(log n)
public class CalcPower{
    public static void main(String[] args){
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        System.out.println("Enter the power: ");
        int pow = sc.nextInt();
        sc.close();

        try{
            double res = calcPow(base, pow);
            System.out.println(res);
        }catch(ArithmeticException e){
            System.err.println(e.getMessage());
        }
    }

    public static double calcPow(int base, int pow){
        if(base == 0 && pow == 0){
            throw new ArithmeticException("Indeterminate form 0^0");
        }
        if(base == 0) return 0; // Handle base 0
        return pow > 0 ? calcPowPositive(base, pow) : 1.0 / calcPowPositive(base, -pow);
    }

    // Helper method to calculate the power using exponentiation by squaring
    private static double calcPowPositive(int base, int pow){
        if(pow == 0) return 1;
        double half = calcPowPositive(base, pow / 2); // Recursive call to calculate half the power

        // If power is even, multiply the halves; if odd, multiply by base as well
        return (pow % 2 == 0) ? half * half : half * half * base;
    }
}