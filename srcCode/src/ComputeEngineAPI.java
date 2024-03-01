package src;

//import java.util.ArrayList;

public class ComputeEngineAPI extends ComputingResult implements ComputeEngine {
	// needs the to decipher what the job is from the client
	// private ClientAPI client;
	// needs to retrieve the single outputs from the data storage
	// private DataStorageAPI dataStorage;

	// returns the string result of the two inputs using the ackermann function
	@Override
	public int compute(int input) {
		return ackermann(input, input);
	}

	// Computes the result using the ackermann function
	public int ackermann(int m, int n) {
		if (m == 0) {
			return n + 1;
		} else if (n == 0) {
			return ackermann(m - 1, 1);
		} else {
			return ackermann(m - 1, ackermann(m, n - 1));
		}
	}
}
