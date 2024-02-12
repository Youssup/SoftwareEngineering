package test;
import src.ClientAPI;

import org.junit.Test;
import org.mockito.Mockito;
import static org.mockito.Mockito.when;
//import static org.mockito.Mockito.any;


public class TestClientAPI {
    @Test
    public void testGetInputConfig(){
        ClientAPI cApi= Mockito.mock(ClientAPI.class);
        when(cApi.getInputConfig()).thenReturn(new int[]{4 , 5});
    }

    @Test
    public void testGetOutputConfig(){
        ClientAPI clientApi= Mockito.mock(ClientAPI.class);
        when(clientApi.getOutputConfig()).thenReturn(new int[] {1 , 2});
    }

    @Test
    public void testGetDelimeter(){
        ClientAPI cApi= Mockito.mock(ClientAPI.class);
        when(cApi.getDelimeter()).thenReturn('A');
    }
}
