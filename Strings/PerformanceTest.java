public class PerformanceTest {
    private static final int ITERATIONS = 100000;

    public static void main(String[] args) {
        long startTime, endTime;

        // StringBuilder performance test
        StringBuilder stringBuilder = new StringBuilder();
        startTime = System.nanoTime();
        for (int i = 0; i < ITERATIONS; i++) {
            stringBuilder.append("test");
        }
        endTime = System.nanoTime();
        System.out.println("StringBuilder time: " + (endTime - startTime) + " ns");

        // StringBuffer performance test
        StringBuffer stringBuffer = new StringBuffer();
        startTime = System.nanoTime();
        for (int i = 0; i < ITERATIONS; i++) {
            stringBuffer.append("test");
        }
        endTime = System.nanoTime();
        System.out.println("StringBuffer time: " + (endTime - startTime) + " ns");
    }
}