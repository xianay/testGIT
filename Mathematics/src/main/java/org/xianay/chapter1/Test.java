package org.xianay.chapter1;

import org.xianay.geometry.Point;
import org.xianay.geometry.utils.Utils;

public class Test {
	public static void main(String[] args) {
		
		
		
		
	}
	
	@org.junit.Test
	public void test1(){
		Point p1 = new Point(1, 2, 3);
		Point p2 = new Point(2, -1, 4);
		
		double distance = Utils.distance(p1, p2);
		
		System.out.println(distance*distance);
	}
	
	
	
	
}
