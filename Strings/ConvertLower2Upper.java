public class ConvertLower2Upper {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("Brajesh Prajapati cse student");
        System.out.println("Given String: " + str);

        convert2Uppercase(str);
        System.out.println("Converted to uppercase: " + str);
    }

    public static void convert2Uppercase(StringBuffer str){
        int len = str.length();
        for(int i=0; i<len; i++){
            Character c = str.charAt(i);
            if(Character.isLowerCase(c)){
                str.replace(i, i+1, Character.toUpperCase(c) + "");
            }
        }
    }
}