package test;
import org.mockito.Mockito;

import project.OutputConfig;

import static org.mockito.Mockito.when;

import java.util.ArrayList;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.any;
import org.junit.Test;
import org.junit.platform.reporting.shadow.org.opentest4j.reporting.events.core.Data;

import src.ClientAPI;
import src.ComputeEngineAPI;
import src.DataStorageAPI;

public class TestComputeEngineAPI
{
    @Test
    public void testAlgorithmCompute() 
    {
        ComputeEngineAPI ce = Mockito.mock(ComputeEngineAPI.class);
        when(ce.compute(any(Integer.class))).thenReturn("1");
        ce.compute("1");
    }
    @Test
    public void testRequest() 
    {
        ComputeEngineAPI ce = Mockito.mock(ComputeEngineAPI.class);
        when(ce.compute(any(ComputeRequest.class))).thenReturn(ComputeResult.SUCCESS);
        ComputeRequest request = new ComputeRequest();
        ce.compute(request);
    }
}

class ComputeEngineIntegrationTest
{
    DataStorageAPI datastore = new DataStorageAPI();
    ComputeEngineAPI ce = new ComputeEngineAPI();
    public void testComputeEngineIntegration() 
    {
        ClientAPI cApi = new ClientAPI();
        //It should have pointer, poitning to the Compute Engine
        //And the Test Data Storage
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(10);
        list.add(25);
        //We add the list number to the Client API
        //We run it fully thorugh the program, into the Data Strorage as well,
        //we should a output Config of Array of string
        cApi.getInputConfig(list);                                                           
        datastore.appendSingleResult(any(OutputConfig.class), ce.compute(datastore.read(list);));
        cApi.getOutputConfig();
    }
    @Test
    public void validation(OutputConfig output)
    {                           //user input
        if(output == ce.compute(output))
    }
}
//I know this is all wrong I'm lost