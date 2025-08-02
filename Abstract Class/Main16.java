interface Drawable{
    void draw();
}

abstract class Shape implements Drawable{
    @Override
    public void draw(){
        System.out.println("Drawing Shape...");
    }

    abstract void info();
}

class Circle extends Shape{
    @Override
    void info(){
        System.out.println("This is a circle...");
    }
}

public class Main16 {
    public static void main(String[] args) {
        Circle crl = new Circle();
        crl.draw();
        crl.info();
    }
}
