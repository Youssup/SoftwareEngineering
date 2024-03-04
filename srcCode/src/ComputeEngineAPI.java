package src;

//import java.util.ArrayList;

public class ComputeEngineAPI extends ComputingResult implements ComputeEngine {
	
	public ComputeEngineAPI() {
	}
	
	// returns the string result of the two inputs using the ackermann function
	@Override
	public String compute(String input) {
		String[] inputs = input.split(",");
		int m = Integer.parseInt(inputs[0]);
		int n = Integer.parseInt(inputs[1]);
		return Integer.toString(ackermann(m, n));
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
