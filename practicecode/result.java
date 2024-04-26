package practicecode;

public class result
{
	int math,ss,sci,eng,hindi,total;
	result(int math,int ss,int sci,int eng,int hindi)
	{
		this.math=math;
		this.ss=ss;
		this.sci=sci;
		this.hindi=hindi;
		this.eng=eng;
	}
	int get_totalmarks()
	{
		System.out.println("maths marks:"+math);
		System.out.println("social studies marks:"+ss);
		System.out.println("science marks:"+sci);
		System.out.println("english marks:"+eng);
		System.out.println("hindi marks:"+hindi);
		this.total=ss+sci+eng+math+hindi;
		return total;
	}
}

