package test;
import org.mockito.Mockito;
import static org.mockito.Mockito.when;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.any;
import org.junit.Test;
import src.ComputeEngineAPI;

public class TestComputeEngine 
{
    @Test
    public void testAlgorithmCompute() 
    {
        ComputeEngineAPI ce = Mockito.mock(ComputeEngineAPI.class);
        when(ce.compute(any(Integer.class))).thenReturn("1");
        ce.compute("1");
    }
    @Test
    public void testRequest() 
    {
        ComputeEngineAPI ce = Mockito.mock(ComputeEngineAPI.class);
        when(ce.compute(any(ComputeRequest.class)).thenReturn(ComputeResult.SUCCESS);
        ComputeRequest request = new ComputeRequest();
        ce.compute(request);
    }
}