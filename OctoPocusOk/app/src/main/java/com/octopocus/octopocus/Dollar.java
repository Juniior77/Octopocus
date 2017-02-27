package com.octopocus.octopocus;

import java.util.Vector;

public class Dollar implements TouchListener
{
	protected boolean gesture = true; 
	protected Vector points = new Vector(1000);
	
	protected Recognizer recognizer;
	public Result result = new Result("no gesture", 0, -1);
	
	protected boolean active = true;
	
	protected DollarListener listener = null;
	
	protected int gestureSet;
	
	public Dollar(int gestureSet)
	{
		this.gestureSet = gestureSet;
		recognizer = new Recognizer(gestureSet);
	}
	
	public void addPoint(int x, int y)
	{
		if (!active)
			return;
		
		points.addElement(new Point(x, y));
	}	
	
	public void recognize()
	{
		if (!active)
			return;

		if (points.size() == 0) //the recognizer will crash if we try to process an empty set of points...
			return;
		
		result = recognizer.Recognize(points);
		
		if (listener != null)
			listener.dollarDetected(this);
	}
	
	public String getName()
	{		
		return result.Name;
	}
	
	public void pointerPressed(int x, int y)
	{
		clear();
	}
	
	public void pointerReleased(int x, int y)
	{
		recognize();
	}
	
	public void pointerDragged(int x, int y)
	{
		addPoint(x, y);
	}
	
	public void clear()
	{
		points.removeAllElements();
		result.Name = "";
		result.Score = 0;
		result.Index = -1;
	}
	
}