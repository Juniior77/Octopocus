package com.octopocus.octopocus;

import java.util.*;

public class Template
{
	String mName;
	Vector mPoints;

	Template(String name, Vector points) 
	{
		this.mName = name;

		this.mPoints = Utils.Resample(points, Recognizer.NumPoints);
		this.mPoints = Utils.ScaleToSquare(this.mPoints, Recognizer.SquareSize);
		this.mPoints = Utils.TranslateToOrigin(this.mPoints);
	}

	public void setPoints(Vector newPoints) {
		this.mPoints = Utils.Resample(newPoints, Recognizer.NumPoints);
		this.mPoints = Utils.ScaleToSquare(this.mPoints, Recognizer.SquareSize);
		this.mPoints = Utils.TranslateToOrigin(this.mPoints);
	}




}