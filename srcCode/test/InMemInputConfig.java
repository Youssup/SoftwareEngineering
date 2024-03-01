package test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import src.Input;

// This class is used to simulate the behavior of the InputConfig class
public class InMemInputConfig implements Input {

	private final List<Integer> inputs = new ArrayList<>();
	
	public InMemInputConfig(int... inputs) {
		for (int i : inputs) {
			this.inputs.add(i);
		}
	}
	
	public InMemInputConfig(Collection<Integer> inputs) {
		this.inputs.addAll(inputs);
	}

	
	public List<Integer> getInputs() {
		return inputs;
	}
}
