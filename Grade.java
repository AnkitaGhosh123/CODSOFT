import java.util.*;
class Student
{
	double total_marks,average_percentage;
	int n,i;
	void grade_calc()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of subjects:");
		n=sc.nextInt();
		double marks[]=new double[n];
		System.out.println("Enter the marks in the "+n+" subjects:");
		for(i=0;i<n;i++)
		{
			marks[i]=sc.nextDouble();	
			if(marks[i]>100)
			{
				System.out.println("You have entered 'out of range' number,total marks/exam is 100");
				System.out.println("Enter correct marks:");
				marks[i]=sc.nextDouble();
				continue;	
			}
		}
		total_marks=0;
		for(i=0;i<n;i++)
		{
			total_marks=total_marks+marks[i];
		}
		System.out.println("his/her gained total marks is:"+total_marks);
		average_percentage=(total_marks/(n*100))*100;
		System.out.println("his/her average percentage is:"+average_percentage+"%");
	}
	void display()
	{
			if(average_percentage>=90 && average_percentage<=100)
				System.out.println("The grade is:O");
			else if(average_percentage>=80 && average_percentage<90)
				System.out.println("The grade is:E");
			else if(average_percentage>=70 && average_percentage<80)
				System.out.println("The grade is:A");
			else if(average_percentage>=60 && average_percentage<70)
				System.out.println("The grade is:B");
			else if(average_percentage>=50 && average_percentage<60)
				System.out.println("The grade is:C");
			else if(average_percentage>=40 && average_percentage<50)
				System.out.println("The grade is:D");
			else if(average_percentage<40)
				System.out.println("The grade is:F,means fail");
	}
}
public class Grade
{
	public static void main(String args[])
	{
		Student st=new Student();
		st.grade_calc();
		st.display();
	}
}