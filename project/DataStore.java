package project;

public interface DataStore {
	Iterable<Integer> read(String input);
	WriteResult userTranslate(int[] output);
}
