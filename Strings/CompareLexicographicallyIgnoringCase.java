public class CompareLexicographicallyIgnoringCase {
    public static void main(String[] args) {
        String s1 = "Brajesh Prajapati";
        String s2 = "brajesh prajapati";
        int res = s1.compareToIgnoreCase(s2);
        if(res>0){
            System.out.println(s1+" is greater than "+ s2);
        }else if(res == 0){
            System.out.println(s1 + " is equal to "+s2);
        }else{
            System.out.println(s1+" is lesser than "+s2);
        }
    }
}
