package src;

import java.util.ArrayList;

public class ComputeEngineAPI extends ComputingResult implements ComputeEngine, ComputationCoordinator {
    // needs the to decipher what the job is from the client
    // private ClientAPI client;
    // needs to retrieve the single outputs from the data storage
    // private DataStorageAPI dataStorage;

    // returns the string result of the two inputs using the ackermann function
    @Override
    public int compute(int input1, int input2) {
        return ackermann(input1, input2);
    }

    // Computes the result using the ackermann function
    public int ackermann(int m, int n) {
        if (m == 0) {
            return n + 1;
        } else if (n == 0) {
            return ackermann(m - 1, 1);
        } else {
            return ackermann(m - 1, ackermann(m, n - 1));
        }
    }

    // Gives jobs to different classes and returns the final result which will then
    // be used by the user
    @Override
    public ComputeResult compute(ComputeRequest request) {
        DataStorageAPI dataStorage = new DataStorageAPI();
        // get the String input from the client
        String userInput = request.getInput("");
        // send that string to the data store and recieve an array back
        ArrayList<Integer> inputArray = dataStorage.read(userInput, 'a');
        // if the array is not even size return failure
        ComputingResult result = new ComputingResult();
        if (inputArray.size() % 2 != 0) {
            return new ComputingResult();
        }
        // compute the entire array using the ackermann function (in sets of two) and
        // store it into a new array that will be returned back to dataStorage
        // keeps track of where to store results of computations inside new array
        int count = 0;
        // new array to store the results of the computations
        int[] outputArray = new int[inputArray.size() / 2 - 1];
        // computes the results of the input array and stores them in the output array
        for (int i = 0; i < inputArray.size(); i += 2) {
            outputArray[count] = ackermann((int) inputArray.get(i), (int) inputArray.get(i + 1));
            count++;
        }
        // send the new array to the data store and recieve a user translated string
        // back
        WritingResult userResult = dataStorage.userTranslate(outputArray);
        // send the string back to the client somehow???
        // return the result which is successful.
        return new ComputingResult();
    }

}
