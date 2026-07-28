package File_handling;
import java.io.File;
public class GetFileInformation {
     public static void main(String[]args) {
    	 File myObj=new File("");
    	 if(myObj.exists()) {
    		 System.out.println("File name:"+myObj.getName());
    		 System.out.println("Absolute path:"+myObj.getAbsolutePath());
    		 System.out.println("Writeable:"+myObj.canWrite());
    		 System.out.println("File name:"+myObj.());
    		 System.out.println("File name:"+myObj.getName());
    	 }
     }
}
