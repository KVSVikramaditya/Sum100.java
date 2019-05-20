package practice_logic;
import java.io.*;
import java.util.Scanner;
public class SumtoHundered{
	static Scanner sc=new Scanner(System.in);
   static int count=0,cvalue,pvalue,cheat,score,ComputerScore,PersonScore;
	
	
	 void StartMethodComputer() {
			System.out.println("Ok this time its my turn to start");
			cvalue=(int)((Math.random())*(10));
			if(cvalue==0) {
				cvalue++;
			}
			count=count+cvalue;
			System.out.println("I added value "+cvalue+" total is "+count);		
			ContinueMethodComputer();
	 }	
	 void StartMethodPerson() {
		 System.out.println("Ok this time its your turn to start");
			System.out.println("Enter a number");
			pvalue=sc.nextInt();
			while(pvalue>9||pvalue==0) {
				System.out.println("Enter the number between 1 to 9 ");
				pvalue=sc.nextInt();
			}
			count=count+pvalue;
			System.out.println("You added value "+pvalue+" total is"+count);
			ContinueMethodPerson();
	 }
	 void ContinueMethodPerson() {
		 while(true) {
		 if(count>61) {
				cheat=10-((count)%10);
				if(cheat==10) {
					cheat-=1;
				}
				cvalue=cheat;
				count=count+cvalue;	
			}
			else {
			cvalue=(int)((Math.random())*(10));
			if(cvalue==0) {
				cvalue++;
			}
			count=count+cvalue;
			}
			System.out.println("I added value "+cvalue+" total is "+count);
			if(count==100) {
				System.out.println("I won");
				score=0;
				Score(score);	
				break;
			}
			System.out.println("Enter a number");
			pvalue=sc.nextInt();
			
			while(pvalue>9||pvalue==0) {
				System.out.println("Enter the number between 1 to 9 ");
				pvalue=sc.nextInt();
			}
			count=count+pvalue;
			if(count>100) {
			System.out.println("Sorry You exceeded the limit,try to learn Maths");
			break;
			}
			System.out.println("You added value "+pvalue+" total is"+count);
			if(count==100) {
				System.out.println("You won ");
				score=1;
				Score(score);
				break;
			}
		 }
	 } 
	 void ContinueMethodComputer() {
		 while(count<100) {
			 
		 System.out.println("Enter a number");
			pvalue=sc.nextInt();
			while(pvalue>9||pvalue==0) {
				System.out.println("Enter the number between 1 to 9 ");
				pvalue=sc.nextInt();
			}
			count=count+pvalue;
			if(count>100) {
				System.out.println("Sorry You exceeded the target,try to learn Maths");
				System.out.println("Total is "+count);
				break;
			}
			System.out.println("You added value "+pvalue+" total is"+count);
			if(count==100) {
				System.out.println("You won ");
				score=1;
				Score(score);
				break;
			}
			if(count>61) {
				cheat=10-((count)%10);
				if(cheat==10) {
					cheat-=1;
				}
				cvalue=cheat;
				count=count+cvalue;
			}
			else {
			cvalue=(int)((Math.random())*(10));
			if(cvalue==0) {
				cvalue++;
			}
			count=count+cvalue;
			}
			System.out.println("I added value "+cvalue+" total is "+count);
			if(count==100) {
				System.out.println("I won");
				score=0;
				Score(score);
				break;
			}
		 }
		 
	 }
	 void Score(int score) {
		 if(score==0) {
				ComputerScore++;
			}
			else if(score==1) {
				PersonScore++;
			}
			System.out.println(
					"ComputerScore        PlayerScore"+"\n"      
					+ ComputerScore+"                  "+PersonScore);
		}
		 
	 
	 void Method() {
		 int x=(int)((Math.random())*(10));
		if(x<5) {
			StartMethodComputer();
		}	
		else {
			StartMethodPerson() ;
		}	
		}

	public static void main(String[] args) {
		SumtoHundered h=new SumtoHundered();
		h.Method();
		System.out.println("Do you want to play again? y/n");
		Scanner sc=new Scanner(System.in);
		String str;
		str=sc.nextLine();
		while(str.equals("y")) {
			count=0;
			h.Method();
			str="no";
			System.out.println("Do you want to play again? y/n");
			str=sc.nextLine();
		}
	
	}
}


