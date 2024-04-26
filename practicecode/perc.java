package practicecode;

public class perc extends result
{	
		perc(int math,int ss,int sci,int eng,int hindi)
		{
			super( math, ss,sci, eng, hindi);
		}
			int total=get_totalmarks();
			float perc;
			double getperc()
			{
				System.out.println("total marks= "+total);
				this.perc=(total*100)/500;
				return perc;
		    }
	}


