public class Count_UpperLowerCase {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("brajesh PRAJAPATI");
        printCaseCount(sb);
    }

    public static void printCaseCount(StringBuilder sb){
        int lower = 0, upper = 0, other = 0, len = sb.length();
        for(int i=0; i<len; i++){
            if(Character.isLowerCase(sb.charAt(i))) lower++;
            else if(Character.isUpperCase(sb.charAt(i))) upper++;
            else other++;
        }

        System.out.println("Upper case count: " + upper);
        System.out.println("Lower case count: " + lower);
        System.out.println("Other characters count: " + other);
    }
}