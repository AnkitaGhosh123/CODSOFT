import java.io.*;
class Registration
{
	public static void main(String args[])throws IOException
	{
	int n,m,i,j,c=0;
	boolean wish;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of courses available in our platform:");
		n=Integer.parseInt(br.readLine());
		String str[]=new String[n];
		int code[]=new int[n];
		String start_time[]=new String[n];
		String end_time[]=new String[n];
		int duration[]=new int[n];
		String des[]=new String[n];
		int min_age[]=new int[n];
		int max_age[]=new int[n];
		for(i=0;i<n;i++)
		{
			System.out.println("Enter "+ i+"th course name:");
			str[i]=br.readLine();	
			System.out.println("Enter "+ i+"th course code:");
			code[i]=Integer.parseInt(br.readLine());
			System.out.println("Enter description of "+i+"th course here:");
			des[i]=br.readLine();
			System.out.println("Enter starting time of "+i+"th course:");
			start_time[i]=br.readLine();
			System.out.println("Enter end time of "+i+"th course:");
			end_time[i]=br.readLine();	
			System.out.println("Enter duration of "+i+"th course:");
			duration[i]=Integer.parseInt(br.readLine());	
			System.out.println("Enter eligibility of "+i+"th course here:");
			System.out.println("Age must be in between:");
			min_age[i]=Integer.parseInt(br.readLine());
			max_age[i]=Integer.parseInt(br.readLine());
		}
		System.out.println("total available courses");
		System.out.println("Total number of courses:"+n);
		System.out.println("course details are:");
		for(i=0;i<n;i++)
		{	
			System.out.println(i+" th course details");
			System.out.println("course name:"+str[i]);
			System.out.println("course code:"+code[i]);
			System.out.println("course description is:"+des[i]);
			System.out.println("course schedule is:starts from "+start_time[i]+" to "+end_time[i]+" and duration is of "+duration[i]+" weeks");
			System.out.println("Who can apply the "+i+" th course:");
			System.out.println("Students aged in between "+min_age[i]+"-"+max_age[i]+" can apply for the course");
		}
		System.out.println("Enter the number of students:");
		m=Integer.parseInt(br.readLine());
		String name[]=new String[m];
		int std_id[]=new int[m];
		int count;
		int age[]=new int[m];
		for(j=0;j<m;j++)
		{
			System.out.println("Enter "+j+" th student name");
			name[j]=br.readLine();
			System.out.println("Enter "+j+" th student's id:");
			std_id[j]=Integer.parseInt(br.readLine());
			System.out.println("How many courses you want to apply?");
			count=Integer.parseInt(br.readLine());
			if(count>n){
				System.out.println("You are desiring to apply for courses more than provided by our platform,SORRY!");
				continue;}
			else
			{
				c=0;
				for(i=0;i<n;i++){
				System.out.println("Are you interested for '"+str[i]+"' course?");
				System.out.println("Enter 'true' for registering the '"+str[i]+"' course and 'false' for not registering the course");
				wish=Boolean.parseBoolean(br.readLine());
				if(wish==true)
				{
					c++;
					if(c<=count)
					{	
						System.out.println("What is your age?");
						age[j]=Integer.parseInt(br.readLine());
						if(age[j]<min_age[i] || age[j]>max_age[i])
						{
							System.out.println("Sorry!You are not eligible for registering the '"+str[i]+"' course");
							continue;
						}
						else
							System.out.println("Successfully registered for the '"+str[i]+"' course");
					}
					else
						System.out.println("The number of your desired courses is over");
				}
			}
		}
	}
}
}

		
	

