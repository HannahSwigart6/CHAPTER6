import java.util.Scanner;

public class AverageOfQuizzes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] scores = new int [10];
		
		int score = 0;
		int count = 0;
		int total = 0;
		
		int quit = 999;
		int max = 10;
		
		Scanner input = new Scanner(System.in);
		System.out.println("enter quiz score or " + quit + " to quit");
		
		score = input.nextInt();
		
		while(score != quit)
		{
			scores[count] = score;
			
			total += scores[count];
			++count;
			
			if(count == max)
				score = quit;
			else
				System.out.println("Enter next quix score or " +quit+ " to quit >>");
			score = input.nextInt();
			
		}		
		System.out.print("The score entered were: ");
		for (int x = 0; x <count; ++x)
			System.out.println(scores[x] + " ");
		if(count != 0)
			System.out.println("\n The Average is " + (total * 1)/count);
		else 
			System.out.println("No scores entered ");
	}

}
