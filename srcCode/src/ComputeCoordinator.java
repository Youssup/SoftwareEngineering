package src;

//import java.util.ArrayList;

public class ComputeCoordinator implements ComputationCoordinator {
	
	private final DataStorageAPI ds;
	private final ComputeEngineAPI ce;
	
	public ComputeCoordinator() {
		this.ds = new DataStorageAPI();
		this.ce = new ComputeEngineAPI();
	}
	
	public ComputingResult compute(ComputingRequest request) {
		Iterable<Integer> integers = ds.read(request.getInputConfig());
		//This will take two values and compute the ackermann function
		for (int i = 0; i < 2; i++) {
			int m = integers.iterator().next();
			int n = integers.iterator().next();
			//Will need to retrofit this to use the correct delimiter
			String result = ce.compute(m + "," + n);
			ds.userTranslate(request.getOutputConfig(), result, request.getDelimeter());
		}	
		
		return (ComputingResult) ComputingResult.SUCCESS;
	}
}
