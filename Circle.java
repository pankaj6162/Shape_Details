package Project1;

public class Circle implements TwoDShape {
	double r;
	
	Circle(double r){
		this.r=r;
	}
	@Override
	public void getArea() {
		double area=Math.PI*r*r;
		System.out.println("Area of the Circle Shape: "+area+" sq. unit");
	}
	
	@Override
	public void getPerimeter() {
		double peri=Math.PI*r*2;
		System.out.println("Perimeter of the Circle Shape! "+peri+" unit");
	}

    @Override
    public void getDetails() {
    	getArea();
    	getPerimeter();
    }
}
