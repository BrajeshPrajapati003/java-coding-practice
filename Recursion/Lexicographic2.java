import java.util.Arrays;
class Lexicographic2{
    public static void main(String[] args){
        String str = "abx";
        powerSet(str);
    }

    public static void permutation(String str, int len, int idx, StringBuilder currPerm){
        System.out.println(currPerm);
        for(int i=idx+1; i<len; i++){
            currPerm.append(str.charAt(i));
            permutation(str, len, i, currPerm);
            currPerm.deleteCharAt(currPerm.length()-1);
        }
    }

    public static void powerSet(String str){
        char[] a = str.toCharArray();
        Arrays.sort(a);
        permutation(new String(a), str.length(), -1, new StringBuilder());
    }
}