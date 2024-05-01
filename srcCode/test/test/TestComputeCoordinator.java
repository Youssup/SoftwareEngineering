package test;

//import org.mockito.Mockito;

import src.ComputeCoordinator;
//import src.ComputingRequest;
//import src.ComputingResult;
import org.junit.jupiter.api.Test;
//import static org.mockito.ArgumentMatchers.any;
//import static org.mockito.Mockito.when;
import src.FileInput;
import src.FileOutput;

//import src.FileOutput;
//import java.io.File;
//import java.io.FileWriter;
import java.io.IOException;

public class TestComputeCoordinator {
	
	@Test
	public void testRun() throws IOException {

		ComputeCoordinator ce = new ComputeCoordinator();
		FileInput inputConfig = new FileInput("TestRunInput.txt.temp");
		char delimiter = ',';

		ce.run(inputConfig, delimiter);
	}
	
	@Test
	public void testRun2() {
		ComputeCoordinator ce = new ComputeCoordinator();
		FileInput inputConfig = new FileInput("TestRunInput.txt.temp");
		char delimiter = ',';
		FileOutput outputConfig = new FileOutput("TestRunOutput.txt.temp");
		ce.run(inputConfig, outputConfig, delimiter);
		
		
	}
}

