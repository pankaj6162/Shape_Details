package Project1;
import java.util.Scanner;
public class Driver1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String choice;
		do {
		Game g1=new Game();
		Shape s1=g1.selectShape();
		s1.getDetails();
		System.out.println("Press Y/y ==>For Restart Game");
        choice=sc.next();
		} while(choice.equals("Y") || choice.equals("y"));
		
		
	}

}
