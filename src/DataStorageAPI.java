import java.util.ArrayList;

// This is an empty implementation of the DataStore interface
// We will functionaly call it DataStorage

public class DataStorageAPI implements DataStore {
	
    public DataStorageAPI(){
        //We can decide what attributes to initialize here
    }

    public Iterable<Integer> read(InputConfig input){
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(5);
        list.add(10);
        return list;
    }

	public WriteResult appendSingleResult(OutputConfig output, String result){
        WriteResult writeResult = new WriteResult(); //Need to implement WriteResult class
        return writeResult;
    }
    
}
