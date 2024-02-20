package test;
import project.WritingResult;
import src.DataStorageAPI;

import java.util.List;
import java.util.ArrayList;


class TestOutputConfig{
    public List<String> output;

    public TestOutputConfig(){
        output = new ArrayList<String>();
    }
    public List<String> getOutputData(){
        return output;
    }
    public void write(String data){
        output.add(data);
    }
}

class TestInputConfig{
    public List<Integer> input;

    public TestInputConfig(List<Integer> data){
        this.input = data;
    }
}

//This simulates the DataStorageAPI class
/**
 * Test-only implementation of DataStore that handles in-memory inputs and outputs
 */
class InMemTestDataStorage extends DataStorageAPI {
    @Override
    public ArrayList<Integer> read(String input, char delim){
        return new ArrayList<>();
    }

    @Override
    public WritingResult userTranslate(int[] output){
        return new WritingResult();
    }
}

public class TestImplementation{
    //This main method will depict the infrastructure of the DataStorageAPI implementations
    public static void main(String[] args){

        //Create a starting List of integers
        List<Integer> data = new ArrayList<Integer>();
        data.add(1);
        data.add(2);
        data.add(3);

        //Create a TestInputConfig with the List of integers
        TestInputConfig inputConfig = new TestInputConfig(data);

        //Create a TestDataStorageAPI object
        InMemTestDataStorage dataStore = new InMemTestDataStorage();

        //Test the read method from the DataStorageAPI
        //It takes in an inputConfig and returns an Iterable<Integer>
        dataStore.read("1, 2, 3, 4", ',');

        //Test the appendSingleResult method from the DataStorageAPI
        //It takes in an outputConfig and a result and returns a WriteResult

        //

        //Still need to format the WriteResult class
        //This will be the readable output at the end of our pipeline

        TestOutputConfig outputConfig = new TestOutputConfig();
        outputConfig.write("Hey dude!");

    }
}