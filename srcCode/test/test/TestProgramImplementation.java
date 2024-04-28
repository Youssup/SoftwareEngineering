package test;

import static org.junit.Assert.assertEquals;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import src.ComputeCoordinator;
import src.FileInput;
import src.FileOutput;
import src.ComputingResult;


public class TestProgramImplementation {

	//Lets create an output file, run the computation, then check the output file
	//We have been getting weird outputs
	//I just want to ensure that running a basic input file will give the expected output
	@Test
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

	@Test
	public void testRunException() {
		ComputeCoordinator cc = new ComputeCoordinator();
		FileInput input = new FileInput("testFile.txt");
		ComputingResult cr = cc.run(input, ',');
		//assertEquals(2, cr.getResultValue());
	}
	
}