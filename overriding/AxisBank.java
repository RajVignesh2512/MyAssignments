package overriding;

public class AxisBank extends BankInfo {
	
	public void deposit() {
		System.out.println("Money has been deposite");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AxisBank Acc=new AxisBank();
		Acc.saving();
		Acc.fixed();
		Acc.deposit();
		

	}

}
