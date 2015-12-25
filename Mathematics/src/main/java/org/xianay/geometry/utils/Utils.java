package org.xianay.geometry.utils;


import org.xianay.geometry.Point;

/**
 * 
 * @author xianay
 *
 */
public class Utils {
	
	/**
	 * 两点之间的距离
	 * @param p1
	 * @param p2
	 * @return
	 */
	public static double distance(Point p1,Point p2){
	
		float a = p1.getX() - p2.getX();
		float b = p1.getY() - p2.getY();
		float c = p1.getZ() - p2.getZ();

		
		
		
		return Math.sqrt(a*a + b*b + c*c);
	}
	
	
}
