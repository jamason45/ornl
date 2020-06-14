import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Employee_Read {
	
	//DeSerializable to read from the file

	   public static void main(String [] args) {
	      Employee e = null;
	      try {
	         FileInputStream fileIn = new FileInputStream("/tmp/employee.txt");
	         ObjectInputStream in = new ObjectInputStream(fileIn);
	         e = (Employee) in.readObject();
	         in.close();
	         fileIn.close();
	      } catch (IOException i) {
	         i.printStackTrace();
	         return;
	      } catch (ClassNotFoundException c) {
	         System.out.println("Employee class not found");
	         c.printStackTrace();
	         return;
	      }
	      
	      System.out.println("Deserialized Employee...");
	      System.out.println("Name: " + e.getFirstName());
	      System.out.println("Address: " + e.getLastName());
	      System.out.println("SSN: " + e.getId());
	      
	   }
	
}
