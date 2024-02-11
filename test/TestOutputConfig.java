import java.util.ArrayList;

class TestOutputConfig {
    //Has a list of strings to hold the output data (4a - 4b)
    private ArrayList<String> outputData;

    public TestOutputConfig(){
        outputData = new ArrayList<>();
    }

    public ArrayList<String> getOutputData(){
        return outputData;
    }

    public void writeToOutput(String data){
        outputData.add(data);
    }
}