interface Vehicle{
    void start();
}

interface Car extends Vehicle{
    void stop();
}

class Sedan implements Car{
    @Override
    public void start(){
        System.out.println("Sedan is starting...");
    }
    @Override
    public void stop(){
        System.out.println("Sedan is stoping...");
    }
}
public class InterfaceInheritance {
    public static void main(String[] args) {
        Sedan sd = new Sedan();
        sd.start();
        sd.stop();
    }
}
