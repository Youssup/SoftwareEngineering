package test;

import java.math.BigInteger;

import org.junit.jupiter.api.Test;

import src.ComputeEngineAPI;

public class TestAVL {
	@Test
	public void testAVL1() {
		ComputeEngineAPI computeEngine = new ComputeEngineAPI();
		String result = computeEngine.compute(0);
		assert(result.equals("1"));
	}
	
	@Test
	public void testAVL2() {
		ComputeEngineAPI computeEngine = new ComputeEngineAPI();
        BigInteger result = computeEngine.avl(1);
        assert(result.equals(BigInteger.valueOf(2)));
    }
	
	@Test
	public void testAVL3() {
		ComputeEngineAPI computeEngine = new ComputeEngineAPI();
		BigInteger result = computeEngine.avl(2);
		assert (result.equals(BigInteger.valueOf(4)));
	}
	
	@Test
	public void testAVL4() {
		ComputeEngineAPI computeEngine = new ComputeEngineAPI();
		BigInteger result = computeEngine.avl(3);
		assert (result.equals(BigInteger.valueOf(7)));
	}
	
	@Test
	public void testAVL5() {
		ComputeEngineAPI computeEngine = new ComputeEngineAPI();
		BigInteger result = computeEngine.avl(4);
		assert (result.equals(BigInteger.valueOf(12)));
	}
	@Test
	public void testAVL6() {
		ComputeEngineAPI computeEngine = new ComputeEngineAPI();
		BigInteger result = computeEngine.avl(40);
		assert (result.equals(new BigInteger("433494436")));
	}
}
