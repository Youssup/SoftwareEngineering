public class ComputeEngineAPI implements ComputeEngine
{
    //needs the to decipher what the job is from the client
    ClientAPI client;
    //needs to retrieve the single outputs from the data storage
    DataStorageAPI dataStorage;
    
    public String compute(int value) 
    {
        //Ackerman Function Computation
        String result = ""+value;
        return result;
    }
}
