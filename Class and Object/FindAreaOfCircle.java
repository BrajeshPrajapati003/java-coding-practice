import java.util.Scanner;
public class FindAreaOfCircle {
    public static void main(String[] args) {
        Area ob = new Area();
        double radius = ob.takeInput();
        System.out.println("Area of the circle is: "+ ob.findArea(radius));
    }
}

class Area{
    private double rad = 0;
    private final double pi = 3.14;
    private double area = 0.0f;
    public double takeInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        rad = (double) sc.nextDouble();
        sc.close();
        return rad;
    }

    public double findArea(double radius){
        if(radius > 0){
            area = Math.PI*rad*rad;
        }else if(radius<0){
            System.out.println("Radius value is invalid....");
        }
        return area;
    }

}