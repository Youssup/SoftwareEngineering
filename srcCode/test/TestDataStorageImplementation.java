package test;

import src.DataStorageAPI;

import src.WritingResult;

import java.util.List;
import java.util.ArrayList;
import src.InputConfig;	

public class TestDataStorageImplementation implements DataStore {

	public Iterable<Integer> read(InputConfig input) {
		return ((InMemInputConfig)input).getInputs();
	}

	@Override
	public WriteResult appendSingleResult(OutputConfig output, String result, char delimiter) {
		
	}

}
