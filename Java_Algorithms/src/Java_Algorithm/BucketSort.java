package Java_Algorithm;

import java.util.Collections;
import java.util.Vector;

public class BucketSort {
	static class GFG { 
		  
	    // Function to sort arr[] of size n 
	    // using bucket sort 
	    static void bucketSort(float arr[], int n) 
	    { 
	        if (n <= 0) 
	            return; 
	  
	        // 1) Create n empty buckets 
	        @SuppressWarnings("unchecked") 
	        Vector<Float>[] buckets = new Vector[n]; 
	  
	        for (int i = 0; i < n; i++) { 
	            buckets[i] = new Vector<Float>(); 
	        } 
	  
	        // 2) Put array elements in different buckets 
	        for (int i = 0; i < n; i++) { 
	            float idx = arr[i] * n; 
	            buckets[(int)idx].add(arr[i]); 
	        } 
	  
	        // 3) Sort individual buckets 
	        for (int i = 0; i < n; i++) { 
	            Collections.sort(buckets[i]); 
	        } 
	  
	        // 4) Concatenate all buckets into arr[] 
	        int index = 0; 
	        for (int i = 0; i < n; i++) { 
	            for (int j = 0; j < buckets[i].size(); j++) { 
	                arr[index++] = buckets[i].get(j); 
	            } 
	        } 
	    } 
	  
	    // Driver code 
	    public static void main(String args[]) 
	    { 
	        float arr[] = { (float)0.697, (float)0.365, 
	                        (float)0.856, (float)0.8234, 
	                        (float)0.965, (float)0.2434 }; 
	  
	        int n = arr.length; 
	        bucketSort(arr, n); 
	  
	        System.out.println("Sorted array is "); 
	        for (float el : arr) { 
	            System.out.print(el + " "); 
	        } 
	    } 
	} 
}
