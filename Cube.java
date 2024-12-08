package Project1;

public class Cube implements ThreeDShape {
	double side;
	
	Cube(double side){
		this.side=side;
	}
	@Override
	public void getVolume() {
		double volume =side*side*side;
		System.out.println("Volume of the Cube Shape: "+volume+" unit^3.");
	}
	
	@Override
	public void getLatSurfArea(){
		double ls=4*side*side;
		System.out.println("Lateral surface area of the Cube Shape: "+ls+" sq. units.");
	}
	
	@Override
	public void totalSurfArea() {
		double ts=6*side*side;
		System.out.println("Total surface area of the Cube Shape: "+ts+" sq. units.");
	}
	
	@Override
    public void getDetails() {
    	getVolume();
    	getLatSurfArea();
    	totalSurfArea();
    }

}
