package src;

//import java.util.ArrayList;

public class ComputeCoordinator implements ComputationCoordinator {
	
	private final DataStorageAPI ds;
	private final ComputeEngineAPI ce;
	
	public ComputeCoordinator() {
		this.ds = new DataStorageAPI();
		this.ce = new ComputeEngineAPI();
	}
	//Needs to take in some type of list and then iterate
	public ComputingResult compute(ComputingRequest request) {
		Iterable<Integer> integers = ds.read(request.getInputConfig());
		//This will take two values and compute the ackermann function
		for (int i : integers) {
			String result = ce.compute(i);
			ds.userTranslate(request.getOutputConfig(), result, request.getDelimeter());
		}

		
		
		return (ComputingResult) ComputingResult.SUCCESS;
	}
	
	public void run(FileInput input, char delimiter) {
		Iterable<Integer> integers = ds.read(input);
		String result = "";
		for (int i : integers) {
			result = result + ce.compute(i) + delimiter;
		}
		FileOutput output= new FileOutput("runtest.txt.temp");
		ds.userTranslate(output, result, delimiter);
		System.out.println("Output: " + result);
	}
}
