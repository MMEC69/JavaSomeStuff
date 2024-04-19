package Activity12;

import java.io.FileWriter;
import java.io.IOException;

public class Activity12_2 {
    public static void main(String args[]){
        try{
            FileWriter myWriter = new FileWriter("Sample.txt");
            myWriter.write("Files in Java might be tricky, but it is fun enough!");
            myWriter.close();
        }catch(IOException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
