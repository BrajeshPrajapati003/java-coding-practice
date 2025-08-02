public class DeepCopy {
    int a;
    Object obj; // Example of a reference type member

    DeepCopy(int a){
        this.a = a;
    }

    DeepCopy(DeepCopy other){
        this.a = other.a;
        // Deep copy of the 'obj' member (assuming 'obj' is cloneable)
        if(other.obj != null){
            try{
                this.obj = other.obj.clone();
            }catch(CloneNotSupportedException e){
                //Handle the exception
            }
        }
    }
}
