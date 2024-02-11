//Class to be used inside the test folder for integration testing
//Classes used are dependent on the DataStorageAPI class
public class TestDataStorage {

    //Really simple extension of the DataStorageAPI, just to test the appendSingleResult method
    public TestDataStorage(){
        super();
    }
    public Iterable<Integer> read(InputConfig input){
        
    }
    public WriteResult appendSingleResult(TestOutputConfig output, String result){
        
    }

}
