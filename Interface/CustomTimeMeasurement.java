interface Timer{
    void start();
    void stop();
    long getTimeElapsed();
}

public class CustomTimeMeasurement {
    public static void main(String[] args) {
        Timer timer = new Timer() {
            private long startTime;
            private long stopTime;

            @Override
            public void start(){
                startTime = System.currentTimeMillis();
            }

            @Override
            public void stop(){
                stopTime = System.currentTimeMillis();
            }

            @Override
            public long getTimeElapsed(){
                return stopTime - startTime;
            }
        };

        timer.start();

        // Simulate some work
        try{
            Thread.sleep(2000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }

        timer.stop();
        System.out.println("Time Elapsed: " + timer.getTimeElapsed() + " milliseconds");
    }
}
