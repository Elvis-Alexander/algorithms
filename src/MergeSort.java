import java.util.*;
import static java.lang.System.out;

public class MergeSort {
	
	public static void main(String[] args) {
		int[] list = {4,6,32,67,32,7545,876,21,2,67};
		out.println("Initial array" + Arrays.toString(list));
		mergeSort(list);
		out.println("Sorted array" + Arrays.toString(list));
	}
	
	public static void mergeSort(int[] list) {
		// 1 item array is already sorted
		if(list.length <= 1) {
			return;
		}
		int[] left = leftArray(list);
		int[] right = rightArray(list);
		mergeSort(left);
		mergeSort(right);			
		merge(list, left, right);
	}
	
	public static void merge(int[] list, int[] leftList, int[] rightList) {
		/* index for left and right arrays */
		int leftPointer  = 0;
		int rightPointer = 0;
		/* index for final array [0,1,2,...N] */
		int index = 0;
		
		/* index for left and right arrays less than N */
		while(leftPointer + rightPointer < list.length) {			
			// if there still exists values in left list and rightList has been taken care of or leftValue is less than right value
			if(leftPointer < leftList.length && (rightPointer >= rightList.length || leftList[leftPointer] < rightList[rightPointer])) {
				list[index] = leftList[leftPointer++];
			} else {
				list[index] = rightList[rightPointer++];
			}
			++index;
		}
	}
	
	/* return array index [0,1,2,..(n/2 - 1)] */
	public static int[] leftArray(int[] initArray) {
		int   leftSize = initArray.length / 2;
		int[] leftArray = new int[leftSize];
		for(int i = 0; i < leftSize; ++i) {
			leftArray[i] = initArray[i];
		}
		return leftArray;
	}
	
	/* return array index [n / 2,...n-1] */
	public static int[] rightArray(int[] initArray) {
		int middleIndex = initArray.length / 2;		//	2
		int rightSize = initArray.length - middleIndex;	// 3
		int[] rightArray = new int[rightSize];
		for(int i = 0; i < rightSize; i++) {
			rightArray[i] = initArray[i + middleIndex];
		}	
		return rightArray;
	}
	
}