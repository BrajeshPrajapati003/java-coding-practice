
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

interface DateTimeManipulator{
    String formatDatetime(LocalDateTime dateTime, String pattern);
}

public class CustomDateTimeManipulation {
    public static void main(String[] args) {
        DateTimeManipulator dateTimeManipulator = (dateTime, pattern) -> {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
            return dateTime.format(formatter);
        };

        LocalDateTime now = LocalDateTime.now();
        String formattedDateTime = dateTimeManipulator.formatDatetime(now, "dd-MM-yyyy HH:mm:ss");

        System.out.println("Formatted Date and Time: " + formattedDateTime);
    }
}
