package test;

import src.ClientAPI;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.any;

public class TestClientAPI {
	@Test
	public void testGetInputConfig() {
		ClientAPI clientApi = Mockito.mock(ClientAPI.class);
		when(clientApi.getInput(any(String.class))).thenReturn("hi");
	}

	@Test
	public void testGetOutputConfig() {
		ClientAPI clientApi = Mockito.mock(ClientAPI.class);
		when(clientApi.getOutput(any(String.class))).thenReturn("hello");
	}

	@Test
	public void testGetDelimeter() {
		ClientAPI clientApi = Mockito.mock(ClientAPI.class);
		when(clientApi.getDelimeter(any(Character.class))).thenReturn('A');
	}
}
