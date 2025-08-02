public class RepeatingChar {
    public static void main(String[] args) {
        String s1 = "Brajesh";
        String newString = "";
        for(int i=0; i<s1.length(); i++){
            // newString += s1.charAt(i);
            // newString += s1.charAt(i);
            newString += s1.substring(i, i+1)+s1.substring(i, i+1);
        }
        System.out.println(newString);
    }
}