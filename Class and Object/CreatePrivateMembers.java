import java.util.Scanner;
public class CreatePrivateMembers {
    public static void main(String[] args) {
        PrivateMember ob = new PrivateMember();
        System.out.println("private variable is: " + ob.accessMethod());
    }
}

class PrivateMember{
    Scanner sc = new Scanner(System.in);
    private int privateVar = 0;
    public int accessMethod(){
        privateVar = sc.nextInt();
        return privateVar;
    }
}