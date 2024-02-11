package test;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mock;
import java.util.ArrayList;

//We will use Mockito to simulate the behavior of our classes

public class TestDataStorageAPI {

    @Test
    public void testRead() {
        //Mock InputConfig
        InputConfig inputConfig = mock(InputConfig.class);

        //Create a mock TestDataStore
        TestDataStorageAPI dataStore = mock(DataStorage.class);

        //Set up the case we will test
        //Read in the inputConfig and return something
        when(dataStore.testRead(inputConfig)).thenReturn(new ArrayList<Integer>());

        //Test the read method(I had to return an ArrayList<Integer> because I couldn't return an Iterable<Integer> object)
        Iterable<Integer> results = dataStore.testRead(inputConfig);

    }

    @Test
    public void testAppendSingleResult() {
        //Create a mock OutputConfig (This is a simulated input object)
        OutputConfig outputConfig = mock(OutputConfig.class);

        //Create a dummy String result
        String result = "Hey dude!";

        //Create a mock TestDataStore object
        DataStorage dataStore = mock(DataStorage.class);

        //Set up mock case for the test
        when(dataStore.testAppendSingleResult(outputConfig, result)).thenReturn(mock(WriteResult.class));

        //Test the appendSingleResult method
        WriteResult writeResult = dataStore.testAppendSingleResult(outputConfig, result);

    }
}
