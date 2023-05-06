package week1.day1;

public class car {
	public void opendoor() {
		System.out.println("Open the car door");
	}
    public void turnonAc() {
    	System.out.println("Turn on the AC");
    }
    public void turnonMucic() {
    	System.out.println("Turn on the Audio System");
    }
    public void adjustSeat() {
    	System.out.println("Adjuct the seat position for driver comfortable");
    }
    public void applyBreak() {
    	System.out.println("Apply the break");
    }
    public void applyAcclerate() {
    	System.out.println("Apply the acclerate to move the car");
    }
    public void turnonLight() {
    	System.out.println("Switch on the head light");
    }
    public void sunRoof() {
    	System.out.println("Open the Sunroof");
    }
    public void hazardLight() {
    	System.out.println("Turn on Hazardlight");
    }
    public void adjustMirror() {
    	System.out.println("Adjust the mirror for driving perspective");
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    car subaro = new car();
    subaro.opendoor();
    subaro.turnonAc();
    subaro.turnonLight();
    subaro.adjustSeat();
    subaro.applyBreak();
    subaro.applyAcclerate();
    subaro.turnonLight();
    subaro.sunRoof();
    subaro.hazardLight();
    subaro.adjustMirror();
	}

}
