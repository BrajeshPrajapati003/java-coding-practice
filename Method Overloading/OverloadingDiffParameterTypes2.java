enum Color{
    RED, GREEN, BLUE
}

class EnumManipulator{
    String dispColor(Color col){
        return "Selected Color: " + col.name();
    }

    String dispColor(Color[] cols){
        StringBuilder result = new StringBuilder();
        for(Color col: cols){
            result.append("\nSelected color: ").append(col.name()).append(" ");
        }
        return result.toString().trim();
    }
}
public class OverloadingDiffParameterTypes2 {
    public static void main(String[] args) {
        EnumManipulator manipulator = new EnumManipulator();
        System.out.println(manipulator.dispColor(Color.GREEN));
        Color[] colorArr = {Color.RED, Color.BLUE, Color.GREEN};
        System.out.println(manipulator.dispColor(colorArr));
    }
}
