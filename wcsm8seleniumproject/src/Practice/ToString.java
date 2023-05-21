package Practice;


class Vehicle2
{
	String brand1;
	double prize1;



	Vehicle2(String brand,double prize)
	{
		this.brand1 = brand1;
		this.prize1 = prize1;
	}
	@Override
	public String toString()
	{
		return " Vehicle brand1 :"+brand1+",  Vehicle prize1 : "+prize1;
	}

	class Vehicle2Dr
	{
		public static void main(String[]agrs)
		{
			Vehicle2 maruti=new  Vehicle2("maruti",500000);
			Vehicle2 safari=new Vehicle2("safari",100000);
			System.out.println(maruti);
			System.out.println(safari);
		}
	}

}
