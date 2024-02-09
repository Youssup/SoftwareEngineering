package src;
public class ComputeEngineAPI implements ComputeEngine, ComputationCoordinator
{
    //needs the to decipher what the job is from the client
    ClientAPI client;
    //needs to retrieve the single outputs from the data storage
    DataStorageAPI dataStorage;
    //Computes the result using the ackermann function
    public String compute(int value) 
    {
        return "1";
    }
    //Delegating jobs to the Client, ComputeEngine, and the DataStorage
    ComputeResult compute(ComputeRequest request)
    {
        return ComputeResult.SUCCESS;
    }

}
