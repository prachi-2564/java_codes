package practicecode;

public class grade extends perc
{
    grade(int math,int ss,int sci,int eng,int hindi)
    {
    	super( math, ss, sci, eng, hindi);
    }
    double perc=getperc();
    void getgrade()
    {
    	System.out.println("your percantage: "+perc);
    	if(perc<=100 && perc>=90)
    	{
    		System.out.println("Your grade is A+");
    	}
    	else if(perc<90 && perc>=80)
    	{
    		System.out.println("Your grade is A");
    	}
    	else if(perc<80 && perc>=65)
    	{
    		System.out.println("Your grade is B+");
    	}
    	else if(perc<65 && perc>=50)
    	{
    		System.out.println("Your grade is B");
    	}
    	else if(perc<50 && perc>=35)
    	{
    		System.out.println("Your grade is C");
    	}
    	else
    	{
    		System.out.println("You Fail");
    	}
    }
}
