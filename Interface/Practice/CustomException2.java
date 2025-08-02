class MyException extends Exception{
    public MyException(String message){
        super(message);
    }
}

interface ExceptionLogger{
    void logException(Exception e);
}

class Logger implements ExceptionLogger{
    @Override
    public void logException(Exception e){
        System.out.println("Logging Exception: " + e.getMessage());
    }
}

public class CustomException2 {
    public static void main(String[] args) {
        ExceptionLogger logger = new Logger();
        try {
            throw new MyException("Custom Exception");
        } catch (Exception e) {
            logger.logException(e);
        }
    }
}
