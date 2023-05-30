package MethodOverLoading;

public class Student {
	
	public void getStudentInfo(int Id) {
		System.out.println(Id);
	}
	public void getStudentInfo(int id,String name) {
		System.out.println(id+" "+name);
	}
	public void getStudentInfo(String email,int phoneNo) {
		System.out.println(email+" "+phoneNo);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student std=new Student();
		std.getStudentInfo(2345);
		std.getStudentInfo(67584, "Vignesh");
		std.getStudentInfo("rajvignesh2512@gmail.com", 187345675);

	}

}
