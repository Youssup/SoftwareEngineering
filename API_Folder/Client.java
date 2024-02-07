import java.util.Scanner;

import javax.xml.crypto.Data;

//the front end of the program where the user can interact
public class Client implements ClientAPI{
    public Data readData(){
        //read the data from the user
        return scanner.nextLine();
    }
    public char readDelimiter() {
        //read the delimiter from the user
        return scanner.nextLine();
    
    }
    public void main(String[] args) {
        //create the Java program that the user will use
        Scanner scanner = new Scanner(System.in);
    }
}

//input data = data from the user

//Notes
//Client Data= 2 Integer
//Char Delimiter= char Delimiter
