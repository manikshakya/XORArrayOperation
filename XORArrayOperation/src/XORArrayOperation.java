import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


/*
 * Sansa has an array. She wants to find the value obtained by 
 * XOR-ing the contiguous subarrays, followed by XOR-ing the values thus obtained. 
 * Determine this value.
 * 
 * For example, if arr = [3,4,5];
 * 
 * Subarray	Operation		Result
	3		None			3
	4		None			4
	5		None			5
	3,4		3 XOR 4			7
	4,5		4 XOR 5			1
	3,4,5	3 XOR 4 XOR 5	2
	
	result = 3 XOR 4 XOR  5XOR 7 XOR 1 XOR 2 = 6
 * 
 * */

class XORArrayOperation{
	public static void main(String[] args) {
//		int[] a = {12,8,9,11,14};
		
//		int[] a = {1,2,3,4,5,6,7,8,9,23,45,23,12,54,56,32,2,34,342};
		
		int[] a = {3,4,5};
		
		System.out.println(XORNumber(a));
		
		
        
        /*
        	Loop works but throws Timeout error for very large array.
        	Throws: StackOverflow Error.
        
        */
        // int counter = 1;
// 		
// 		List<List<Integer>> list = new ArrayList<>();
// 		
// 		for(int i = 0; i < a.length; i++) {
// 			int j = 0;
// 			while(j < counter) {
// 				int k = j;
// 				List<Integer> temp = new ArrayList<>();
// 				while(k < counter) {
// //					System.out.print(k + " ");
// 					temp.add(a[k]);
// 					k++;
// 				}
// 				list.add(temp);
// //				System.out.println();
// 				j++;
// //				if(j == a.length) break;
// 				
// 			}
// 			counter++;
// 		}
// //		System.out.println(list);
// 		
// 		int re = list.get(0).get(0);
// 		
// 		for(int i = 1; i < list.size(); i++) {
// 			for(int j = 0; j < list.get(i).size(); j++) {
// 				re = list.get(i).get(j) ^ re;
// //				System.out.print((re) + " ");
// 			}
// //			System.out.println();
// 		}
// 		
// 		System.out.println(re);

	}
	
	public static int XORNumber(int[] a) {
		if ((a.length & 1) == 0) {
//            System.out.println(0);
			return 0;
		}
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			if ((i & 1) == 0) {
//            	System.out.print(i + " ");
				sum ^= a[i];
				// System.out.print(i + " ");
			}
//            System.out.print(((i & 1)) + " ");
		}
//        System.out.println("\n" + sum);

		return sum;
	}
}








