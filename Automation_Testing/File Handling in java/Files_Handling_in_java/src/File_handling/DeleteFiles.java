package File_handling;

public class DeleteFiles {

	public static void main(String[] args) {
		File myObj =new File("");
		if(myObj.delete()) {
			System.out.println("Deleted the file:");
		}
		else {
			System.out.println("Failed to delete the file")
		}
	}

}
