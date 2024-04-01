package src;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

//import java.util.ArrayList;

public class ComputeCoordinator implements ComputationCoordinator {
	
	private final DataStorageAPI ds;
	private final ComputeEngineAPI ce;
	
	public ComputeCoordinator() {
		this.ds = new DataStorageAPI();
		this.ce = new ComputeEngineAPI();
	}
	
	public ComputingResult run(FileInput input, char delimiter) {
		 ExecutorService threadPool =Executors.newFixedThreadPool(3);
		 List<Future<?>> exceptionChecker= new ArrayList<>();
		Iterable<Integer> integers = ds.read(input);
		//final String result = "";
		for(int i : integers) {
			Callable<Void> startRun= () -> {
				String result= " ";
				result = result + ce.compute(i) + delimiter;
				FileOutput output= new FileOutput("runTestOutput.txt.temp");
				ds.userTranslate(output, result, delimiter);
				return null;
			};
			exceptionChecker.add(threadPool.submit(startRun));
		}
		return ComputingResult.SUCCESS;
		//System.out.println("Output: " + result);
	}
	
	
}
