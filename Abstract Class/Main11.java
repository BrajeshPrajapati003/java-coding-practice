public class Main11 {
    public static void main(String[] args) {
        
    }
}

abstract class Shape{
    protected abstract void draw();
}

class Circle extends Shape{
    @Override
    protected void draw(){
        System.out.println("Drawing Circle...");
    
}