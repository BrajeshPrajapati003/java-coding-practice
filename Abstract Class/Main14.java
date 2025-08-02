abstract class Shape{
    abstract void draw();
    private void display(){
        System.out.println("Displaying shape...");
    }

    void process(){
        display();
        draw();
    }
}

class Circle extends Shape{
    @Override
    void draw(){
        System.out.println("Drawing Circle...");
    }
}

public class Main14 {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.process();
    }
}
