package src;

public interface DataStore {
	Iterable<Integer> read(InputConfig input);

	WriteResult userTranslate(OutputConfig output, String result, char delimiter);

}
