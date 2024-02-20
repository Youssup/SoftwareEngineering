package src;
import java.util.ArrayList;
import project.DataStore;
//import project.InputConfig; Outmoded by the use of String input
//import project.OutputConfig; Outmoded by the use of int[] output
import project.WritingResult;

public class DataStorageAPI implements DataStore{
    //Adding ComputeEngineAPI as a dependency
    //This will take the responsibility of the computation
    //and draw the result of the computation for translation

    //private ComputeEngineAPI computeEngine;
	
    public DataStorageAPI(){
        //We can decide what attributes to initialize here
        //May not need constructor
    }

    public ArrayList<Integer> read(String input, char delimiter){
        //Create object to hold the ArrayList of integers
        ArrayList<Integer> list = new ArrayList<>();
        //We will separate the input string into an array of integers
        //And add them individually to an ArrayList called list
        for(int i = 0; i < input.length(); i++){
            if (input.charAt(i) != delimiter || input.charAt(i) != ' '){
                list.add(Character.getNumericValue(input.charAt(i)));
            }
        }
        //Returns an ArrayList of integers from the input string
        return list;
    }

    //This method will take the result of the computation and write it to a WritingResult object
	public WritingResult userTranslate(int[] output){
        //Create a WritingResult object to hold the result of the computation
        WritingResult writeResult = new WritingResult(); 
        //Create a string to hold the result of the computation
        String result = "";
        //We will add each integer in the output array to the result string
        for(int i = 0; i < output.length; i++){
            result += output[i];
        }
        //Set the result of the computation to the WritingResult object
        writeResult.setResult(result);
        //Return the WritingResult object
        return writeResult;
    }
    
}
