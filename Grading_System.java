import java.util.*;
public class Grading_System
{
	public static void main(String[] args)
	{
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the number of subjects : ");
	    int subjects = sc.nextInt();
	    int score[] = new int[subjects];
	    int total = 0;
	    for(int i=0;i<subjects;i++)
	    {
	        System.out.println("Enter Subject "+(i+1)+" mark : ");
	        score[i]=sc.nextInt();
	        total = total + score[i];
	    }
	    System.out.println("Your total mark is "+total);
	    double avg = total / subjects;
	    System.out.println("Your average score is "+avg);
	    String grade = "";
	    if(avg >= 97 && avg<=100)
	    {
	        grade="A+";
	    }
	    else if(avg >= 93 && avg<=96)
	    {
	        grade="A";
	    }
	    else if(avg >= 90 && avg<=92)
	    {
	        grade="A-";
	    }
	    else if(avg >= 87 && avg<=89)
	    {
	        grade="B+";
	    }
	    else if(avg >= 83 && avg<=86)
	    {
	        grade="B";
	    }
	    else if(avg >= 80 && avg<=82)
	    {
	        grade="B-";
	    }
	    else if(avg >= 77 && avg<=79)
	    {
	        grade="C+";
	    }
	    else if(avg >= 73 && avg<=76)
	    {
	        grade="C";
	    }
	    else if(avg >= 70 && avg<=72)
	    {
	        grade="C-";
	    }
	    else if(avg >= 67 && avg<=69)
	    {
	        grade="D+";
	    }
	    else if(avg >= 63 && avg<=66)
	    {
	        grade="D-";
	    }
	    else if(avg >= 60 && avg<=62)
	    {
	        grade="E";
	    }
	    else
	    {
	        grade = "F";
	    }
	    System.out.println("Your grade is "+grade);
	}
}