
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mock;
import java.util.ArrayList;

//We will use Mockito to simulate the behavior of our classes

public class TestDataStore {

    @Test
    public void testRead() {
        //Mock InputConfig
        InputConfig inputConfig = mock(InputConfig.class);

        //Create a mock DataStore
        DataStore dataStore = mock(DataStore.class);

        //Set up the case we will test
        //Read in the inputConfig and return something
        when(dataStore.read(inputConfig)).thenReturn(new ArrayList<Integer>());

        //Test the read method(I had to return an ArrayList<Integer> because I couldn't return an Iterable<Integer> object)
        Iterable<Integer> results = dataStore.read(inputConfig);

    }

    @Test
    public void testAppendSingleResult() {
        //Create a mock OutputConfig
        OutputConfig outputConfig = mock(OutputConfig.class);
        //Basic result to test
        String result = "Result";

        //Create a mock DataStore object
        DataStore dataStore = mock(DataStore.class);

        //Set up mock case for the test
        when(dataStore.appendSingleResult(outputConfig, result)).thenReturn(mock(WriteResult.class));

        //Test the appendSingleResult method
        WriteResult writeResult = dataStore.appendSingleResult(outputConfig, result);

    }
}
