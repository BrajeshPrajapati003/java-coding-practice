public class PrintAtoZ {
    public static void main(String[] args) {
        System.out.println("Alphabets from a to z");
        for(char i='a'; i<='z'; i++){
            System.out.print(i+" ");
        }
        System.out.println();

        System.out.println("Alphabets from z to a");
        for(char i='z'; i>='a'; i--){
            System.out.print(i+" ");
        }
        System.out.println();

        System.out.println("Alphabets from A to Z");
        for(char i='A'; i<='Z'; i++){
            System.out.print(i+" ");
        }
        System.out.println();

        System.out.println("Alphabets from Z to A");
        for(char i='Z'; i>='A'; i--){
            System.out.print(i+" ");
        }
    }
}
