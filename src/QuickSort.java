import java.util.*;

public class QuickSort {
	public static void main(String[] args) {
		int[] numList = {12,2,36,20};
		System.out.println("Before: " + Arrays.toString(numList));
		quickSort(numList, 0, numList.length - 1);
		System.out.println("After: " + Arrays.toString(numList));
	}
	
	public static void quickSort(int[] list, int left, int right) {
		int index = partition(list, left, right);
		// i.e. more than one element
	      if (left < index - 1)
	            quickSort(list, left, index - 1);
	      // i.e. more than one element
	      if (index < right)
	            quickSort(list, index, right);
	}
	
	public static int partition(int[] list, int left, int right) {
		int i = left;
		int j = right;
		int pivot = list[(left + right) / 2];
		
		while(i <= j) {
			while(list[i] < pivot)
				i++;
			while(list[j] > pivot)
				j--;
			if(i <= j) {
				int i_value = list[i];
				list[i++] = list[j];
				list[j--] = i_value;
			}
		}
		System.out.println(i);
		return i;
	}
	


}