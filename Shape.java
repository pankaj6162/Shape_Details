package Project1;

public interface Shape {
	
             public void getDetails() ;
             
             default void rotateShape() {
            	 System.out.println("Shape details:");
             }
             
         
}
