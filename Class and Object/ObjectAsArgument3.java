public class ObjectAsArgument3 {
    public static void main(String[] args) {
        Sample o1 = new Sample();
        Sample o2 = new Sample();

        o1.setNumber(10);
        o2.setNumber(20);

        int result = o1.multiply(o2);
        System.out.println("Result: "+result);
    }
}

class Sample{
    int num;
    void setNumber(int n){
        num = n;
    }
    int multiply(Sample a){
       int product = num*a.num;
        return product;
    }
}