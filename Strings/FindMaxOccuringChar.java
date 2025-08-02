public class FindMaxOccuringChar {
    public static void main(String[] args) {
        String str = "brajesh prajapati";
        int[] arr = new int[250];

        // Counting character frequency
        for(int i=0; i<str.length(); i++){
            arr[str.charAt(i)]++;
        }
        
        // To count the maximum occuring character
        int max = -1;

        // To store the maximum occuring character
        char res = ' ';
        for(int i=0; i<str.length(); i++){
            if(max < arr[str.charAt(i)]){
                max = arr[str.charAt(i)];
                res = str.charAt(i);
            }
        }
        System.out.println(res);
    }
}