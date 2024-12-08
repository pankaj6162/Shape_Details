package Project1;

public class Sphere implements ThreeDShape {
	double r;
	
	Sphere(double r){
		this.r=r;
	}
	@Override
	public void getVolume() {
		double volume=(4.0/3)*Math.PI*r*r*r;
		System.out.println("Volume of the Sphere Shape: "+volume+" unit^3");
	}
	
	@Override
	public void getLatSurfArea(){
		double ls=4*Math.PI*r*r;
		System.out.println("Lateral surface area of the Sphere Shape: "+ls+" sq. units");
	}
	
	@Override
	public void totalSurfArea() {
		double ts=4*Math.PI*r*r;
		System.out.println("Total surface area of the Sphere Shape: "+ts+" sq. units");
		System.out.println("Total surface area and lateral surface area of the Sphere are same");
	}
	
	@Override
    public void getDetails() {
    	getVolume();
    	getLatSurfArea();
    	totalSurfArea();
    }

}
