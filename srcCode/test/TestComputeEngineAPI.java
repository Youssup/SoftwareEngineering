package test;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import java.util.ArrayList;

import org.junit.Test;
//import org.junit.platform.reporting.shadow.org.opentest4j.reportin
//g.events.core.Data;
import org.mockito.Mockito;

import src.ClientAPI;
import src.ComputeCoordinator;
import src.ComputeEngineAPI;
import src.ComputeRequest;
import src.ComputeResult;
import src.ComputingRequest;
import src.ComputingResult;
import src.DataStorageAPI;
import src.Output;

public class TestComputeEngineAPI {
    @Test
    public void testAlgorithmCompute() {
        ComputeEngineAPI ce = new ComputeEngineAPI();
        ComputeCoordinator ce = new ComputeCoordinator();
        when(ce.compute(any(ComputeRequest.class))).thenReturn(ComputeResult.SUCCESS);
        ce.compute(1, 2);
    }

    @Test
    public void testRequest() {
        ComputeEngineAPI computeEngine = Mockito.mock(ComputeEngineAPI.class);
        when(computeEngine.compute(any(ComputeRequest.class)))
                .thenReturn(ComputingResult.SUCCESS);
        ComputingRequest request = new ComputingRequest();
        computeEngine.compute(request);
    }
}

class ComputeEngineIntegrationTest {
    DataStorageAPI datastore = new DataStorageAPI();
    ComputeEngineAPI computeEngine = new ComputeEngineAPI();

    public void testComputeEngineIntegration() {
        ClientAPI clientApi = new ClientAPI();
        // It should have pointer, pointing to the Compute Engine
        // And the Test Data Storage
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(10);
        list.add(25);
        //We add the list number to the Client API
        //We run it fully through the program, into the Data Storage as well,
        //we should a output Config of Array of string
        String s=" ";
        char c='A';
        clientApi.getInput(s);                                                           
        //datastore.userTranslate(any(Output.class),
        //computeEngine.compute(datastore.read(s,c)));
        String s1=" ";
        clientApi.getOutput(s1);
    }

    @Test
    public void validation(Output output){                //user input
        //if(output == computeEngine.compute(output)){}
    }
}
// I know this is all wrong I'm lost