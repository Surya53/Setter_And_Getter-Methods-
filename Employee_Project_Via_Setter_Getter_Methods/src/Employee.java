
public class Employee {
   
	private int eno;
	private String ename;
	private float esal;
	private String dept;
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public float getEsal() {
		return esal;
	}
	public void setEsal(float esal) {
		this.esal = esal;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public void display()
	{
		System.out.println("Employee Details");
		System.out.println("------------------");
		System.out.println("Employee number     :"+eno);
		System.out.println("Employee Name       :"+ename);
		System.out.println("Employee Salary     :"+esal);
		System.out.println("Employee depatment  :"+dept);
	}
	
}
