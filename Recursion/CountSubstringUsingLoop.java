public class CountSubstringUsingLoop {
    public static void main(String[] args) {
        String str = "kashishh";
        System.out.println("The total number of substrings starting and ending with same character: " + countSubstrings(str));
    }

    public static int countSubstrings(String str){
        int n = str.length();
        int count = 0;

        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                if(str.charAt(i) == str.charAt(j)) count++;
            }
        }
        return count;
    }
}
