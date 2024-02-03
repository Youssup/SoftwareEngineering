public class User implements ComputerEngine {
    /*recive request from user method

    Sever to client and client to Server */

    public User jobInfoSend(User inputData){
        //give info on job and retrives the data from the Computer Engine
        User outputData= ComputerEngine.sending(InputData);
        
        //it will return the data from the Computer Engine
        return outputData;
    }

}

public interface UserAPI {
   User jobinfoSend(User inputData);
   
}
