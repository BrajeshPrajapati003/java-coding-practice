import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PassThePillow {
    static int passThePillow(int n, int time){
        int rounds = time / (n-1);
        int remainingTime = time % (n-1);
        
        if((rounds & 1) == 0) return 1 + remainingTime;
        else return n - remainingTime;
    }

    public static void main(String[] args) {
        try{
            BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter the number of people:");
            int n = Integer.parseInt(buff.readLine());
            System.out.println("Enter the time:");
            int time = Integer.parseInt(buff.readLine());
            System.out.println(passThePillow(n, time));

        }catch(IOException e){
            System.err.println("Error: IOException Occured!");
        }
    }
}
