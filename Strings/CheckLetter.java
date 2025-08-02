public class CheckLetter {
    public static void main(String[] args) {
        String str = "brajesh prajapati";
        char ch = 'b';
        System.out.println("is "+ch+" present in the string - " + str + " ? : " + checkLetter(str, ch));
    }

    public static boolean checkLetter(String str, char ch){
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == ch) return true;
        }
        return false;
    }
}
