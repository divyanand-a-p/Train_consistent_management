import java.util.LinkedHashSet;
import java.util.Set;

public class TrainApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create LinkedHashSet for train formation
        Set<String> trainFormation = new LinkedHashSet<>();

        // Add bogies
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // محاولة إضافة مكرر (duplicate)
        trainFormation.add("Sleeper"); // duplicate - will be ignored

        // Display final formation
        System.out.println("Final Train Formation:");
        System.out.println(trainFormation);
    }
}