package test;

import org.junit.Test;
import org.mockito.Mockito;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.any;
import src.ComputeEngineAPI;

public class TestAckermannFunction {
    @Test
    public void testAckermannFunction() {
        ComputeEngineAPI computeEngine = Mockito.mock(ComputeEngineAPI.class);
        when(computeEngine.compute(2, 2))
                .thenReturn(7);
    }
}