package ss4_class_and_object.bai_tap;

import java.util.Date;

public class StopWatch {
    long start;
    long end;

    public StopWatch() {
        long start = new Date().getTime();
    }

    public void start() {

        start = new Date().getTime();
    }

    public void end() {

        end = new Date().getTime();
    }

    public long getElapsedTime() {
        return (end - start) * 1000;
    }

    public long getStart() {
        return start;
    }

    public long getEnd() {
        return end;
    }

    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        System.out.println(stopWatch.getStart());
        for (int i = 0; i < 1000; i++) {
            for (int j = 0; j < 1000; j++) {
                System.out.print(".");
            }
        }
        stopWatch.end();
        System.out.println("\n" + stopWatch.getEnd());
        System.out.println(stopWatch.getElapsedTime() + " millisecond");
    }
}
