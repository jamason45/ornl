import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;
 
public class Employee_Saved 
{
    
      //  createFileUsingFileClass();
        //createFileUsingFileOutputStreamClass();
       //Serializable saves to the file
    
 
  
 
    private static Object e;

	private static void createFileUsingFileOutputStreamClass() throws IOException 
    {
    	
        
        
        try {
           FileOutputStream fileOut =
           new FileOutputStream("/tmp/employee.txt");
           ObjectOutputStream out = new ObjectOutputStream(fileOut);
           out.writeObject(e);
           out.close();
           fileOut.close();
           System.out.printf("Serialized data is saved in /tmp/employee.txt");
        } catch (IOException i) {
           i.printStackTrace();
        }
    }
 
    
}