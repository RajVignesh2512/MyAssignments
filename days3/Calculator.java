package week2.days3;

public class Calculator {
	
	public void addTwoNumber(int a, int b) {
		int c=a+b;
		System.out.println(c);
	}
	public void subTwoNumber(int e, int f) {
		int g=e-f;
		System.out.println(g);
	}
	public void mulTwoNumbers(double i,double j) {
		double k=i*j;
		System.out.println(k);
	}
	public void divTwoNumbers(float x,float y) {
		float z=x/y;
		System.out.println(z);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Calculator casio = new Calculator();
    casio.addTwoNumber(25, 50);
    casio.subTwoNumber(40, 10);
    casio.mulTwoNumbers(49, 30);
    casio.divTwoNumbers(55.4f, 40.7f);
    		
	}

}
