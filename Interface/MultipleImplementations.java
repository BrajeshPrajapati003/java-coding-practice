interface Operation{
    int add(int a, int b); // By default abstract methods
    int subtract(int a, int b);
}

class Addition implements Operation{
    @Override
    public int add(int a, int b){
        return a+b;
    }
    @Override
    public int subtract(int a, int b){ // Must be overriden
        throw new UnsupportedOperationException("Add not implemented in Substraction class!");
    }
}

class Substraction implements Operation{
    @Override
    public int subtract(int a, int b){
        return a-b;
    }
    @Override
    public int add(int a, int b){ // Must be overriden
        throw new UnsupportedOperationException();
    }

}

public class MultipleImplementations {
    public static void main(String[] args) {
        Addition a = new Addition();
        System.out.println("Addition of 1 and 3: " + a.add(1,3));
        Substraction s = new Substraction();
        System.out.println("Substraction of 9 and 6: " + s.subtract(9, 6));
        try {
            a.subtract(9, 6);
        } catch (UnsupportedOperationException e) {
            System.out.println("Substraction operation exception");
        }

        try {
            s.add(7, 7);
        } catch (UnsupportedOperationException e) {
            System.out.println("Addition operation exception");
        }
    }
}
