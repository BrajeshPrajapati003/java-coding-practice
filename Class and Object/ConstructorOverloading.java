public class ConstructorOverloading {
    public static void main(String[] args) {
        Constructor c1 = new Constructor();
        Constructor c2 = new Constructor(43, 23);
    }
}

class Constructor{
    Constructor(){
        System.out.println("This is non-parametrized constructor");
    }
    Constructor(int a, int b){
        System.out.println("This constructor adds two values: "+(a+b));
    }
}