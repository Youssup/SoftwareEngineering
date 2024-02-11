import java.util.ArrayList;

//Very simple input config class
class TestInputConfig {
    private ArrayList<Integer> inputData;

    public TestInputConfig(ArrayList<Integer> data) {
        this.inputData = data;
    }

    public ArrayList<Integer> getInputData() {
        return inputData;
    }
}