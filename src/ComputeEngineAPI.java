package src;

import project.ComputeEngine;
import project.ComputeRequest;
import project.ComputeResult;
import project.ComputingRequest;
import project.ComputingResult;
import project.ComputationCoordinator;

public class ComputeEngineAPI implements ComputeEngine, ComputationCoordinator {
    // needs the to decipher what the job is from the client
    // private ClientAPI client;
    // needs to retrieve the single outputs from the data storage
    // private DataStorageAPI dataStorage;

    // returns the string result of the two inputs using the ackermann function
    @Override
    public String compute(int input1, int input2) {
        return String.valueOf(ackermann(input1, input2));
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

    @Override
    public ComputeResult compute(ComputeRequest request) {
        ClientAPI client = new ClientAPI();
        DataStorageAPI dataStorage = new DataStorageAPI();
        int[] userInputArray = request.getInputConfig();
        int[] outputConfig = request.getOutputConfig();

    }
}
