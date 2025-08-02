public class Search_A_Word {
    public static void main(String[] args) {
        String str = "roll number hai 66";
        int idx = str.indexOf("hai");
        if(idx == -1) System.out.println("Target word is not found!");
        else System.out.println("Target word is found at index: "+idx); // 12
    }
}
