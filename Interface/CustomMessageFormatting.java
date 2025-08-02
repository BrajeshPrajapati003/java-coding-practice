interface MessageFormatter{
    String format(String message);
}

public class CustomMessageFormatting {
    public static void main(String[] args) {
        MessageFormatter formatter = message -> "Formatted Message: " + message;

        String originalMessage = "Hello Brajesh 66!";
        String formattedMessage = formatter.format(originalMessage);

        System.out.println(formattedMessage);
    }
}
