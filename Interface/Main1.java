interface Shape{
    void draw();
}

class Circle implements Shape{
    @Override
    public void draw(){
        System.out.println("Drawing a circle...");
    }
}

public class Main1{
    public static void main(String[] args) {
        Circle crl = new Circle();
        crl.draw();
    }
}