package src;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;

public class DataStorageAPI implements DataStore {

	public DataStorageAPI() {
		// We can decide what attributes to initialize here if needed
	}
	
	public Iterable<Integer> read(FileInput input){ 
		return new Iterable<Integer>() {
			@Override
			public Iterator<Integer> iterator() {
				return readFile(input.getFileName());
			}
		};
	}
	
	// This method will read the file and return an iterator
	// Create an iterator to read the file
	public Iterator<Integer> readFile(String fileName){
		try {
			return new Iterator<Integer>() {
				BufferedReader buff = new BufferedReader(new FileReader(fileName));
				// read the first line so that hasNext() 
				//correctly recognizes empty files as empty
				String line = buff.readLine(); 
				boolean closed = false;

				@Override
				public Integer next() {

					int result = Integer.parseInt(line);
					try {
						line = buff.readLine();
						if (!hasNext()) {
							buff.close();
							closed = true;
						}
					} catch (IOException e) {
						throw new RuntimeException(e);
					}
					
					return result;
				}

				@Override
				public boolean hasNext() {
					return line != null;
				}
				
				@SuppressWarnings("unused")
				public void finish() {
					if (!closed) {
						try {
							buff.close();
							closed = true;
						} catch (IOException e) {
							throw new RuntimeException(e);
						}
					}
				}
			};
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	// This method will take the result of the computation and write it to a
	// WritingResult object
	public WritingResult userTranslate(FileOutput output, String result, char delimiter) {
		writeFile(output.getFileName(), result + delimiter);
		return new WritingResult(output.getFileName());
	}
	
	public void writeFile(String fileName, String line) {
		try {
			FileWriter writer = new FileWriter(new File(fileName));
			writer.write(line);
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	

}
