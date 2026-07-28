package Constructors;

public class Website {
    String webName;
    int webAge;
    Website(String name,int age){
    	this.webName=name;
    	this.webAge=age;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        website obj1=new website("aman",18);
        website obj2=new website("https://www.google.com/",18);
        System.out.println(obj1.webName+" "+obj1)
	}

}
