package test;

import java.util.ArrayList;
import java.util.List;

import src.Output;

public class InMemOutputConfig implements Output{
	
	private final List<String> output;

	public InMemOutputConfig() {
		this.output = new ArrayList<String>();
	}

	public List<String> getOutputData() {
		return output;
	}

	public void write(String data) {
		output.add(data);
	}

}
