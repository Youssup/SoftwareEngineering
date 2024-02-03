public class ComputeEngine{
    //Sending the Computed data to user
    public Data sendToUser(Data inputData) {
        //send inputData to data storage
        Data translatedData = sendToDataStorage(inputData);
        //compute translated data that was sent from data storage
        int computedData = compute(translatedData);
        //send that computed data to the client/user
        Data outputData = DataStorage.userTranslate(computedData);

    }

    //sending the data retrived from user, to the Data Storage
    public Data sendToDataStorage(Data inputData) {
        /*send user data to data storage and retrieve the 
        translated data that the Compute Engine can understand*/
        Data translatedData = DataStorage.userTranslate(inputData);
        /*return the translated data*/
        return translatedData;
    }

    //Computing the data sent from the user
    public Data compute(Data inputData) {
        //Ackerman function implementation
    }
}

public interface ComputeEngineAPI{
//Getting the data from User and sending back the finished Data back to User
Data sendToUser(Data inputData);
//Sending the Data from CE to DS to compute and sending the info from DS to CE
Data sendToDataStorage(Data inputData);
}
