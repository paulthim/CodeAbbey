//122

import java.util.Scanner;

public class QuickSort {
	public static void main(String[] args) {
		
		// simply initiates the recursion. Could probably simplify this.
        try {
        	int[] array = populateArray();
        	int leftLimit = 0;
        	int rightLimit = array.length-1;
        	quickSort(array, leftLimit, rightLimit);
        } catch (IOException e) {
        	System.out.println("Could Not Generate Array");
        }
    }
    
    private static int[] populateArray() { // populates an array from given input
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] array = new int[n];
        for (int i =  0; i < n; i++) {
            array[i] = in.nextInt();
        }
        in.close();
        return array;
    }
    
    private static void quickSort (int[] arrayToSort, int leftLimit, int rightLimit) { // recursive Quick-Sort function. Sorts a given partition then evaluates partition size
        System.out.print(leftLimit + "-" + rightLimit + " ");
        int pivotIndex = quickSortPartition(arrayToSort, leftLimit, rightLimit);
        if (pivotIndex - leftLimit > 1) {
            quickSort(arrayToSort, leftLimit, pivotIndex-1);
        } 
        if (rightLimit - pivotIndex > 1) {
            quickSort(arrayToSort, pivotIndex+1, rightLimit);
        }
    }
    
    private static int quickSortPartition (int[] arrayToSort, int left, int right) { // actual sorting steps
        int[] array = arrayToSort;
        int leftLimit = left;
        int rightLimit = right;
        int pivot = array[leftLimit];
        boolean scanFromRight = true;
        while (leftLimit < rightLimit) {
            if (scanFromRight) {
                if (array[rightLimit] > pivot) {
                    rightLimit--;
                } else {
                    array[leftLimit] = array[rightLimit];
                    leftLimit++;
                    scanFromRight = false;
                }
            } else {
                if (array[leftLimit] < pivot) {
                    leftLimit++;
                } else {
                    array[rightLimit] = array[leftLimit];
                    rightLimit--;
                    scanFromRight = true;
                }
            }
        }
        array[leftLimit] = pivot;
        return leftLimit;
    }
}