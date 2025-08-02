interface Drawable{
    void draw(); // implicitly public and abstract
}

interface Resizable{
    void resize(); // implicitly public and abstract
}

class Shape implements Drawable, Resizable{
    @Override
    public void draw(){ // make explicitly : public; otherwise compiler will not allow it

        // Method must be public to match the interface
        System.out.println("Shape class draw");
    }

    // Default access modifier (package-private) - this will cause a compilation error

    @Override
    public void resize(){ // make explicitly : public
        System.out.println("Shape class resize");
    }
}

public class InterfaceInheritance {
    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.draw();
        shape.resize();
    }
}