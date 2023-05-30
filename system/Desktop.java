package orgs.system;

public class Desktop extends Computer {
	
	public void desktopSize(String size) {
		System.out.println(size);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Desktop asus=new Desktop();
		asus.computerModel(64739);
		asus.desktopSize("15 inch");
		

	}

}
