package Project1;

public class Rectangle implements TwoDShape {
	double l;
	double b;
	
	Rectangle(double l,double b){
		this.l=l;
		this.b=b;
	}
	@Override
	public void getArea() {
		double area=l*b;
		System.out.println("Area of the Rectangle Shape: "+area+" sq. units");
	}
	
	@Override
	public void getPerimeter() {
		double peri=2*(l+b);
		System.out.println("Perimeter of the Rectangle Shape: "+peri+" units");
	}
	
	@Override
    public void getDetails() {
    	getArea();
    	getPerimeter();
    }

}
