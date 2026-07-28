package interfaces;
interface FirstInterface{
	public void myMethod();
}
interface secondInterface{
	public void myOtherMethod();
}
class DemoClass implements FirstInterface,secondInterface{
	public void myMethod() {
		System.out.println("Enter some text...");
	}
	public void myOtherMethod() {
		System.out.println("Enter Some Other text...");
	}
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        DemoClass myObj=new DemoClass();
        myObj.myMethod();
        myObj.myOtherMethod();
	}

}
