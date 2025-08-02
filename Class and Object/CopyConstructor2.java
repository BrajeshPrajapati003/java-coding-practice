public class CopyConstructor2 {
    public static void main(String[] args) {
        Demo d1 = new Demo(43, 66);
        Demo d2 = new Demo(d1);

        d1.printValues();
        System.out.println("Copy constructor...");
        d2.printValues();
    }
}

class Demo{
    int num1;
    int num2;

    Demo(int n1, int n2){
        this.num1 = n1;
        this.num2 = n2;
    }

    Demo(Demo obj){
        this.num1 = obj.num1;
        this.num2 = obj.num2;
    }

    void printValues(){
        System.out.println("Number 1: "+num1);
        System.out.println("Number 2: "+num2);

    }
}