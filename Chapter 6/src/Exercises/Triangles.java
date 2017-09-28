package Exercises;
import java.util.Scanner;
import static java.lang.Math.sqrt;
public class Triangles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int a=0, b=0, c=0;
		int side, sideA, sideB, sideC, SquareRoot;
		
		System.out.println("What side are you looking for A, B, or C?");
		side = input.nextInt();
		
		
		do
		{
			if (side = "A")
			{
				System.out.println("Enter in the side for B.");
				sideB = input.nextInt();
				
				System.out.println("Enter in the side for C.");
				sideC = input.nextInt();
				
				SquareRoot = (int) Math.sqrt((sideB) + Math.sqrt(sideC)); 
				
				System.out.println("Side A is : " +SquareRoot);
			}
			if (side = "B")
				{System.out.println("Enter in the side for A.");
			sideB = input.nextInt();
			
			System.out.println("Enter in the side for C.");
			sideC = input.nextInt();
			
			SquareRoot = (int) Math.sqrt((sideA) + Math.sqrt(sideC)); 
			
			System.out.println("Side B is : " +SquareRoot);
				}
			if(side = "C")
			{
				System.out.println("Enter in the side for A.");
				sideB = input.nextInt();
				
				System.out.println("Enter in the side for B.");
				sideC = input.nextInt();
				
				SquareRoot = (int) Math.sqrt((sideB) + Math.sqrt(sideA)); 
				
				System.out.println("Side C is : " +SquareRoot);
			}
			
	}
	

}
}
