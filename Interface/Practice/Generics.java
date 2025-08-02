interface Container<T>{
    T getValue();
    void setValue(T value);
}

class MyContainer<T> implements Container<T>{
    private T value;
    @Override
    public T getValue(){
        return value;
    }

    @Override
    public void setValue(T value){
        this.value = value;
    }
}

public class Generics {
    public static void main(String[] args) {
        Container<Integer> container = new MyContainer<>();
        container.setValue(66);
        System.out.println(container.getValue());
    }
}
