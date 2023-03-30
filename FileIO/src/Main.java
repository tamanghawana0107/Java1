import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args ) throws IOException
    {
        // creating a new file
        File input = new File("Hawana.txt");

            // create new file
            input.createNewFile();

            //write something on this file

            FileWriter writer = new FileWriter("Hawana.Txt");       // writes in file
            writer.write("New file created sucessfully");
            writer.write("\nSecond line input ");
            System.out.println("New file created");
            writer.close();



            //read from the file
            FileReader reads = new FileReader("Hawana.txt");
            int value;
            while (( value = reads.read()) != -1)
            {

                System.out.print((char)value);
            }
            reads.close();
            //file delete code
            //input.delete();
    }
}