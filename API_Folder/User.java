public class User implements ComputerEngine {
    /*recive request from user method

    Sever to client and client to Server */

    public Data jobInfoSend(Data inputData){
        //give info on job and retrives the data from the Computer Engine
        Data outputData= ComputerEngine.sendToUser(InputData);
        
        //it will return the data from the Computer Engine
        return outputData;
    }

}

public interface UserAPI {
   User jobinfoSend(User inputData);
   
}
