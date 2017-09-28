package Looping;
import javax.swing.JOptionPane;
public class RandomLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int guess;
		int result;
		String ResultString;
		String msg;
		int low = 1;
		int high = 100;
		int score = 10;
		result = low +(int)(Math.random() * high);
		do{
			
		ResultString = JOptionPane.showInputDialog(null, "Try to guess my number between" + low + " and" + high);
		guess = Integer.parseInt(ResultString);
		score--;
		if(guess == result)
		{
			msg = "You Win!";
		}
		else 
			if(guess<result)
			{
				msg = "Your Guess was to low";
				
			}
			else
				msg = "Your guess was to high";
	
	JOptionPane.showMessageDialog(null, msg + "Your score was "+score );
	}while(guess != result);
	}

}
