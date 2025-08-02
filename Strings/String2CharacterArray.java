public class String2CharacterArray {
    public static void main(String[] args) {
        String s1 = "Brajesh Prajapati";

        // 1 string -> char array (correct but not efficient)
        char[] charArr1 = new char[s1.length()];
        for(int i=0; i<s1.length(); i++){
            charArr1[i] = s1.charAt(i);
        }

        // 2 string -> char array (correct, simple and efficient)
        char[] charArr2 = s1.toCharArray();
        System.out.println(new String (charArr2));

        // char array -> string
        String s2 = charArr1.toString();
        System.out.println(charArr1.toString());
        System.out.println(s2); // garbled value

        // char array -> string (String class constructor)
        String str = new String(charArr1);
        System.out.println(str); //correct way
        System.out.println(new String(charArr1)); // correct way
        
        // without coverting into string
        System.out.println(charArr1);
        System.out.println(charArr1);

        // iterate over each element and print(correct but not efficient)
        for(char c: charArr1){
            System.out.print(c);
        }

        System.out.println();
    }
}