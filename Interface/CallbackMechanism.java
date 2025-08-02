interface Callback{
    void onCallback();
}

class EventListener{
    void registerCallback(Callback callback){
        // Some event occurs
        System.out.println("Event occured...");
        callback.onCallback();
    }
}
public class CallbackMechanism {
    public static void main(String[] args) {
        EventListener listener = new EventListener();
        listener.registerCallback(() -> System.out.println("Callback Invoked..."));
    }
}
