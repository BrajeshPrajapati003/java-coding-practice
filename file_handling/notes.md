**FILE HANDLING**

It's how your java program interacts with files stored on disk:
- Read data
- write data
- modify data
  

**LEVEL 1:**

Core classes: from java.io package:

    - File -> represents a file / directory
    - FileWriter -> write characters
    - FileReader -> read characters

CREATE FILE:

```java
File file = new File("test.txt");

if(file.createNewFile()){
    System.out.println("File created..." + file.getName());
}else{
    System.out.println("File already exists!");
}
```

READ FILE:

```java
FileReader reader = new FileReader("test.txt");
int character;

while((character = reader.read()) != -1){ // read() returns ASCII int, -1 = end of file
    System.out.println((char) character);
}
reader.close();
```

WRITE FILE:

```java
FileWriter writer = new FileWriter("test.txt");
writer.write("Hello Brajesh\nLearning Java file handling....");
writer.close();

System.out.println("Successfully written!");
```

FILE METADATA:

```java
File file = new File("test.txt");

System.out.println(file.exists());
System.out.println(file.length());
System.out.println(file.getAbsolutePath());
```

problem: Reading character by character = SLOW

solution: BUFFERED STREAMS

**LEVEL 2:**

BufferedWriter & BufferedReader

    Without Buffer:
        - slow
        - reads char-by-char
        - more CPU usage
    
    With Buffer:
        - fast
        - reads chunks
        - optimized

BufferedWriter:

```java
BufferedWriter bw = new BufferedWriter(new FileWriter("test.txt"));

bw.write("Fast writing using buffer...");
bw.newLine();
bw.close();
```

BufferedReader:

```java
BufferedReader br = new BufferedReader(new FileReader("test.txt"));

String line;
while((line = br.readLine()) != null){
    System.out.println(line);
}
br.close();
```

**LEVEL 3:**

from java.nio.file: Core classes:

    - Path
    - Paths
    - Files


READING FILE (modern way)

```java
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;

public class NIOReadExample {
    public static void main(String[] args) throws IOException {
        String content = Files.readString(Paths.get("test.txt"));
        System.out.println(content);
    }
}
```

WRITING FILE (modern way)

```java
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;

public class NIOWriteExample {
    public static void main(String[] args) throws IOException {
        Files.writeString(Paths.get("test.txt"), "NIO is powerful.....");
    }
}
```

Why NIO wins:
- cleaner syntax
- faster
- thread-friendly
- used in real projects


DIRECTORY HANDLING:

```java
import java.nio.file.*;

public class DirectoryExample {
    public static void main(String[] args){
        Path path = Paths.get("myFolder");

        if(!Files.exists(path)){
            Files.createDirectory(path);
            System.out.println("Directory created!");
        }
    }
}
```

