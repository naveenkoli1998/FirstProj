package main.com;

import java.util.Scanner;

/**
 * @author Naveen Koli 05-Jan-2023
 *
 */
public class Main_Controller {
	
	public static void main(String[] args) {
		Main_Controller obj = new Main_Controller();
		Scanner sc = new Scanner(System.in);
		int answerNumber = (int)(Math.random()*100)+1;
		System.out.println("Welcome to Guess Game !!!!!");
		System.out.println("Computer Allready Choose No. b/w 1 to 100. \nSo Now to Enter that Number?");
		int number;
		int i = 0;
		boolean flag =  false;
		boolean firstBool = true;
		do {
			number = sc.nextInt();
			i++;
			if(number==answerNumber) {
				System.out.println("Hurray!!!!!!!! Yo Won the Game");
				flag = true;
			}else if(i==10) {
				System.out.println("Sorry You Lose the Game \nThe Number is "+answerNumber);
				flag = true;
			}else if(number!=answerNumber) {
				System.out.print("Wrong Answer !!!! ReEnter Please  ");
				if(firstBool) {
					if(answerNumber<=50) {
						System.out.println("Hint <50");
					}else if(answerNumber>50) {
						System.out.println("Hint > 50");
					}
					firstBool = false;
				}
			}
		}while(!flag);
		
	}

}
