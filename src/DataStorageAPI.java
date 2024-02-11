package src;
import java.util.ArrayList;
import project.DataStore;
import project.InputConfig;
import project.OutputConfig;
import project.WriteResult;

// This is an empty implementation of the DataStore interface
// We will functionaly call it DataStorage

public class DataStorageAPI implements DataStore{
    //Adding ComputeEngineAPI as a dependency
    //This will take the responsibility of the computation
    //and draw the result of the computation for translation

    //private ComputeEngineAPI computeEngine;
	
    public DataStorageAPI(){
        //We can decide what attributes to initialize here
        //May not need constructor
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
