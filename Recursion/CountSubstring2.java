public class CountSubstring2 {
    public static void main(String[] args) {
        String str = "XYX";
        int n = str.length();
        System.out.println("Total substrings with same first and last character:" + countSubstring(str, 0, n - 1));
    }

    public static int countSubstring(String str, int i, int j) {
        if (i > j) {
            return 0; // Base case: no substring
        }
        int count = 0;
        if (str.charAt(i) == str.charAt(j)) {
            count = 1; // Count the substring from i to j
        }
        
        // Count substrings starting from i+1
        count += countSubstring(str, i + 1, j);
        // Count substrings ending at j-1
        count += countSubstring(str, i, j - 1);
        // Subtract overlapping substrings
        count -= countSubstring(str, i + 1, j - 1);

        return count;
    }
}