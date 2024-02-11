import java.util.ArrayList;

//Integration test for part 4) a - b
public class IntegrationTest {
    public static void main(String[] args) {
        // Test the implementation
        ArrayList<Integer> testData = new ArrayList<>();
        testData.add(1);
        testData.add(2);
        testData.add(3);

        InputConfig inputConfig = new InputConfig(testData);
        OutputConfig outputConfig = new OutputConfig();

        DataStorage dataStorage = new DataStorage();
        
        //Need to utuilize the configuration classes here.

        //Just print the input data to show that the data
        //is being read in correctly and flowing through
        //each of the classes
        System.out.println("Output Data:");
        for (String output : outputConfig.getOutputData()) {
            System.out.println(output);
        }
    }
}