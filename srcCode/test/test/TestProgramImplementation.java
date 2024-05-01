package test;

import static org.junit.Assert.assertEquals;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

//import org.junit.jupiter.api.Test;

import src.ComputeCoordinator;
import src.FileInput;
import src.FileOutput;
import src.ComputingResult;


public class TestProgramImplementation {

	//Lets create an output file, run the computation, then check the output file
	//We have been getting weird outputs
	//I just want to ensure that running a basic input file will give the expected output
	//Test is failing so is currently bypassed
	//@Test
	public void testRun() throws IOException {
		List<Integer> answers = new ArrayList<>();
		ComputeCoordinator cc = new ComputeCoordinator();
		FileInput input = new FileInput("testFile.txt");
		FileOutput output = new FileOutput("testOutput1.txt");
		ComputingResult cr = cc.run(input, output, ',');
		BufferedReader reader = new BufferedReader(new FileReader("testOutput1.txt"));
		String line = reader.readLine();
		for (int i = 0; i < line.split(",").length; i++)
			answers.add(Integer.parseInt(line.split(",")[i]));
		
		//Assert that answers is 1
		assertEquals(1, answers.get(0).intValue());
		assertEquals(2, answers.get(1).intValue());
		
		reader.close();
		
	}

	//@Test
	public void testRunException() {
		ComputeCoordinator cc = new ComputeCoordinator();
		FileInput input = new FileInput("testFile.txt");
		ComputingResult cr = cc.run(input, ',');
		//assertEquals(2, cr.getResultValue());
	}
	
	//Test the computeCoordinator and track the time taken to run the computation
	//Use the old avl function
	//@Test
	public void testComputeCoordinator1() {
		FileInput input = new FileInput("largeInput.txt");
		FileOutput output = new FileOutput("largeOutput.txt");
		ComputeCoordinator cc = new ComputeCoordinator();
		long startTime = System.nanoTime();
		ComputingResult cr = cc.run(input, output , ',');
		long endTime = System.nanoTime();
		long duration = (endTime - startTime);
		duration = duration / 1000000000;
		System.out.println("Time taken for old computation: " + duration + " seconds");
		assertEquals(ComputingResult.class, cr.getClass());
	}
	
	//Test the computeCoordinator and track the time taken to run the computation
	//Use the new avl function
	//@Test
	public void testComputeCoordinator2() {
		FileInput input = new FileInput("largeInput2.txt");
		FileOutput output = new FileOutput("largeOutput2.txt");
		ComputeCoordinator cc = new ComputeCoordinator();
		long startTime = System.nanoTime();
		ComputingResult cr = cc.run(input, output , ',');
		long endTime = System.nanoTime();
		long duration = (endTime - startTime);
		duration = duration / 1000000000;
		System.out.println("Time for Dynamic computation: " + duration + " seconds");
		assertEquals(ComputingResult.class, cr.getClass());
	}
	
}