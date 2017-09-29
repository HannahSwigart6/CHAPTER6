package Exercises;
import java.util.Scanner;
import static java.lang.Math.sqrt;
public class Triangles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String Side = null;
		double SideA , SideB,SideC, SquareRoot;
		String ChooseSide;
		System.out.println("What side are you looking for A, B, or C?");
		Side = input.nextLine();
		
			if (Side.equalsIgnoreCase("A"))
			{
				System.out.println("Enter in the side for B.");
				SideB = input.nextInt();
				
				System.out.println("Enter in the side for C.");
				SideC = input.nextInt();
				
				SquareRoot = (int) Math.sqrt((SideB) - Math.sqrt(SideC)); 
				
				System.out.println("Side A is : " +SquareRoot);
			}
//			if (Side == "b" || Side == "B")
//				{System.out.println("Enter in the side for A.");
//			SideA = input.nextInt();
//			
//			System.out.println("Enter in the side for C.");
//			SideC = input.nextInt();
//			
//			SquareRoot = (int) Math.sqrt((SideA) + Math.sqrt(SideC)); 
//			
//			System.out.println("Side B is : " +SquareRoot);
//				}
//			if(Side == "c" || Side == "C")
//			{
//				System.out.println("Enter in the side for A.");
//				SideA = input.nextInt();
//				
//				System.out.println("Enter in the side for B.");
//				SideB = input.nextInt();
//				
//				SquareRoot = (int) Math.sqrt((SideB) + Math.sqrt(SideA)); 
//				
//				System.out.println("Side C is : " +SquareRoot);
//			}
//			
	}
	

}

