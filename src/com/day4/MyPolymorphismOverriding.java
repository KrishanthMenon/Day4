package com.day4;

class Shape
{
	public void draw()
	{
		System.out.println("Draw Box");
	}
}

class Line extends Shape
{
	public void draw()
	{
		System.out.println("Draw Line");
	}
}

public class MyPolymorphismOverriding 
{
	public static void main(String args[])
	{
		Shape s=new Shape();
		s.draw();
	}

}
