package package3;

import java.util.Scanner;

public class Area {

	public static void main(String args[]) {
		
		Scanner obj1 = new Scanner(System.in);
		System.out.println("select option");
		System.out.println("a.area of circle");
		System.out.println("b.area of rectangle");
		System.out.println("c.area of square");
		String x = obj1.next();
		if (x.equals("a")) {
			Area obj = new Area();
			obj.areac();
		} else if (x.equals("b")) {
			Area obj = new Area();
			obj.arear();
		} else if (x.equals("c")) {
			Area obj = new Area();
			obj.areas();
		} else {
			System.out.println("error");
		}
	}

	public void areac() {
		int r = 2;
		double acircle = 3.14 * r * r;
		System.out.println("area of circle=" + acircle);
	}

	public void arear() {
		int l = 3;
		int w = 5;
		int arectangle = l * w;
		System.out.println("area of rectangle=" + arectangle);
	}

	public void areas() {
		int side = 3;
		int asquare = side * side;
		System.out.println("area of square=" + asquare);
	}

}
