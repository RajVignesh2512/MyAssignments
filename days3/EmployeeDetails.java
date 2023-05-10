package week2.days3;

public class EmployeeDetails {
	
	public void getEmployeeName(String empName) {
		System.out.println("EmployeeName: "+empName);
	}
	public void getEmployeeId(int empId) {
		System.out.println("EmployeeId:" +empId);
	}
	public void getEmployeeAddress(String empAddress) {
		System.out.println("EmployeeAddress:" +empAddress);
	}
	public void getEmployeeSalary(double empSalary) {
		System.out.println("EmployeeSalary:" +empSalary);
	}
	public void getEmployeeMobileNumber(long mobNum) {
		System.out.println("EmployeeMobileNumber:" +mobNum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    EmployeeDetails IBM =new EmployeeDetails();
    IBM.getEmployeeName("Raj");
    IBM.getEmployeeId(56748);
    IBM.getEmployeeAddress("Cuddalore");
    IBM.getEmployeeSalary(50000);
    IBM.getEmployeeMobileNumber(9486644927l);
	}

}
