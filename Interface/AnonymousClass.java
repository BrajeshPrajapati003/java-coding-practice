interface Message{
    void sendMessage();
}

public class AnonymousClass {
    public static void main(String[] args) {
        Message email = new Message(){
            @Override
            public void sendMessage(){
                System.out.println("Sending an email message...");
            }
        };

        // Here Message is an anonymous class
        // This anonymous inner class creation can be turned into a lambda expression.
        email.sendMessage();
    }
}
