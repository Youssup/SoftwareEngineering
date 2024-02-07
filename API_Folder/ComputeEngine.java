public class ComputeEngine implements ComputeEngineAPI {
    //Computing the data sent from the user
    public int compute(int[] inputData) {
        computeDataTranslate(Client.readData(), Client.readDelimiter());
        //Ackerman function implementation
        return result;
    }
}
