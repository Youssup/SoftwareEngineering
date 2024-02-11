package src;
import java.util.Scanner;
public class ClientAPI {
    //objects
   private ComputeEngineAPI comp=new ComputeEngineAPI();
   private ClientAPI client=new ClientAPI();


   //Client Inputing 2 integers
    public InputConfig getInputConfig(){
        Scanner myObj=new Scanner(System.in);
        System.out.println("Enter 2 integers: ");
        int num1= myObj.nextInt();
        int num2= myObj.nextInt();
        myObj.close();
        return InputConfig;
    //Returning the int array with the written ints
    }


	public OutputConfig getOutputConfig(){

        InputConfig input= input.getInputConfig();

        OutputConfig
    }
	public char getDelimeter(){
        char Deli= 'A';
        return Deli;
    }
}
