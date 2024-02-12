package test;

import project.InputConfig;
import project.OutputConfig;
import project.WriteResult;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.any;
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
        TestDataStorageAPI dataStore = mock(TestDataStorageAPI.class);

        //Set up the case we will test
        //Read in the inputConfig and return something
        when(testRead()).thenReturn(new ArrayList<Integer>());

        //Test the read methodd
        Iterable<Integer> results = dataStore.testRead(inputConfig);
    }

    @Test
    public void testAppendSingleResult(OutputConfig outputConfig, String result){

        //Create a mock OutputConfigs
        TestDataStorageAPI dataStore = mock(TestDataStorageAPI.class);

        //Create a mock OutputConfig (This is a simulated input object)
        //Set up mock case for the test
        when(dataStore.testAppendSingleResult(any(OutputConfig.class), any(String.class)))
            .thenReturn(mock(WriteResult.class));

        //Test the appendSingleResult method
        WriteResult writeResult = dataStore.testAppendSingleResult(outputConfig, result);
    }
}
