
import java.util.Scanner;

public class RoundFloatNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a float number:");
        float f = sc.nextFloat();
        System.out.println("Given value: " + f);
        System.out.println("\nRounded value: " + roundNumber(f));
        sc.close();
    }

    public static float roundNumber(float f){
        float fNum = (float) Math.floor(f);
        float cNum = (float) Math.ceil(f);

        if((f-fNum) > (cNum-f)) return cNum;
        else if((cNum-f) > (f-fNum)) return fNum;
        else return cNum; 
    }
}
