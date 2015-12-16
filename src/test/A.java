package test;

import java.util.*;

public class A {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		ArrayList list = new ArrayList();
//		System.out.println(list.isEmpty());

		String[] arr = new String[] { "wzbjzl", "wzbjzl", "wzbjzl", "wzbtds", "wzbtds", "wzjianghl", "wzjianghl", "wzjianghl"};
	    Set<String> set = new TreeSet<String>();

	    for (int i=0;i<arr.length;i++) {
	        set.add(arr[i]);
	    }

//	    String[] des = new String[set.size()];
//	    int j = 0;
//	    for (String i : set) {
//	        des[j++] = i;
//	    }
	    String[] array2 = set.toArray(new String[set.size()]);
	    System.out.println(Arrays.toString(array2));

	}

}
