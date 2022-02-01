package com.day4;

class Draw
{
	public void draw(int a, int b)
	{
		System.out.println("Drawing line");
	}
	public void draw(int a, int b, int c)
	{
		System.out.println("Drawing circle");
	}
	public void draw(int a, int b, int c, int d)
	{
		System.out.println("Drawing Rectangle");
	}
}

public class MyPolymorphismOverloading 
{
	public static void main(String args[])
	{
		Draw d=new Draw();
		d.draw(0, 0);
		d.draw(1, 1, 1);
		d.draw(2, 2, 2, 2);
	}

}
