package src;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;

public class DataStorageAPI implements DataStore {
	// Adding ComputeEngineAPI as a dependency
	// This will take the responsibility of the computation
	// and draw the result of the computation for translation

	// private ComputeEngineAPI computeEngine;

	public DataStorageAPI() {
		// We can decide what attributes to initialize here
		// May not need constructor
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
	public Iterator<Integer> readFile(String fileName){        // Create an iterator to read the file
		Iterator<Integer> it = null;
		try {
			it = new Iterator<Integer>() {
				BufferedReader reader = new BufferedReader(new FileReader(fileName));
				String line = reader.readLine();
				
				@Override
				public boolean hasNext() {
					return line != null;
				}


				@Override
				public Integer next() {
					try {
						int result = Integer.parseInt(line);
						line = reader.readLine();
						return result;
					} catch (IOException e) {
						e.printStackTrace();
					}
					return null;
				}
			};
		} catch (IOException e) {
			e.printStackTrace();
		}
		return it;
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
