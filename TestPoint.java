package fr.dauphine.javaavance.td1;

import java.util.ArrayList;

/*
 * Exercise 2 et 3  
 */

public class TestPoint {
	public static void main(String[] args) {

	}

	//Exo 5
	public static boolean contains(Point p, Circle[] circles) {
		for (int i = 0; i < circles.length; i++) {
			if (circles[0].contains(p)) {
				return true;
			}
		}
		return false;
	}

	// Exo 6
	public static boolean contains(Point p, Ring[] rings) {
		for (int i = 0; i < rings.length; i++) {
			if (rings[0].contains(p)) {
				return true;
			}
		}
		return false;
	}
}
