package src;

//import java.util.ArrayList;

public class ComputeEngineAPI extends ComputingResult implements ComputeEngine {
	
	public ComputeEngineAPI() {
	}
	
	// returns the string result of the two inputs using the ackermann function
	@Override
	public String compute(int input) {
		//String[] inputs = input.split(",");
		//int m = input;
		//int n = input;
		return Integer.toString(ackermann(input, input));
	}

	// Computes the result using the ackermann function
	public int ackermann(int m, int n) {
		
 		return m + n;
	}
}
