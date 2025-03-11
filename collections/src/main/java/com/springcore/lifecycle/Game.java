package com.springcore.lifecycle;

public class Game {
  private double prize;

  public double getPrize() {
		return prize;
	}

	public void setPrize(double prize) {
		System.out.println("Setting prize");
		this.prize = prize;
	}
	

public Game() {
	super();
	
}

@Override
public String toString() {
	return "Game [prize=" + prize + "]";
}

public void init()
{
	System.out.println("Inside init method");
}
public void  destroy()
{
	System.out.println("Inside destroy method");
}
}
