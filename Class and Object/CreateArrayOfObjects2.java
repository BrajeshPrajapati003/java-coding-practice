public class CreateArrayOfObjects2 {
    public static void main(String[] args) {
        Sample[] arrObj = new Sample[5];
        for(int i=0; i<5; i++){
            arrObj[i] = new Sample();
        }
        for(int i=0; i<5; i++){
            arrObj[i].sayHello();           
        }
    }
}

class Sample{
    public void sayHello(){
        System.out.println("Array of object created...");
    }
}
