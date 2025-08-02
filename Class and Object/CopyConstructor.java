public class CopyConstructor {
    public static void main(String[] args) {
        Constructor c1 = new Constructor(66);
        Constructor c2 = new Constructor(c1);
    }
}

class Constructor{

    // Shallow copy of the constructor

    Constructor(int a){
        System.out.println("Constructor  1");
    }
    Constructor(Constructor a){
        System.out.println("This is copy constructor...");
        
    }
}