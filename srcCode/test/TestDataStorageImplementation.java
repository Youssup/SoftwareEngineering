package test;

import src.DataStore;
import src.InputConfig;
import src.OutputConfig;
import src.WritingResult;

public class TestDataStorageImplementation implements DataStore {

	public Iterable<Integer> read(InputConfig input) {
		InMemInputConfig inMemInput = new InMemInputConfig(1, 2, 3, 4, 5);
		return inMemInput.getInputs();
	}

	@Override
	public WritingResult userTranslate(OutputConfig output, String result, char delimiter) {
		return new WritingResult(output.getFileName());
	}

}
