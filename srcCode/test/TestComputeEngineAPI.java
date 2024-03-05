package test;

import org.junit.Test;
import org.mockito.Mockito;

import src.ClientAPI;
import src.ComputeEngineAPI;
import src.DataStorageAPI;
import src.Output;

import java.util.ArrayList;

import static org.mockito.Mockito.when;

public class TestComputeEngineAPI {
	
	@Test
	public void smokeTestCompute() {
        ComputeEngineAPI computeEngine = Mockito.mock(ComputeEngineAPI.class);
        when(computeEngine.compute(1)).thenReturn("2");
        computeEngine.compute(1);
    }
	
	
	
	@Test
	public void testAlgorithmCompute() {
		ComputeEngineAPI ce = new ComputeEngineAPI();
		int input = 2;
		
		String result = ce.compute(input);
		
		assert(result.equals("4"));
	}

	@Test
	public void smokeTestRequest() {
		ComputeEngineAPI computeEngine = Mockito.mock(ComputeEngineAPI.class);
		when(computeEngine.compute(2)).thenReturn("4");
		computeEngine.compute(2);
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
		// We add the list number to the Client API
		// We run it fully through the program, into the Data Storage as well,
		// we should a output Config of Array of string
		String s = " ";
		//char c = 'A';
		clientApi.getInput(s);
		// datastore.userTranslate(any(Output.class),
		// computeEngine.compute(datastore.read(s,c)));
		String s1 = " ";
		clientApi.getOutput(s1);
	}

	@Test
	public void validation(Output output) { // user input
		// if(output == computeEngine.compute(output)){}
	}
}
// I know this is all wrong I'm lost