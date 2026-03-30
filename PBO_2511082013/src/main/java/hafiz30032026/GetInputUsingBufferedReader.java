package hafiz30032026;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GetInputUsingBufferedReader {
    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader (new InputStreamReader(System.in));
        String name = "";
        System.out.println("Please enter your name: ");
        try{
            name = dataIn.readLine();
        } catch(IOException e) {
            System.out.println("Error!");
        }
        System.out.println("Hello " + name + "!");
    }
}
