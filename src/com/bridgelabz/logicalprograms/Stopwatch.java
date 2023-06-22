package com.bridgelabz.logicalprograms;

public class Stopwatch {
    private long start = 0;
    private long stop = 0;
    public final void start() {
        start = System.currentTimeMillis();
    }
    public final void stop() {
        stop = System.currentTimeMillis();
    }
    public final long elapsedTime() {
        long difference;
        if (stop == 0) {
            long now = System.currentTimeMillis();
            difference = now - start; // in milliseconds
        } else {
            difference = stop - start; // in milliseconds
        }
        return difference;
    }
    public static void main(String[] args) {
        Stopwatch sw = new Stopwatch();

        sw.start();
        // Simulating a delay without using Thread.sleep()
        long startTime = System.currentTimeMillis();
        long elapsedTime = 0;
        while (elapsedTime < 1000) {
            elapsedTime = System.currentTimeMillis() - startTime;
        }
        sw.stop();
        long elapsed = sw.elapsedTime();
        System.out.println("Elapsed Time in ms is: " + elapsed);
    }
}
