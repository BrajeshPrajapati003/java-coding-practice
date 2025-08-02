// Example 1: Simple Factory Method (in a separate Factory class)
class Shape{
    public void draw(){
        System.out.println("Drawing a shape");
    }
}

class Circle extends Shape{
    @Override
    public void draw(){
        System.out.println("Drawing a circle");
    }
}

class Square extends Shape{
    @Override
    public void draw(){
        System.out.println("Drawing a square");
    }
}

class ShapeFactory{
    public static Shape createShape(String shapeType){
        if("circle".equalsIgnoreCase(shapeType)){
            return new Circle();
        }else if("square".equalsIgnoreCase(shapeType)){
            return new Square();
        }
        return new Shape(); // Default shape
    }
}


// Example 2: Static Factory Method (within the created class)
class Document{
    private final String type;

    private Document(String type){
        this.type = type;
    }

    public static Document createPDF(){
        return new Document("PDF");
    }

    public static Document createWord(){
        return new Document("Word");
    }

    public void displayType(){
        System.out.println("Document type: " + type);
    }
}


// Example 3: Factory method returning different subtypes based on input.
interface Logger{
    void log(String message);
}

class FileLogger implements Logger{
    @Override
    public void log(String message){
        System.out.println("Logging to file: " + message);
    }
}

class ConsoleLogger implements Logger{
    @Override
    public void log(String message){
        System.out.println("Logging to console: " + message);
    }
}

class LoggerFactory{
    public static Logger createLogger(String type){
        if("file".equalsIgnoreCase(type)){
            return new FileLogger();
        }else if("console".equalsIgnoreCase(type)){
            return new ConsoleLogger();
        }
        return null; // Handle invalid type
    }
}


// Example 4: Factory method using an enum
enum DatabaseType{
    MYSQL, POSTGRES, ORACLE
}

interface DatabaseConnection{
    void connect();
}

class MySqlConnection implements DatabaseConnection{
    @Override
    public void connect(){
        System.out.println("Connecting to MySQL");
    }
}

class PostgresConnection implements DatabaseConnection{
    @Override
    public void connect(){
        System.out.println("Connecting to PostgreSQL");
    }
}

class OracleConnection implements DatabaseConnection{
    @Override
    public void connect(){
        System.out.println("Connecting to Oracle");
    }
}

class DatabaseConnectionFactory{
    public static DatabaseConnection getConnection(DatabaseType type){
        return switch (type) {
            case MYSQL -> new MySqlConnection();
            case POSTGRES -> new PostgresConnection();
            case ORACLE -> new OracleConnection();
            default -> null;
        };
    }
}


public class FactoryMethodExamples {
    public static void main(String[] args) {
        // Example 1
        Shape circle = ShapeFactory.createShape("circle");
        circle.draw();

        // Example 2
        Document pdf = Document.createPDF();
        pdf.displayType();

        // Example 3
        Logger fileLogger = LoggerFactory.createLogger("file");
        fileLogger.log("Application started...");

        // Example 4
        DatabaseConnection mysqlConnection = DatabaseConnectionFactory.getConnection(DatabaseType.MYSQL);
        mysqlConnection.connect();
    }
}
