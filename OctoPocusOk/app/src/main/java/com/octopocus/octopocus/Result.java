package com.octopocus.octopocus;

public class Result
{
	public String Name;
	public double Score;
	public int Index;
	public double Theta;

	public Result(String name, double score, int index)
	{
		this.Name = name;
		this.Score = score;
		this.Index = index;
		Theta = 0;
	}
	
	public Result(String name, double score, int index, double theta)
	{
		this.Name = name;
		this.Score = score;
		this.Index = index;
		this.Theta = theta;
	}	
}