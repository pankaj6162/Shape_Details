package Project1;

public class Cylinder implements ThreeDShape {
	double r;
	double h;
	Cylinder(double r, double h){
		this.r=r;
		this.h=h;
	}
	
	@Override
	public void getVolume() {
		double volume=4.0/3*Math.PI*r*r*r;
		System.out.println("Volume of the Cylinder Shape: "+volume+" unit^3");
	}
	
	@Override
	public void getLatSurfArea(){
		double ls=2*Math.PI*r*h;
		System.out.println("Lateral surface area of the Cylinder Shape: "+ls+" sq. units");
	}
	
	@Override
	public void totalSurfArea() {
		double ts=2*Math.PI*r*(r+h);
		System.out.println("Total surface area of the Cylinder Shape:"+ts+" sq. units");
	}
	
	@Override
    public void getDetails() {
    	getVolume();
    	getLatSurfArea();
    	totalSurfArea();
    }

}
