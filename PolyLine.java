package fr.dauphine.javaavance.td1;



import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

//Exo 4

     public class PolyLine {

    	List <Point>points;
		int i;
		int c; 
		int n; 

	

	public PolyLine() {
		points = new ArrayList<Point>();
	}


//fonction add
	public void add(Point p) {
		Objects.requireNonNull(p, "Point must not be null");
		points.add(p);
		c++;
	}



	public int nbPoints() {
		return points.size();
	}

//fonction contains

	public boolean contains(Point p) {
		for (Point j : points) {
			if (j.getX() == p.getX() && p.getY() == j.getY()) {
				return true;
			}
		}
		return false;
	}}
