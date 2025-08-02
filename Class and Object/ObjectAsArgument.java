public class ObjectAsArgument {
    public static void main(String[] args) {
        Sample ob1 = new Sample();
        Sample ob2 = new Sample();
        ob1.setNum(5);
        ob2.setNum(10);

        int res = ob1.addObject(ob2);
        System.out.println("Addtion: "+res);
    }
}

class Sample{
    private int num = 0;
    public void setNum(int n){
        num = n;
    }

    public int addObject(Sample ob){
        int add = 0;
        add = num+ob.num;
        return add;
    }
}
