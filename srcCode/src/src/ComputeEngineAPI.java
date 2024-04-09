package src;

//import java.util.ArrayList;

public class ComputeEngineAPI extends ComputingResult implements ComputeEngine {

	public ComputeEngineAPI() {

	}

	// returns the string result of the two inputs using the avl function
	@Override
	public String compute(int input) {
		return Integer.toString(avl(input));
	}

	// Computes the result using the avl function
	public int avl(int height) {
 		if (height == 0) {
			return 1;
		} else if (height == 1) {
		return 2;
	} else {
		return avl(height - 1) + avl(height - 2) + 1;
	}
	}
}
