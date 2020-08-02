package test;

public class Examp {
	public  void set()
	{
		System.out.println("set");
		this.get();
		
	}
	public void get()
	{
	System.out.println("get");	
	}
	public static void main(String args[])
	{
	Examp ob=new Examp();
	ob.set();
	}
	}


