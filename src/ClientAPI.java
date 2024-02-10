package src;
import java.util.Scanner;
public class ClientAPI {

   ComputeEngineAPI comp=new ComputeEngine();
   //Client Inputing 2 integers
    public int[] getInputConfig(){
        Scanner myObj=new Scanner(System.in);
        System.out.println("Enter 2 integers: ");
        int num1= myObj.nextInt();
        int num2= myObj.nextInt();
        myObj.close();
        return new int[]{num1, num2};
    //Returning the int array with the written ints
    }


	public int[] getOutputConfig(){
        int[] output=new int[0];
        return output;
    }
	public char getDelimeter(){
        char Deli= 'A';
        return Deli;
    }
}
