public class CopyString {
    public static void main(String[] args) {
        char str1[] = "brajesh prajapati".toCharArray();
        char str2[] = new char[str1.length];

        int idx = 0;
        stringCopy(str1, str2, idx);
        System.out.println("String 1: " + String.valueOf(str1));
        System.out.println("String 2: " + String.valueOf(str2));
    }

    public static void stringCopy(char[] str1, char[] str2, int idx){
        if(idx >= str1.length) return;
        str2[idx] = str1[idx];
        stringCopy(str1, str2, idx+1);
    }
}
