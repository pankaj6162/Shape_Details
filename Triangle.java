package Project1;

public class Triangle implements TwoDShape {
	int a;
	int b;
	int c;
	Triangle(int a,int b,int c){
		this.a=a;
		this.b=b;
		this.c=c;
	}
	@Override
	public void getArea() {
		double s=(a+b+c)/2.0;
		double area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println("Area of the Triangle Shape: "+area+" sq. units");
	}
	
	@Override
	public void getPerimeter() {
		double peri=a+b+c;
		System.out.println("Perimeter of the Triangle Shape: " + peri+" unit");
	}
	
	public void getDetails() {
    	getArea();
    	getPerimeter();
    }

}
