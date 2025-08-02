public class StringSplitExample {
    public static void main(String[] args) {
        String str = "Brajesh Prajapati is learning to split the strings";
        String[] tokens = str.split("\\s+");

        for(String token : tokens){
            System.out.println(token);
        }

        System.out.println();
        System.out.println("String 2 starts here....");
        System.out.println();

        String str2 = "apple,banana;orange red red apple hihi";
        // Split on ,  , or ;
        String[] tokens2 = str2.split("[,; ]");

        for(String token : tokens2){
            System.out.println(token);
        }

    }
}
