package test;

import org.mockito.Mockito;

import src.ComputeCoordinator;
import src.ComputingRequest;
import src.ComputingResult;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import src.FileInput;
import src.FileOutput;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TestComputeCoordinator {
	
	@Test
	public void smokeTestCompute() {
		ComputeCoordinator computeEngine = Mockito.mock(ComputeCoordinator.class);
		when(computeEngine.compute(any(ComputingRequest.class))).
		thenReturn(ComputingResult.SUCCESS);
		ComputingRequest request = new ComputingRequest(new FileInput("TestInput.txt"),
				new FileOutput("TestOutput.txt"), ',');
		ComputingResult result = computeEngine.compute(request);
		assert (result.equals(ComputingResult.SUCCESS));
	}
	
	@Test
	public void testComputeCoordinator() throws IOException{
		//Briefly create file for the input to reference
		//Write 1,2 to the file
		File file = new File("TestInput.txt.temp");
		//Create the file
		try {
			file.createNewFile();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		FileWriter writer = new FileWriter(file, true);
		writer.append("1\n");
		writer.append("2\n");
		writer.close();
		
		
		ComputeCoordinator ce = new ComputeCoordinator();
		FileInput inputConfig = new FileInput("TestInput.txt.temp");
		FileOutput outputConfig = new FileOutput("TestOutput.txt.temp");
		char delimiter = ',';
		
		ComputingResult result = ce.compute(new ComputingRequest(inputConfig,
				outputConfig, delimiter));

        assert(result.equals(ComputingResult.SUCCESS));
        file.deleteOnExit();
    }
}

