package org.xianay.architecture;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class LruTest {
	
	
	public static Integer[] toIntArray(String[] strings){
		Integer[] arr = new Integer[strings.length];
		for (int i=0;i<arr.length;i++) {
			arr[i] = Integer.parseInt(strings[i]);
		}
		return arr;
	}
	
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入[页地址流]：");
		String str = scanner.next();
		//2,3,2,1,5,2,4,5,3,2,5,2
		List<Integer> pages = Arrays.asList(toIntArray(str.split(",")));
		System.out.println("请输入分配的[页数]：");
		int p = scanner.nextInt();
		Stack<Integer> stack = new Stack<>();
		for (Integer i : pages) {
			boolean hit = false;
			if(stack.contains(i)){
				stack.remove(stack.indexOf(i));
				hit = true;
			}
			stack.push(i);
			Collections.reverse(stack);
			System.out.print(stack + " - " + (hit ? "命中":"") + "\n");
			Collections.reverse(stack);
		}
		
	}
	
}
