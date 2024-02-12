package src;
import project.ComputeRequest;
//import java.util.Scanner;
public class ClientAPI implements ComputeRequest{
    //objects
   //private ClientAPI client=new ClientAPI();


   //Client InputingConfig
    public int[] getInputConfig(){
        /*Client inputing the data
        Scanner myObj=new Scanner(System.in);
        System.out.println("Enter 2 integers: ");
        int num1= myObj.nextInt();
        int num2= myObj.nextInt();
        myObj.close();*/
        return new int[] {4 , 5};
    //Returning the InputConfig with the written data
    }


	public int[] getOutputConfig(){


        return new int[] {1 , 2};
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
