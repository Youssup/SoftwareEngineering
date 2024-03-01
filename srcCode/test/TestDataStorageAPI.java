package test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;

import org.junit.Assert;
import org.junit.Test;

import src.DataStorageAPI;
import src.DataStore;
import src.InputConfig;
import src.OutputConfig;

//We will use Mockito to simulate the behavior of our classes

public class TestDataStorageAPI extends DataStorageAPI {

	@Test
	public void smokeTestRead() throws IOException {
		File file = new File("dataStoreTest.smokeTestRead.txt.temp");
		file.createNewFile();
		file.deleteOnExit();
		InputConfig inputConfig = new InputConfig(file.getCanonicalPath());
				
		DataStorageAPI dataStore = new DataStorageAPI();
		Assert.assertEquals(false, dataStore.read(inputConfig).iterator().hasNext());
		
	}

	@Test
	public void smokeTestUserTranslate() throws IOException {
		File file = new File("dataStoreTest.smokeTestWrite.txt.temp");
		file.deleteOnExit();
		OutputConfig outputConfig = new OutputConfig(file.getCanonicalPath());
			
		DataStorageAPI dataStore = new DataStorageAPI();
		
		Assert.assertEquals("success", dataStore.
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
		writer.close();
		
		InputConfig inputConfig = new InputConfig(file.getCanonicalPath());
		
		DataStore dataStore = new DataStorageAPI();
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
		file.deleteOnExit();
		OutputConfig outputConfig = new OutputConfig(file.getCanonicalPath());

		DataStore dataStore = new DataStorageAPI();
		Assert.assertEquals("success", dataStore.userTranslate(outputConfig, "result", 'a'));
	}
}
