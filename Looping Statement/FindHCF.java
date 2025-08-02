public class FindHCF {
    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int toFindGCD(int a, int b) {
        while (b != 0) {
            a %= b;
            if (a == 0) return b;
            b %= a;
        }
        return a;
    }
/*
    Version 1 is more conventional and easier to understand, which makes it a better choice for most cases, especially for readability and maintainability.

    Version 2 is slightly more optimized in terms of assignments but might be less readable.

    Overall, readability and maintainability are often more important than micro-optimizations, so I would recommend sticking with Version 1 unless you have specific performance constraints that necessitate the more optimized approach.
 */
    public static int findHCF(int a, int b){
        // Base Cases
        if(a == 0) return b;
        if(b == 0) return a;

        //Reduce larger number by subtracting the smaller one
        while(a != b){
            if(a > b) a = a-b;
            else b = b-a;
        }
        return a; // Or return b since a == b
    }
/*
    While this subtraction-based method is simple and intuitive, it may be less efficient compared to the Euclidean algorithm using the modulo operation for large numbers. Nevertheless, it's a valid method and a good option in cases where division is significantly more expensive or not available.
*/
    public static void main(String[] args) {
        int n1 = 43;
        int n2 = 66;
        int hcf = findGCD(n1, n2);
        int hcf2 = toFindGCD(n1, n2);
        int hcf3 = findHCF(n1, n2);

        System.out.println(hcf);
        System.out.println(hcf2);
        System.out.println(hcf3);
    }
}