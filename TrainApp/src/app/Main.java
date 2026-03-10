package app;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * ============================================================================
 * MAIN CLASS – UseCase11TrainConsistMgmt
 * ============================================================================
 *
 * Use Case 11: Validate Train ID and Cargo Code
 *
 * Description:
 * This class validates input formats using Regular Expressions.
 *
 * At this stage, the application:
 * - Accepts Train ID input
 * - Accepts Cargo Code input
 * - Applies regex validation
 * - Displays validation result
 *
 * This maps format validation logic using Pattern matching.
 *
 * @author Developer
 * @version 11.0
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("==================================================");
        System.out.println(" UC11 - Validate Train ID and Cargo Code ");
        System.out.println("==================================================\n");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Train ID (Format: TRN-1234): ");
        String trainId = scanner.nextLine();

        System.out.print("Enter Cargo Code (Format: PET-AB): ");
        String cargoCode = scanner.nextLine();

        String trainIdPattern = "TRN-\\d{4}";
        String cargoPattern = "PET-[A-Z]{2}";

        Pattern trainPattern = Pattern.compile(trainIdPattern);
        Pattern cargoCodePattern = Pattern.compile(cargoPattern);

        Matcher trainMatcher = trainPattern.matcher(trainId);
        Matcher cargoMatcher = cargoCodePattern.matcher(cargoCode);

        boolean isTrainIdValid = trainMatcher.matches();
        boolean isCargoCodeValid = cargoMatcher.matches();

        System.out.println("\nValidation Results:");
        System.out.println("Train ID Valid: " + isTrainIdValid);
        System.out.println("Cargo Code Valid: " + isCargoCodeValid);

        System.out.println("\nUC11 validation completed...");
    }
}
