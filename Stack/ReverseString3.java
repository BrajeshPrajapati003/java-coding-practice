public class ReverseString3 {
    public static void main(String[] args) {
        String str = "Brajesh Prajapati";
        System.out.println("Original String: " + str);

        StringBuilder sb = new StringBuilder();
        for(int i=str.length()-1; i>=0; i--){
            char ch = str.charAt(i);
            sb.append(ch);
        }

        System.out.println("Reversed String: " + sb);
    }
}
