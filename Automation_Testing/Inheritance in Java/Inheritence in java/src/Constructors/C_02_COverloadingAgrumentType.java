package Constructors;

public class C_02_COverloadingAgrumentType {
    public C_02_COverloadingAgrumentType(int a,int b) {
    	int c=a+b;
    	System.out.println("Summation is:"+c);
    }
    public C_02_COverloadingAgrumentType(double a,double b) {
    	double c=a+b;
    	System.out.println("Summation is"+c);
    }
    public void display() {
    	System.out.println("Constructor overloading is working successfully");
    }
    public static void main(String[]args) {
    	C_02_COverloadingAgrumentType Obj1=new C_02_COverloadingAgrumentType(10 ,20);
    	obj1.display();
    	C_02_COverloadingAgrumrntType Obj2=new C_02_COerloadingAgrumentType(20.55,20.51);
    	obj2.display();
    }
}
