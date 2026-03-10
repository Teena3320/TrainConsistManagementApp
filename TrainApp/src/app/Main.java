package app;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * ============================================================================
 * MAIN CLASS – UseCase8TrainConsistMgmt
 * ============================================================================
 *
 * Use Case 8: Filter Passenger Bogies Using Streams
 *
 * Description:
 * This class filters passenger bogies based on seating
 * capacity using Java Stream API.
 *
 * At this stage, the application:
 * - Creates a list of bogies
 * - Converts list into stream
 * - Applies filter condition
 * - Collects filtered result
 * - Displays qualifying bogies
 *
 * This maps functional filtering using Streams.
 *
 * @author Developer
 * @version 8.0
 */
public class Main {

    static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }

        @Override
        public String toString() {
            return name + " -> " + capacity;
        }
    }

    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println(" UC8 - Filter Passenger Bogies Using Streams ");
        System.out.println("==================================================\n");

        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("General", 90));

        System.out.println("All Bogies:");
        bogies.forEach(b -> System.out.println(b));
        System.out.println();

        List<Bogie> filtered =
                bogies.stream()
                      .filter(b -> b.capacity > 60)
                      .collect(Collectors.toList());

        System.out.println("Filtered Bogies (Capacity > 60):");
        filtered.forEach(b -> System.out.println(b));
        System.out.println();

        System.out.println("UC8 filtering completed...");
    }
}