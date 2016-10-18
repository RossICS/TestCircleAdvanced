/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testcircle;

 /**
 * The Circle class is tested.
 */
 public class TestCircle {

	public static void main(String[] args) {
		Circle spot = new Circle(5);
                Circle spot1 = new Circle(4);
		Circle spot2 = new Circle(4);
                
		System.out.println("Circle radius: " + spot.getRadius());
		System.out.println("Circle area: " + spot.area());
                System.out.println("Circle circumference: " + spot.circumference());
                System.out.println("Circle radius: " + spot1.getRadius());
		System.out.println("Circle area: " + spot2.area());
		Circle.displayAreaFormula();
                
		
		
		if (spot1.equals(spot2)) {
			System.out.println("Objects are equal.");
		} else {
			System.out.println("Objects are not equal.");
		}
		if (spot1.compareTo(spot2) == 0) {
			System.out.println("Objects are equal.");
		} else if (spot1.compareTo(spot2) < 0) {
			System.out.println("spot1 is smaller than spot2.");
		} else {
			System.out.println("spot1 is larger than spot2.");
		}
		System.out.println(spot1);
		System.out.println(spot2);
	}
}