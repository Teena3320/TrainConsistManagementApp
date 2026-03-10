package app;

/**
 * ============================================================================
 * MAIN CLASS – UseCase16TrainConsistMgmt
 * ============================================================================
 *
 * Use Case 16: Sort Passenger Bogies by Capacity
 *
 * Description:
 * This class demonstrates manual sorting of passenger
 * bogie capacities using the Bubble Sort algorithm
 * instead of built-in sorting utilities.
 *
 * At this stage, the application:
 * - Creates an array of capacities
 * - Compares adjacent values
 * - Swaps values when required
 * - Repeats passes until sorted
 * - Displays sorted result
 *
 * This maps algorithmic sorting logic using Bubble Sort.
 *
 * @author Developer
 * @version 16.0
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("==================================================");
        System.out.println(" UC16 - Manual Sorting using Bubble Sort ");
        System.out.println("==================================================\n");

        int[] capacities = {72, 56, 24, 70, 60};

        System.out.println("Original Capacities:");
        for (int c : capacities) {
            System.out.print(c + " ");
        }

        for (int i = 0; i < capacities.length - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < capacities.length - 1 - i; j++) {
                if (capacities[j] > capacities[j + 1]) {
                    int temp = capacities[j];
                    capacities[j] = capacities[j + 1];
                    capacities[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break; 
            }
        }

        System.out.println("\n\nSorted Capacities (Ascending):");
        for (int c : capacities) {
            System.out.print(c + " ");
        }
        System.out.println("\n\nUC16 sorting completed...");
    }
}
