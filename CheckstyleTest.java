//Testing Brandon's UnusedImports rule below
//import java.util.Scanner;
//import javax.swing.*;

//Fixed checkstyle rule by removing those unneeded imports

class CheckstyleTest{
    public static void main(String [] args){
        System.out.println("Java is so cool!");

        System.out.println("I imported Scanner, but I didn't use it. Oops");

        System.out.println("Why did I import swing? I don't use it!");

    }
}
