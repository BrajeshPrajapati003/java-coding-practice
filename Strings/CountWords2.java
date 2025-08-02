public class CountWords2 {
    public static void main(String[] args) {
        String originalString = "Brajesh Prajapati is a wizard of programming and Brajesh Prajapati loves Trollhunters tales of Arcadia";
        String[] words = originalString.split(" ");
        int wrc = 1;

        for(int i=0; i<words.length; i++){
            for(int j=i+1; j<words.length; j++){
                if(words[i].equals(words[j])){
                    words[j] = "0";
                    wrc++;
                }
            }

            if(words[i] != "0"){
                System.out.println(words[i] + " = "+ wrc);
            }
            wrc = 1;
        }
    }
}
