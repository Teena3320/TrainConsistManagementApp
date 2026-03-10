package app;

/**
 * ============================================================================
 * MAIN CLASS – UseCase14TrainConsistMgmt
 * ============================================================================
 *
 * Use Case 14: Handle Invalid Bogie Capacity (Custom Exception)

 * Description:
 * This class prevents creation of passenger bogies
 * with invalid seating capacity using a custom exception.
 *
 * At this stage, the application:
 * - Defines a custom exception
 * - Validates capacity inside constructor
 * - Throws exception if capacity ≤ 0
 * - Prevents invalid bogie creation
 * - Continues execution safely
 *
 * This maps fail-fast validation using checked exceptions.
 *
 * @author Developer
 * @version 14.0
 */
public class Main {

    static class InvalidCapacityException extends Exception {
        public InvalidCapacityException(String message) {
            super(message);
        }
    }

    static class PassengerBogie {
        String name;
        int capacity;

        public PassengerBogie(String name, int capacity) throws InvalidCapacityException {
            if (capacity <= 0) {
                throw new InvalidCapacityException("Capacity must be greater than zero");
            }
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
        System.out.println(" UC14 - Handle Invalid Bogie Capacity ");
        System.out.println("==================================================\n");

        try {
            PassengerBogie sleeper = new PassengerBogie("Sleeper", 72);
            System.out.println("Created Bogie: " + sleeper);
        } catch (InvalidCapacityException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            PassengerBogie invalid = new PassengerBogie("AC Chair", 0);
            System.out.println("Created Bogie: " + invalid);
        } catch (InvalidCapacityException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\nUC14 exception handling completed...");
    }
}