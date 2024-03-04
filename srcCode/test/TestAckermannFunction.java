package test;

import static org.mockito.Mockito.when;

import org.junit.Test;
import org.mockito.Mockito;

import src.ComputeEngineAPI;

public class TestAckermannFunction {
	@Test
	public void testAckermannFunction() {
		ComputeEngineAPI computeEngine = Mockito.mock(ComputeEngineAPI.class);
		when(computeEngine.compute("2,2")).thenReturn("7");
	}
	
	@Test
	public void testAckermannFunction2() {
		ComputeEngineAPI computeEngine = Mockito.mock(ComputeEngineAPI.class);
		when(computeEngine.ackermann(2, 2)).thenReturn(7);
	}
}