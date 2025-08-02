public class Lower2UpperCase2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("brajesh prajapati is a coder");
        convert(sb);
        System.out.println(sb);
    }

    public static void convert(StringBuilder sb){
        for(int i=0; i<sb.length(); i++){
            if(Character.isLowerCase(sb.charAt(i))){
                sb.replace(i, i+1, (sb.charAt(i) + "").toUpperCase());
            }
        }
    }
}