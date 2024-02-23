package test;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import src.DataStorageAPI;
import src.WritingResult;

//We will use Mockito to simulate the behavior of our classes

public class TestDataStorageAPI extends DataStorageAPI{

    @Test
    public void testRead(){
        DataStorageAPI dataStorageAPI = Mockito.mock(DataStorageAPI.class);

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        when(dataStorageAPI.read(any(String.class), any(Character.class))).thenReturn(list);

        Assertions.assertEquals(list,
                dataStorageAPI.read("1, 2, 3, 4", ','));
    }
    
    @Test
    public void testUserTranslate(){
        DataStorageAPI dataStorageAPI = new DataStorageAPI();
        //when(dataStorageAPI.userTranslate(any(int[].class))).thenReturn(new WritingResult());
        int[] te= {1, 2, 3, 4};
        Assertions.assertEquals(new WritingResult("1234"),
                dataStorageAPI.userTranslate(te));
    }
  }
