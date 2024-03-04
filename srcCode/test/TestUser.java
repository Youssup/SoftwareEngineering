package test;

import java.io.File;

import src.FileInput;
import src.FileOutput;
import src.ComputeCoordinator;
import src.ComputingRequest;
import src.ComputingResult;


public class TestUser{
	
	// TODO 3: change the type of this variable to the name you're using for your
	// User <-> ComputeEngine API; also update the parameter passed to the constructor
	private final ComputeCoordinator coordinator;

	public TestUser(ComputeCoordinator coordinator) {
		this.coordinator = coordinator;
	}

	public void run(String outputPath) {
		char delimiter = ',';
		String inputPath = "srcCode" + File.separator + "test" 
				+ File.separator + "testInputFile.test";
		
		// TODO 4: Call the appropriate method(s) on the coordinator to get it to 
		// run the compute job specified by inputPath, outputPath, and delimiter
		ComputingRequest request = new ComputingRequest(new FileInput(inputPath), 
				new FileOutput(outputPath), delimiter);
		ComputingResult result = coordinator.compute(request);
		if (result == ComputingResult.SUCCESS) {
			System.out.println("Success!");
		} else {
			System.out.println("Failure!");
		}
	}

}
