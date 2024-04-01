package test;

import src.DataStore;
import src.FileInput;
import src.FileOutput;
import src.InputConfig;
import src.WritingResult;

public class TestDataStorageImplementation implements DataStore {

	public Iterable<Integer> read(InputConfig input) {
		InMemInputConfig inMemInput = new InMemInputConfig(1, 2, 3, 4, 5, 6);
		return inMemInput.getInputs();
	}

	@Override
	public WritingResult userTranslate(FileOutput output, String result, char delimiter) {
		return new WritingResult(output.getFileName());
	}

	@Override
	public Iterable<Integer> read(FileInput input) {
		// TODO Auto-generated method stub
		return null;
	}


}
