package src;

public interface DataStore {
	Iterable<Integer> read(FileInput input);

	WriteResult userTranslate(FileOutput output, String result, char delimiter);

}
