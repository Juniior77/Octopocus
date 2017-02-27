package com.octopocus.octopocus;

import java.util.*;

public class Recognizer
{
	//
	// Recognizer class constants
	//
	int NumTemplates = 16;
	public static int NumPoints = 64;
	public static double SquareSize = 250.0;
	double HalfDiagonal = 0.5 * Math.sqrt(250.0 * 250.0 + 250.0 * 250.0);
	double AngleRange = 45.0;
	double AnglePrecision = 2.0;
	public static double Phi = 0.5 * (-1.0 + Math.sqrt(5.0)); // Golden Ratio
	
	public Point centroid = new Point(0, 0);
	public Rectangle boundingBox = new Rectangle(0, 0, 0, 0);
	int bounds[] = { 0, 0, 0, 0 };
	
	Vector Templates = new Vector(NumTemplates);

	public static final int GESTURES_DEFAULT = 1;
	public static final int GESTURES_SIMPLE = 2;
	public static final int GESTURES_CIRCLES = 3;	
	
	public Recognizer()
	{
		this(GESTURES_SIMPLE);
	}

	public Recognizer(int gestureSet)
	{
		switch(gestureSet)
		{
			case GESTURES_DEFAULT:
				loadTemplatesDefault(); break;

			case GESTURES_SIMPLE:
				loadTemplatesSimple();	break;

			case GESTURES_CIRCLES:
				loadTemplatesCircles();	break;
		}
	}
	
	void loadTemplatesDefault()
	{
		Templates.addElement(loadTemplate("Athens", TemplateData.athens));
		Templates.addElement(loadTemplate("Berlin", TemplateData.berlin));
		Templates.addElement(loadTemplate("Brussels", TemplateData.brussels));
		Templates.addElement(loadTemplate("Dublin", TemplateData.dublin));
		Templates.addElement(loadTemplate("London", TemplateData.london));
		Templates.addElement(loadTemplate("Miami", TemplateData.miami));
		Templates.addElement(loadTemplate("Moscow", TemplateData.moscow));
		Templates.addElement(loadTemplate("Oslo", TemplateData.oslo));
		Templates.addElement(loadTemplate("Paris", TemplateData.paris));
		Templates.addElement(loadTemplate("Rio", TemplateData.rio));
		Templates.addElement(loadTemplate("Rome", TemplateData.rome));
		Templates.addElement(loadTemplate("Sofia", TemplateData.sofia));
		Templates.addElement(loadTemplate("Sydney", TemplateData.sydney));
		Templates.addElement(loadTemplate("Tokyo", TemplateData.tokyo));
		Templates.addElement(loadTemplate("Toronto", TemplateData.toronto));
		Templates.addElement(loadTemplate("Vienna", TemplateData.vienna));
		//Utiliser pour reconnaitre le geste, le string précisé correspond au label suivi du label Object (Score)
	}
	
	void loadTemplatesSimple()
	{
	}
	
	public void loadTemplatesCircles()
	{
	}

	void loadTemplatesPhoto()
	{
	}
	
	
	Template loadTemplate(String name, int[] array)
	{
		return new Template(name, loadArray(array));
	}
	
	Vector loadArray(int[] array)
	{
		Vector v = new Vector(array.length/2);
		for (int i = 0; i < array.length; i+= 2)
		{
			Point p = new Point(array[i], array[i+1]);
			v.addElement(p);
		}

	
		return v;
	}
	
	public Result Recognize(Vector points)
	{
		points = Utils.Resample(points, NumPoints);
		points = Utils.ScaleToSquare(points, SquareSize);
		points = Utils.TranslateToOrigin(points);
	
		bounds[0] = (int)boundingBox.X;
		bounds[1] = (int)boundingBox.Y;
		bounds[2] = (int)boundingBox.X + (int)boundingBox.Width;
		bounds[3] = (int)boundingBox.Y + (int)boundingBox.Height;
		
		int t = 0;
		
		double b = Double.MAX_VALUE;
		for (int i = 0; i < Templates.size(); i++)
		{
			double d = Utils.DistanceAtBestAngle(points, (Template)Templates.elementAt(i), -AngleRange, AngleRange, AnglePrecision);
			if (d < b)
			{
				b = d;
				t = i;
			}
		}
		double score = 1.0 - (b / HalfDiagonal);
		return new Result(((Template)Templates.elementAt(t)).mName, score, t, Utils.lastTheta);
	};
}