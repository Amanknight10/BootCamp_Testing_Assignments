package casestudy;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ApiIfExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Response response = RestAssured.get("https://reqres.in/api/users/2");
        int statusCode = response.getStatusCode();

        if (statusCode == 200) {
            System.out.println("API call successful.");
        }
	}

}
