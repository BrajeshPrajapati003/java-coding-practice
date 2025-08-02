public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "brajesh prajapati";
        System.out.println("Given String: "+str);
        char[] arr = str.toCharArray();
        String newStr = "";
        for(char s: arr){
            if(newStr.indexOf(s) == -1){
                newStr += s;
            }
        }
        System.out.println("After removing duplicate characters: "+newStr);
    }
}