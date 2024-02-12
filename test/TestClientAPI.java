package test;
import src.ClientAPI;

import org.junit.Test;
import org.mockito.Mockito;
import static org.mockito.Mockito.when;
//import static org.mockito.Mockito.any;


public class TestClientAPI {
    @Test
    public void testGetInputConfig(){
        ClientAPI cAPI= Mockito.mock(ClientAPI.class);
        when(cAPI.getInputConfig()).thenReturn(new int[]{4 , 5});
    }

    @Test
    public void testGetOutputConfig(){
        ClientAPI cAPI= Mockito.mock(ClientAPI.class);
        when(cAPI.getOutputConfig()).thenReturn(new int[] {1 , 2});
    }

    @Test
    public void testGetDelimeter(){
        ClientAPI cAPI= Mockito.mock(ClientAPI.class);
        when(cAPI.getDelimeter()).thenReturn('A');
    }
}
