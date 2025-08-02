import java.util.ArrayList;
import java.util.List;
interface StringConverter{
    public String convert(String str);
}

public class ConvertUppercase {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("Apple");
        strings.add("Banana");
        strings.add("Orange");
        strings.add("Grapes");

        System.out.println("Given strings: " + strings);
        List<String> upperStrings = convert2UpperCase(strings, str -> str.toUpperCase());
        System.out.println("Converted to Uppercase: " + upperStrings);
    }

    // ! Warning: Exporting non-public type through public API (convert2UpperCase is public but interface StringConverter isn't public)

    public static List<String> convert2UpperCase(List<String> list, StringConverter converter){
        List<String> result = new ArrayList<>();
        for(String str: list){
            result.add(converter.convert(str));
        }
        return result;
    }
}
