
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PlusOne{
    static int[] plusOne(int[] nums){
        int n = nums.length;
        for(int i=n-1; i>=0; i--){
            if(nums[i] < 9){
                nums[i] = nums[i] + 1;
                return nums;
            }
            nums[i] = 0;
        }

        int[] newNum = new int[n+1];
        newNum[0] = 1;
        return newNum;
    }

    public static void main(String[] args) {
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Enter the number of digits: ");
            int n = Integer.parseInt(buff.readLine());

            int[] digits = new int[n];
            System.out.println("Enter the digits one by one (e.g., 1 2 3 for [1,2,3]):");
            String[] digitStrings = buff.readLine().split(" ");

            if (digitStrings.length != n) {
                System.out.println("Error: Number of digits entered does not match the specified count.");
                return;
            }

            for (int i = 0; i < n; i++) {
                digits[i] = Integer.parseInt(digitStrings[i]);
            }

            // Call the plusOne method
            int[] result = plusOne(digits);

            // Print the result
            System.out.print("Result after plus one: [");
            for (int i = 0; i < result.length; i++) {
                System.out.print(result[i]);
                if (i < result.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");

        } catch (IOException e) {
            System.err.println("An I/O error occurred: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Invalid input. Please enter valid integers: " + e.getMessage());
        } finally {
            try {
                if (buff != null) {
                    buff.close(); // Close the BufferedReader
                }
            } catch (IOException e) {
                System.err.println("Error closing BufferedReader: " + e.getMessage());
            }
        }
    }
}