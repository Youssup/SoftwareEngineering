package src;

//import java.util.ArrayList;

public class ComputeCoordinator implements ComputationCoordinator {
	// Gives jobs to different classes and returns the final result which will then
	// be used by the user
	/*public ComputeResult compute(ComputeRequest request) {
		DataStorageAPI dataStorage = new DataStorageAPI();
		// get the String input from the client
		String userInput = request.getInput("");
		// send that string to the data store and recieve an array back
		ArrayList<Integer> inputArray = dataStorage.read(userInput, 'a');
		// compute the entire array using the ackermann function
		// store it into a new array that will be returned back to dataStorage
		// new array to store the results of the computations
		int[] outputArray = new int[inputArray.size()];
		// computes the results of the input array and stores them in the output array
		for (int i = 0; i < inputArray.size(); i++) {
			int count;
			outputArray[count] = ackermann((int) inputArray.get(i));
		}
		// send the new array to the data store and recieve a user translated string
		// back
		WritingResult userResult = dataStorage.userTranslate(outputArray);
		// send the string back to the client somehow???
		// return the result which is successful.
		return new ComputingResult();
	} */
	
	private final DataStorageAPI ds;
	private final ComputeEngineAPI ce;
	
	public ComputeCoordinator(DataStorageAPI ds, ComputeEngineAPI ce) {
		this.ds = ds;
		this.ce = ce;
	}
	
	public ComputeResult compute(ComputeRequest request) {
		Iterable<Integer> integers = ds.read(request.getInput());
		for (int val : integers) {
			ds.appendSingleResult(request.getOutput(),
					ce.compute(val), request.getDelimeter());
		}
		return ComputeResult.SUCCESS;
	}
}
