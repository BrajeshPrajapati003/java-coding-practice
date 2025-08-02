import java.util.Arrays;

public class Lexicographic {
    public static void main(String[] args) {
        String str = "abx";
        powerSet(str);
    }

    public static void permutation(String str, int len, int idx, String curPer){
        System.out.println(curPer);
        for(int i = idx+1; i < len; i++){
            curPer += str.charAt(i);
            permutation(str, len, i, curPer);
            curPer = curPer.substring(0, curPer.length()-1);
        }
    }

    public static void powerSet(String str){
        char[] a = str.toCharArray();
        Arrays.sort(a);
        permutation(new String(a), str.length(), -1, "");
    }
}
