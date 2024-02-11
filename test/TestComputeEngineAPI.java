package test;
import org.mockito.Mockito;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.any;
import org.junit.Test;
import src.ComputeEngineAPI;

public class TestComputeEngineAPI 
{
    @Test
    public void testComputeEngineAPI() 
    {
        ComputeEngineAPI ce = Mockito.mock(ComputeEngineAPI.class);
        when(ce.compute(any(Integer.class))).thenReturn("1");
        ce.compute(1);
    }
}