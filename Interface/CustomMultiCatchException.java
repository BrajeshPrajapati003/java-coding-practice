class MyException extends Exception{
    public MyException(String message){
        super(message);
    }
}

class AnotherException extends Exception{
    public AnotherException(String message){
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

public class CustomMultiCatchException {
    public static void main(String[] args) {
        ExceptionLogger logger = new Logger();
        try{
            // Simulate throwing different exceptions
            if(Math.random() < 0.5){
                throw new MyException("Custom Exception");
            }else{
                throw new AnotherException("Another Exception");
            }
        }catch(Exception e){
            System.out.println("Other Exception occured: "+e.getMessage());
        }
    }
}
