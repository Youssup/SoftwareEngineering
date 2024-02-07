
import javax.xml.crypto.Data;

public interface ClientAPI {
//the front end of the program where the user can interact
    //read the data from the user
    public Data readData();

     //read the delimiter from the user
     public char readDelimiter();

    //the Client will input a Compute they want register
   // public Compute ComuteChoice();
}
