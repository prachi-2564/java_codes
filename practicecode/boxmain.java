package practicecode;
class box
{
	private double width;
	private double height;
	private double depth;
	box(box b)
	{
		width = b.width;
		height=b.height;
		depth =b.depth;

	}
	box(double w, double h, double d) 
	{
		width = w;
		height= h;
		depth = d;
	}
	box() 
	{
		width = -1;
		height = -1;
		depth = -1; 
	}
	box(double len) 
	{
		width = height = depth = len;
	}

	double volume() 
	{
		return width * height * depth;
	}


}
class boxweight extends box
{
	double weight; 

	boxweight(boxweight b) 
	{ 
		super(b);
		weight = b.weight;
	}
	boxweight(double w,double h,double d,double m)
	{
		super(w,h,d);
		weight=m;
	}
	boxweight()
	{
		super();
		weight=-1;
	}
	boxweight(double len,double m)
	{
		super(len);
		weight=m;
	}

}
class boxcost extends boxweight
{
	double cost;
	boxcost(boxcost b)
	{
		super(b);
		cost=b.cost
	}
	boxcost(double w,double h,double d,double m,double c)
	{
		super(w,d,h,m);
		cost=c;
	}
	boxcost()
	{
		super();
		cost=-1;
	}
	boxcost(double len,double m,double c)
	{
		super(len,m);
		cost=c;
	}
}

public class boxmain {

	public static void main(String[] args) 
	{
		boxcost b1=new boxcost(10,15,14,25.8,70.8);
		boxcost b2=new boxcost(2,3,4,5.6,8.9);
		double vol;
		vol=b1.volume();
		System.out.println("volume of b1:"+vol);
		System.out.println("weight of b1:"+b1.weight);
		System.out.println("cost of b1:"+b1.cost);
		vol=b2.volume();
		System.out.println("volume of b2:"+vol);
		System.out.println("weight of b2:"+b2.weight);
		System.out.println("cost of b2:"+b2.cost);
		

	}

}
