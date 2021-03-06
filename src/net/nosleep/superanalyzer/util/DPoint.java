/****************************************************************************
 The Super Analyzer
 Copyright (C) 2009 Tom Bulatewicz, Nosleep Software

 This program is free software; you can redistribute it and/or
 modify it under the terms of the GNU General Public License
 as published by the Free Software Foundation; either version 2
 of the License, or (at your option) any later version.

 This program is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU General Public License for more details.

 You should have received a copy of the GNU General Public License
 along with this program; if not, write to the Free Software
 Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 ***************************************************************************/

package net.nosleep.superanalyzer.util;

import java.awt.*;

/**
 * A simple class that stores a pair of double values (just like Java's Point
 * class, but with doubles.
 */
public class DPoint
{
	public double x;
	public double y;
	public Color color;
	public String name; // used for album name
	public String secondName; //used for genre

	public DPoint(double x, double y, String name)
	{
		this.x = x;
		this.y = y;
		this.color = null;
		this.name = name;
	}

	public DPoint(double x, double y, Color color, String name)
	{
		this.x = x;
		this.y = y;
		this.color = color;
		this.name = name;
	}
	
	public DPoint(double x, double y, String name, String secondName)
	{
		this.x = x;
		this.y = y;
		this.color = null;
		this.name = name;
		this.secondName = secondName;
	}

	public DPoint(double x, double y, Color color, String name, String secondName)
	{
		this.x = x;
		this.y = y;
		this.color = color;
		this.name = name;
		this.secondName = secondName;
	}

}
