public class DataStorage implements DataStorageInterface{
    //Receive computed data from CE and translate
    public DataStorage userTranslate(Data data){
        //Some magical algorithm to translate data will exist below
        //This is the 'write' poriton of the DS
        Data translatedData = computeDataTranslate(data);
        return translateddata;
    }

    //Send data back to CE translated
    public DataStorage computeDataTranslate(Data translatedData){
        //Some magical algorithm will place the translated data
        //into the correct format for the CE to read
        Data data = translatedData;
        return data;
    }

}

public interface DataStorageInterface {
    //Method to translate data for user
    DataStorage userTranslate(Data data);
    //Method to send data to CE
    DataStorage computeDataTranslate(Data data);
}
