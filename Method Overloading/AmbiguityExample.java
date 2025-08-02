public class AmbiguityExample{
    void print(int num){
        System.out.println("Integer: "+ num);
    }
    void print(double num){
        System.out.println("Double: " + num);
    }

    public static void main(String[] args) {
        AmbiguityExample obj = new AmbiguityExample();
        obj.print((int) 43.66);
        obj.print(67.66);
    }
}