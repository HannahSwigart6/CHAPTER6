package Looping;
import java.util.Scanner;
public class studentsScore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner dd = new Scanner(System.in);
		int[] score = new int[1000];
   
      for(int i = 0; i <score.length; ++i )
      {
    	  System.out.println("Enter in your score >>");
    	  score[i] = dd.nextInt();
      }
      
	}

}
