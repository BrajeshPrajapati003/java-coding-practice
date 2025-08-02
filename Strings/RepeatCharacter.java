public class RepeatCharacter {
    public static void main(String[] args) {
        String s1 = "Brajesh Prajapati";
        System.out.println(repeat(s1));
    }

    public static String repeat(String s1){
        String s = new String();
        for(int i=0; i<s1.length(); i++){
            /* if(s1.charAt(i) != ' ') */ s = s+s1.charAt(i)+s1.charAt(i);
        }
        return s;
    }
}
