package app;

import java.util.ArrayList;
import java.util.List;

/**
 * ============================================================================
 * MAIN CLASS – UseCase12TrainConsistMgmt
 * ============================================================================
 *
 * Use Case 12: Safety Compliance Check for Goods Bogies

 * Description:
 * This class enforces domain safety rules on goods bogies.
 *
 * At this stage, the application:
 * - Creates goods bogie list
 * - Converts list into stream
 * - Applies safety validation rule
 * - Checks compliance using allMatch()
 * - Displays safety status
 *
 * This maps real-world cargo safety rules using Streams.
 *
 * @author Developer
 * @version 12.0
 */
public class Main {

    static class GoodsBogie {
        String type;   
        String cargo;   

        GoodsBogie(String type, String cargo) {
            this.type = type;
            this.cargo = cargo;
        }

        @Override
        public String toString() {
            return type + " -> " + cargo;
        }
    }

    public static void main(String[] args) {

        System.out.println("==================================================");
        System.out.println(" UC12 - Safety Compliance Check for Goods Bogies ");
        System.out.println("==================================================\n");

        List<GoodsBogie> goodsBogies = new ArrayList<>();
        goodsBogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        goodsBogies.add(new GoodsBogie("Open", "Coal"));
        goodsBogies.add(new GoodsBogie("Box", "Grain"));
        goodsBogies.add(new GoodsBogie("Cylindrical", "Coal")); // invalid on purpose

        System.out.println("Goods Bogies in Train:");
        goodsBogies.forEach(b -> System.out.println(b));
        System.out.println();

        boolean isSafe =
                goodsBogies.stream()
                           .allMatch(b ->
                                   !"Cylindrical".equalsIgnoreCase(b.type)
                                   || "Petroleum".equalsIgnoreCase(b.cargo));

        System.out.println("Safety Compliance Status: " + isSafe);
        if (isSafe) {
            System.out.println("Train formation is SAFE.");
        } else {
            System.out.println("Train formation is NOT SAFE.");
        }

        System.out.println("\nUC12 safety validation completed...");
    }
}