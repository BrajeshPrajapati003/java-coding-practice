import java.util.Scanner;
public class PerimeterOfCircle {
    public static void main(String[] args) {
        Perimeter p = new Perimeter();
        float radius = p.getRadius();
        System.out.println("Perimeter of the circle is : "+ p.findPerimeter(radius));
    }
}

class Perimeter{
    private float rad = 0.0f;
    public float getRadius(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        rad = sc.nextFloat();
        sc.close();
        return rad;
    }
    public float findPerimeter(float rad){
        float peri = 0.0f;
        peri = 2* (float) Math.PI*rad;
        return peri;
    }
}