package project;

public interface DataStore {
	Iterable<Integer> read(String input, char delimiter);
	WriteResult userTranslate(int[] output);

}
