public class PentagonalNumbers {
    public static void main(String[] args) {
        int count = 1;

        // ! Formula to compute the pentagonal numbers: (i*(3*i-1))/2, i=index of pentagonal numbers

        for(int i=1; i<=50; i++){
            System.out.printf("%-6d", (i*(3*i-1))/2); // Formatted width = 6
            if(count % 10 == 0) System.out.println();
            count++;
        }
    }
}
