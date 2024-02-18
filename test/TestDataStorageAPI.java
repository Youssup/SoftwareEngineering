package test;

import project.Input;
import project.Output;
import src.DataStorageAPI;
import project.InputConfig;
import project.OutputConfig;
import project.WriteResult;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mock;
import java.util.ArrayList;

//We will use Mockito to simulate the behavior of our classes

public class TestDataStorageAPI extends DataStorageAPI{

    @Test
    public void testRead(String input){
        DataStorageAPI dataStorageAPI = mock(DataStorageAPI.class);
        when(dataStorageAPI.read(any(String.class))).thenReturn(input);

        String result = dataStorageAPI.read("test");
    }

    @Test
    public void userTranslate(int[] output){
        DataStorageAPI dataStorageAPI = mock(DataStorageAPI.class);
        when(dataStorageAPI.userTranslate(any(int[].class))).thenReturn(output);

        int[] result = dataStorageAPI.userTranslate(new int[]{1,2,3});
        assert(result.equals(output));
    }
}
