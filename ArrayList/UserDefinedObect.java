import java.util.ArrayList;
import java.util.List;
public class UserDefinedObect {
    public static void main(String[] args) {
        List<User> userList = new ArrayList<>();
        userList.add(new User("Sitara", 18));
        userList.add(new User("Brajesh", 43));
        userList.add(new User("Kavita", 67));
        userList.add(new User("Kahsish", 66));

        userList.forEach(user -> {
            System.out.println("Name: " + user.getName() + "\nAge: " + user.getAge());
        });
    }
}

class User{
    private String name;
    private int age;

    public User(String n, int a){
        name = n;
        age = a;
    }

    public String getName(){
        return name;
    }

    public void setName(String n){
        name = n;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }
}