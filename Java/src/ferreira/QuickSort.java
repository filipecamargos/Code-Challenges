package ferreira;

import java.util.*;

public class QuickSort {
    public static void main(String[] args) {
        int[] myArray = {10, 16, 8, 12, 15, 6, 20, 3, 5, 0 , 11, 20};
        System.out.println("Length: " + myArray.length);
        quickSort(myArray, 0, myArray.length);
        for (int i : myArray) {
            System.out.println(i);
        }
        System.out.println("Length: " + myArray.length);
    }

    //fist thing find the sorted position of the the first element
    //second do the sorting with the left part and the right part dividing and coquering
    public static void quickSort(int[] arr, int start, int end) {
        if (end - start < 2) {
            return;
        }
        
        int pivot = partitionSorted(arr, start, end);
        quickSort(arr, start, pivot);
        quickSort(arr, pivot + 1, end);
    }

    public static int partitionSorted(int[] arr, int start, int end) {
        int pivot = arr[start];
        int i = start;
        int j = end;

        while (i < j) {
            while (i < j && arr[--j] >= pivot);
            if (i < j) {
                arr[i] = arr[j];
            }
            while (i < j && arr[++i] <= pivot);
            if (i < j) {
                arr[j] = arr[i];
            }
        }

        arr[j] = pivot;
        return j;
    }
}
