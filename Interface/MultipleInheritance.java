interface A{
    void methodA();
}

interface B{
    void methodB();
}

class C implements A, B{
    @Override
    public void methodA(){
        System.out.println("This is method A");
    }

    @Override
    public void methodB(){
        System.out.println("This is method B");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        C ob = new C();
        ob.methodA();
        ob.methodB();
    }
}
