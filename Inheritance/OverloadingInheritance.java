// Method Overloading Across Different Classes

class One{
    public void displayName(){
        System.out.println("Car Started");
    }
}

class OnePointOne extends One{
    public void displayName(String name){
        System.out.println("Car name: "+name);
    }
}

public class OverloadingInheritance {
    public static void main(String[] args) {
        OnePointOne ob = new OnePointOne();
        ob.displayName();
        ob.displayName("Fortuner");
    }
}