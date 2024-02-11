package src;
import ProjectFolder.ComputeRequest;
import java.util.Scanner;
public class ClientAPI {
    //objects
   private ClientAPI client=new ClientAPI();


   //Client InputingConfig
    public InputConfig getInputConfig(){
        //Client inputing the data
        InputConfig input=new InputConfig();
        
        return InputConfig;
    //Returning the InputConfig with the written data
    }


	public OutputConfig getOutputConfig(){



        return OutputConfig;
    }

    //returns a delimeter that the Client wants
	public char getDelimeter(){
        char Deli= 'A';
        return Deli;
    }
}



//Client may return 2 ints
//Scanner myObj=new Scanner(System.in);
//System.out.println("Enter 2 integers: ");
//int num1= myObj.nextInt();
//int num2= myObj.nextInt();
//myObj.close();
