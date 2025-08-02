public class Upper2LowerCase {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("my name is BRAJESH PRAJAPATI");
        convert(sb);
        System.out.println(sb);
    }

    public static void convert(StringBuilder sb){
        for(int i=0; i<sb.length(); i++){
            if(Character.isUpperCase(sb.charAt(i))){
                sb.replace(i, i+1, (sb.charAt(i) + "").toLowerCase());
            }
        }
    }
}