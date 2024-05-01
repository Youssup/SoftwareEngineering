package src;

import java.math.BigInteger;

//import java.util.ArrayList;

public class ComputeEngineAPI extends ComputingResult implements ComputeEngine {

	public ComputeEngineAPI() {

	}

	// returns the string result of the two inputs using the avl function
	@Override
	public String compute(int input) {
		return (avl(input).toString());
	}

	// Computes the result using the avl function
    public BigInteger avl(int height) {
        if (height == 0)
            return BigInteger.valueOf(1);
        if (height == 1)
            return BigInteger.valueOf(2);

        BigInteger[] dp = new BigInteger[height + 1];
        dp[0] = BigInteger.valueOf(1);
        dp[1] = BigInteger.valueOf(2);

        for (int i = 2; i <= height; i++) {
        	dp[i] = dp[i - 1].add(dp[i - 2]).add(BigInteger.valueOf(1));
        }

        return dp[height];

    }

	// Main method to test the compute method
	public static void main(String[] args) {
		ComputeEngineAPI ce = new ComputeEngineAPI();
		System.out.println(ce.compute(40));
	
	}
}
