package ExceptionHandling;

public class C_01_checkedException_TryCatch {
    int x=10;
    public void m1() {
    	System.out.println("Value of X is:"+x);
    }
    public static void main(String[]args) {
    	C_01_CheckedException_TryCatch obj=new C_01_CheckedException_TryCatch();
    	Obj.m1();
    	try {
    		Tread.sleep(1000);
    	}catch(InterruptedException e) {
    		e.printstackTrace();
    	}
    }
}
