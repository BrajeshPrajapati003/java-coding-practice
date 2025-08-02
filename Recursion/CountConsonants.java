public class CountConsonants {
    public static void main(String[] args) {
        String str = "Brajesh Prajapati";
        System.out.println("Given string: " + str);
        System.out.println("Total number of consonants: " + calcCount(str,str.length()));
    }

    public static int calcCount(String str, int len){
        if(len == 1){
            if(isConsonant(str.charAt(0))) return 1;
            else return 0;
        }
        if(isConsonant(str.charAt(len-1))) return (calcCount(str, len-1)+1);
        else return calcCount(str, len-1);
    }

    public static boolean isConsonant(char ch){
        ch = Character.toUpperCase(ch);
        return (ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U') == false && ch>=65 && ch<=90;
    }
}
