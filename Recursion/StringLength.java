public class StringLength {
    public static void main(String[] args) {
        String str = "Brajesh Prajapati";
        System.out.println("Given string: " + str);
        System.out.println("String length: " + calcStringLength(str));
    }

    private static int calcStringLength(String str){
        if(str.equals("")) return 0;
        else return calcStringLength(str.substring(1)) + 1;
    }
}
