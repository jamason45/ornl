import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class Employee_Delete {

	  //remove an entry from the file
	 public static String fileToString(String filePath) throws Exception{
	        String input = null;
	        Scanner sc = new Scanner(new File(filePath));
	        StringBuffer sb = new StringBuffer();
	        while (sc.hasNextLine()) {
	           input = sc.nextLine();
	           sb.append(input);
	        }
	        return sb.toString();
	    }
	    //search file and delete employee
	String filePath =( "/tmp/employee.txt");
    String result = fileToString(filePath);
    System.out.println("Contents of the file: "+result);
    //Replacing the word with desired one or blank
    result = result.replaceAll("\\bEmployeeName\\b", "");
    //Rewriting the contents of the file
    PrintWriter writer = new PrintWriter(new File(filePath));
    writer.append(result);
    writer.flush();
    System.out.println("Contents of the file after replacing the desired word:");
    System.out.println(void fileToString(filePath));
    
   
}
