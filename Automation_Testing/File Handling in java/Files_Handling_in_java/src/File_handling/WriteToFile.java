package File_handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WriteToFile {

	public static void main(String[] args) {
			try {
				FileWriter myWriter =new FileWriter("");
				
				Scanner myReader=new Scanner(myObj);
				while(myReader.hasNextLine()) {
					String data=myReader.nextLine();
					System.out.println(data);
				}
				myReader.close();
			}catch(FileNotFoundException e) {
				System.out.println("An error occured - File not Found");
				e.printStackTrace();
			}
	}

}
