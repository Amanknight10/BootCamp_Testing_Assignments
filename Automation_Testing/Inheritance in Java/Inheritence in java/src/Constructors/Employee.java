package Constructors;

public class Employee {
	private String name;
	private float salary;
	private String ssn;
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public static void main(String[] args) {
		Employee aman=new Employee(143,"aman singh",123455.50f,"5324532");
		System.out.println("Employee ID:\t\t"+aman.getId());
		System.out.println("Employee ID:\t\t"+aman.getName());
		System.out.println("Employee ID:\t\t"+aman.getSalary());
		System.out.println("Employee ID:\t\t"+aman.getSsn());
		aman.amanSalary(150000.00f);
		Syatem.out.println("After updation...");
		System.out.println("")
	}

}
