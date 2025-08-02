interface Logger{
    void log(String message);
    default void logError(String errorMessage){
        log("Error: " + errorMessage);
    }
}

class ConsoleLogger implements Logger{
    @Override
    public void log(String message){
        System.out.println("Log: " + message);
    }
}

public class DefaultMethodForLogging {
    public static void main(String[] args) {
        Logger logger = new ConsoleLogger();
        logger.log("Info message");
        logger.logError("Something went wrong");
    }
}
