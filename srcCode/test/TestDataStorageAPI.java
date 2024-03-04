package test;

import java.io.File;

import src.FileInput;
import src.FileOutput;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import org.junit.Assert;
import org.junit.Test;
import src.DataStorageAPI;
import src.DataStore;
import src.WritingResult;

public class TestDataStorageAPI extends DataStorageAPI {

	@Test
	public void smokeTestRead() throws IOException {
		File file = new File("dataStoreTest.smokeTestRead.txt.temp");
		file.createNewFile();
		file.deleteOnExit();
		FileInput inputConfig = new FileInput(file.getCanonicalPath());
				
		DataStorageAPI dataStore = new DataStorageAPI();
		Assert.assertEquals(false, dataStore.read(inputConfig).iterator().hasNext());
		
	}

	@Test
	public void smokeTestUserTranslate() throws IOException {
		File file = new File("dataStoreTest.smokeTestWrite.txt.temp");
		file.deleteOnExit();
		FileOutput outputConfig = new FileOutput(file.getCanonicalPath());
			
		DataStorageAPI dataStore = new DataStorageAPI();
		
		WritingResult result = dataStore.userTranslate(outputConfig, "result", 'a');
		
		Assert.assertEquals(result, dataStore.
					userTranslate(outputConfig, "result", 'a'));
		
	}
	
	@Test
	public void testRead() throws IOException{
		File file = new File("dataStoreTest.testRead.txt.temp");
		file.createNewFile();
		file.deleteOnExit();
		FileWriter writer = new FileWriter(file, true);
		writer.append("1\n");
		writer.append("2\n");
		writer.flush();
		writer.close();
		
		
		FileInput inputConfig = new FileInput(file.getCanonicalPath());
		
		DataStorageAPI dataStore = new DataStorageAPI();
		Iterator<Integer> iterator = dataStore.read(inputConfig).iterator();
		Assert.assertEquals(true, iterator.hasNext());
		Assert.assertEquals(1, iterator.next().intValue());
		Assert.assertEquals(true, iterator.hasNext());
		Assert.assertEquals(2, iterator.next().intValue());
		Assert.assertEquals(false, iterator.hasNext());
	}
	
	@Test
	public void testUserTranslate() throws IOException {
		File file = new File("dataStoreTest.testWrite.txt.temp");
		
		FileOutput outputConfig = new FileOutput(file.getCanonicalPath());

		DataStore dataStore = new DataStorageAPI();
		Assert.assertEquals(new WritingResult(outputConfig.getFileName()), 
				dataStore.userTranslate(outputConfig, "result", 'a'));
		file.deleteOnExit();
	}
}
