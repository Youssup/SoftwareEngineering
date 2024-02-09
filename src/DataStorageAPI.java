import java.util.ArrayList;

// This is an empty implementation of the DataStore interface
// We will functionaly call it DataStorage

public class DataStorageAPI implements DataStore {
    //Adding ComputeEngineAPI as a dependency
    //This will take the responsibility of the computation
    //and draw the result of the computation for translation
    private ComputeEngine computeEngine;
	
    public DataStorageAPI(){
        //We can decide what attributes to initialize here
    }

    public Iterable<Integer> read(InputConfig input){
        ArrayList<Integer> list = new ArrayList<Integer>();
        return list;
    }

	public WriteResult appendSingleResult(OutputConfig output, String result){
        WriteResult writeResult = new WriteResult(); //Need to implement WriteResult class
        return writeResult;
    }
    
}