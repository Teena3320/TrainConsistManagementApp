package app;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * ============================================================================
 * MAIN CLASS – UseCase13TrainConsistMgmt
 * ============================================================================
 *
 * Use Case 13: Performance Comparison (Loops vs Streams)

 * Description:
 * This class compares execution time of loop-based filtering
 * versus stream-based filtering using System.nanoTime().
 *
 * At this stage, the application:
 * - Creates bogie test dataset
 * - Measures loop execution time
 * - Measures stream execution time
 * - Calculates elapsed duration
 * - Displays performance results
 *
 * This maps performance benchmarking using high-resolution timing.
 *
 * @author Developer
 * @version 13.0
 */
public class Main {

    static class Bogie {
        String type;
        int capacity;

        Bogie(String type, int capacity) {
            this.type = type;
            this.capacity = capacity;
        }
    }

    public static void main(String[] args) {

        System.out.println("==================================================");
        System.out.println(" UC13 - Performance Comparison (Loops vs Streams) ");
        System.out.println("==================================================\n");

        List<Bogie> bogies = new ArrayList<>();
        int N = 200_000; 

        for (int i = 0; i < N; i++) {
            switch (i % 4) {
                case 0 -> bogies.add(new Bogie("Sleeper", 72));
                case 1 -> bogies.add(new Bogie("AC Chair", 56));
                case 2 -> bogies.add(new Bogie("First Class", 24));
                default -> bogies.add(new Bogie("General", 90));
            }
        }

        long loopStart = System.nanoTime();
        List<Bogie> loopFiltered = new ArrayList<>();
        for (Bogie b : bogies) {
            if (b.capacity > 60) {
                loopFiltered.add(b);
            }
        }
        long loopEnd = System.nanoTime();
        long loopTime = loopEnd - loopStart;

        long streamStart = System.nanoTime();
        List<Bogie> streamFiltered =
                bogies.stream()
                      .filter(b -> b.capacity > 60)
                      .collect(Collectors.toList());
        long streamEnd = System.nanoTime();
        long streamTime = streamEnd - streamStart;

        System.out.println("Loop Execution Time (ns): " + loopTime);
        System.out.println("Stream Execution Time (ns): " + streamTime);

        System.out.println("\nUC13 performance benchmarking completed...");
    }
}