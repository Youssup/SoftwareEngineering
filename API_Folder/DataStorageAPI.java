public class DataStorage implements DataStorageInterface {
    //Receive computed data
    public DataStorage receiveData(Data data){
        //Receive computed data from CE
        //During receipt, data is translated into a format that can be used by the DataStorageAPI
        //Translated data is written to the database, and a response is sent back to the CE
        return data;
    }

    //Send data back to CE translated 
    public DataStorage sendData(Data data){
        //Send data to CE
        return data;
    }
}

public interface DataStorageInterface {
    //Method to receive and translate data from CE
    DataStorage receiveData(Data data);
    //Method to send data to CE
    DataStorage sendData(Data data);
}