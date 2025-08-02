public class CountSubstring {
    public static void main(String[] args) {
        String str = "XYX";
        int n = str.length();
        System.out.println("Total substrings with same first and last character:" + countSubstring(str, 0, n-1, n));
    }

    public static int countSubstring(String str, int i, int j, int n){
        if(n == 1) return 1;
        if(n <= 0) return 0;
        int res = countSubstring(str, i+1, j, n-1) + countSubstring(str, i, j-1, n-1) - countSubstring(str, i+1, j-1, n-2);
        if(str.charAt(i) == str.charAt(j)) res++;
        return res;
    }
}
