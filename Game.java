package Project1;
import java.util.Scanner;
public class Game {
	Game(){
		System.out.println("==Game has Started!!==");
	}
	
	public Shape selectShape() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Press 1 ==>For 2d Shape");
		System.out.println("Press 2 ==>For 3D Shape");
		int choice=sc.nextInt();
		
		if(choice==1) {
			System.out.println("Press 1 ==>For Circle Shape");
			System.out.println("Press 2 ==>For Rectangle Shape");
			System.out.println("Press 3 ==>For Square Shape");
			System.out.println("Press 4 ==>For Triangle Shape");
			int ch=sc.nextInt();
			if(ch==1) {
				System.out.println("You have Selected Circle");
				System.out.println("Enter the radius of circle:");
				double r=sc.nextDouble()
;				Circle c1=new Circle(r);
			    return c1;
			}
			else if(ch==2) {
				System.out.println("You have Selected Rectangle");
				System.out.println("Enter length of Rectangle");
				double l=sc.nextDouble();
				System.out.println("Enter breadth of Rectangle");
                double b=sc.nextDouble();
				Rectangle r1=new Rectangle(l,b);
			    return r1;
			}
			else if(ch==3) {
				System.out.println("You have Selected Square");
				System.out.println("Enter side of the square");
				double a=sc.nextDouble();
				Square s1=new Square(a);
			return s1;
			}
			else if(ch==4) {
				System.out.println("You have Selected Triangle");
				System.out.println("Enter first side of the Triangle");
				int a=sc.nextInt();
				System.out.println("Enter second side of the Triangle");
				int b=sc.nextInt();
				System.out.println("Enter third side of the Triangle");
				int c=sc.nextInt();
				if(a>=(b+c) || b>=(a+c) || c>=(a+b))
					System.out.println("Triangle not possible");
				Triangle t1=new Triangle(a,b,c);
				return t1;
			
			}
			else {
				System.out.println("Not The Valid Choice");
				return selectShape();
			}
			
		}
		else if(choice==2) {
			System.out.println("Press 1 ==>For Cylinder Shape");
			System.out.println("Press 2 ==>For Cube Shape");
			System.out.println("Press 3 ==>For Sphere Shape");
			int ch=sc.nextInt();
			if(ch==1) {
				System.out.println("You have Selected Cylinder");
				System.out.println("Enter the base radius of the Cylinder:");
				double r=sc.nextDouble();
				System.out.println("Enter the height of the Cylinder:");
				double h=sc.nextDouble();
				Cylinder c1=new Cylinder(r,h);
			    return c1;
			}
			else if(ch==2) {
				System.out.println("You have Selected Cube");
				System.out.println("Enter the side of the cube:");
				double side=sc.nextDouble();
				Cube c2=new Cube(side);
			    return c2;
			}
			else if(ch==3) {
				System.out.println("You have Selected Sphere");
				System.out.println("Enter the radius of Sphere:");
				double r=sc.nextDouble();
				Sphere s1=new Sphere(r);
			return s1;
			}
			else {
				System.out.println("Not The Valid Choice");
				return selectShape();
			}
		}
		else {
			System.out.println("Not The Valid Choice");
		return selectShape();
		}
		
		}
	     

	}
	
	


