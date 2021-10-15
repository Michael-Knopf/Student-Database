package algorithms;

public class Search {
	
	public static int linearSearch(int[] dataSet, int target) {
		//iterate through dataSet searching for target
		for (int i=0;i<dataSet.length;i++) {
			if(dataSet[i] == target) {
				return i;
			}
		} return -1;
	}
	
	
	public static int binarySearch(int[] dataSet, int target, int start, int end) {
		//binary search assumes sorted array therefore continually split search domain in half
		int midPoint = (int) Math.floor((start+end)/2);
		int value = dataSet[midPoint];
		
		if(value>target) {
			return binarySearch(dataSet, target, start, midPoint-1);
		} else if (value<target) {
			return binarySearch(dataSet, target, midPoint+1, end);
		} return midPoint;
	}
}
