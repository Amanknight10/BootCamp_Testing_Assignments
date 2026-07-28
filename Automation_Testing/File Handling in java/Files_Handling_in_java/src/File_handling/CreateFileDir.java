package File_handling;
import java.io.File;
import java.io.Files;
public class CreateFileDir {

	public static void main(String[] args) {
		try {
			File myObj=new File("/Users/amansingh/Files/Aman1.txt");
			if(myObj.createNewFile()) {
				System.out.println("File Created:"+myObj.getName());
				System.out.println("Absolute path:"+myObj.getAbsolutePath());
			}
			else {
				System.out.println("File already exists.");
			}
		}catch(IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}

	}

}
