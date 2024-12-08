package Project1;
import java.util.Scanner;
public class Square implements TwoDShape {
	Scanner sc=new Scanner(System.in);
	double a;
//	{
//		System.out.print("Enter side of the Square:");
//		 n=sc.nextInt();
//	}
	
	Square(double a ){
		this.a=a;
	}
	
	@Override
	public void getArea() {
		double area=a*a;
		System.out.println("Area of the Square Shape:"+area+" sq.units");
	}
	
	@Override
	public void getPerimeter() {
		System.out.println("Perimeter of the Square Shape:"+a*4+" unit");
	}
	
	@Override
    public void getDetails() {
    	getArea();
    	getPerimeter();
    }


}
