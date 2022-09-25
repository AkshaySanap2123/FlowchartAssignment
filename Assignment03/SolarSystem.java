import java.util.Scanner;

class Planet
{
	/*private String name;
	private Double distance;
	private Long rotation;*/
	
	public void planetNames()
	{
		System.out.println("1.Mercury");
		System.out.println("2.Venus");
		System.out.println("3.Earth");
		System.out.println("4.Mars");
		System.out.println("5.Jupiter");
		System.out.println("6.Saturn");
		System.out.println("7.Uranus");
		System.out.println("8.Neptune");
		System.out.println("9.Exit");
		System.out.println("---------------------------------");
	}
	
	public double distance(double ds)
	{
		return ds;
	}
	
	public double radius(double r)
	{
		return r;
	}
	
	public float rotation(float s)
	{	
		return s;
	}
	
	public float density(float m, float v)
	{
		//float m;
		//float v;
		float d=m/v;
		return d;
	}
}

class SolarSystem
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no to Check details of planet");
		System.out.println("---------------------------------");
		int n=sc.nextInt();
		System.out.println("---------------------------------");
			Planet p[]= new Planet[n];
			//p[].density();
			//float d1=p[].density();
			//System.out.println(d1);
			
			for(int i=0;i<p.length;i++)
			{
				p[i]=new Planet();
				p[i].planetNames();
			}
			
			//loop runs until end
			int ch;
			do
			{
				System.out.println("/n *** Welcome Into the Solar World!...***");
				System.out.println("Enter your choice:");
				System.out.println("---------------------------------");
				ch=sc.nextInt();
				
				switch(ch)
				{
					case 1:
					System.out.println("Mercury planet details:");
					for(int i=0;i<p.length;i++)
					{
						//p[i].planetNames();
						double ds1=p[i].distance(10056846.66);
						System.out.println("Distance from Sun: "+ ds1 +" million km");
						double r1=p[i].radius(7645.9);
						System.out.println("Radius: "+ r1 +" km");
						float d1=p[i].density(102,22);
						System.out.println("Density: "+ d1 +" g/cm^3");
						float s=p[i].rotation(87.90f);
						System.out.println("Rotation of Mercury: "+ s +" days");
						System.out.println("---------------------------------");
					}
					break;
					case 2:
					System.out.println("Venus Planet Details:");
					for(int i=0;i<p.length;i++)
					{
						//p[i].planetNames();
						double ds1=p[i].distance(108.25);
						System.out.println("Distance from Sun: "+ ds1 +" million km");
						double r1=p[i].radius(6051.8);
						System.out.println("Radius: "+ r1 +" km");
						float d1=p[i].density(109,18);
						System.out.println("Density: "+ d1 +" g/cm^3");
						float s=p[i].rotation(224.70f);
						System.out.println("Rotation of Venus: "+ s +" days");
						System.out.println("---------------------------------");
					}
					break;
					case 3:
					System.out.println("Earth Planet Details:");
					for(int i=0;i<p.length;i++)
					{
						//p[i].planetNames();
						double ds1=p[i].distance(149.66);
						System.out.println("Distance from Sun: "+ ds1 +" million km");
						double r1=p[i].radius(6371);
						System.out.println("Radius: "+ r1 +" km");
						float d1=p[i].density(100,22);
						System.out.println("Density: "+ d1 +" g/cm^3");
						float s=p[i].rotation(365.25f);
						System.out.println("Rotation of Earth: "+ s +" days");
						System.out.println("---------------------------------");
					}
					break;
					case 4:
					System.out.println("Mars Planet Details:");
					for(int i=0;i<p.length;i++)
					{
						//p[i].planetNames();
						double ds1=p[i].distance(227.98);
						System.out.println("Distance from Sun: "+ ds1 +" million km");
						double r1=p[i].radius(3389.5);
						System.out.println("Radius: "+ r1 +" km");
						float d1=p[i].density(86,22);
						System.out.println("Density: "+ d1 +" g/cm^3");
						float s=p[i].rotation(686.90f);
						System.out.println("Rotation of Mars: "+ s +" days");
						System.out.println("---------------------------------");
					}
					break;
					case 5:
					System.out.println("Jupiter Planet Details:");
					for(int i=0;i<p.length;i++)
					{
						//p[i].planetNames();
						double ds1=p[i].distance(778.50);
						System.out.println("Distance from Sun: "+ ds1 +" million km");
						double r1=p[i].radius(69111);
						System.out.println("Radius: "+ r1 +" km");
						float d1=p[i].density(30,22);
						System.out.println("Density: "+ d1 +" g/cm^3");
						float s=p[i].rotation(4332.80f);
						System.out.println("Rotation of Jupiter: "+ s +" days");
						System.out.println("---------------------------------");
					}
					break;
					case 6:
					System.out.println("Saturn Planet Details:");
					for(int i=0;i<p.length;i++)
					{
						//p[i].planetNames();
						double ds1=p[i].distance(1.434);
						System.out.println("Distance from Sun: "+ ds1 +" billion km");
						double r1=p[i].radius(58232);
						System.out.println("Radius: "+ r1 +" km");
						float d1=p[i].density(139,22);
						System.out.println("Density: "+ d1 +" g/cm^3");
						float s=p[i].rotation(10775.70f);
						System.out.println("Rotation of Saturn: "+ s +" days");
						System.out.println("---------------------------------");
					}
					break;
					case 7:
					System.out.println("Uranus Planet Details:");
					for(int i=0;i<p.length;i++)
					{
						//p[i].planetNames();
						double ds1=p[i].distance(2.871);
						System.out.println("Distance from Sun: "+ ds1 +" billion km");
						double r1=p[i].radius(25362);
						System.out.println("Radius: "+ r1 +" km");
						float d1=p[i].density(25,22);
						System.out.println("Density: "+ d1 +" m/s^2");
						float s=p[i].rotation(30687.10f);
						System.out.println("Rotation of Uranus: "+ s +" days");
						System.out.println("---------------------------------");
					}
					break;
					case 8:
					System.out.println("Neptune Planet Details:");
					for(int i=0;i<p.length;i++)
					{
						//p[i].planetNames();
						double ds1=p[i].distance(4.495);
						System.out.println("Distance from Sun: "+ ds1 +" billion km");
						double r1=p[i].radius(24622);
						System.out.println("Radius: "+ r1 +" km");
						float d1=p[i].density(63,22);
						System.out.println("Density: "+ d1 +" m/s^2");
						float s=p[i].rotation(60190.2f);
						System.out.println("Rotation of Neptune: "+ s +" days");
						System.out.println("---------------------------------");
					}
					break;
					case 9:
					System.out.println("Thank you for site visits");
					break;
				}
			}
			while(ch != 9);
	}
}
	