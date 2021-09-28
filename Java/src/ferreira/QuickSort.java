package ferreira;

public class QuickSort {
    public static void main(String[] args) {
        int[] myArray = {10, 16, 8, 12, 15, 6, 3, 5};
        quickSort(myArray, 0, myArray.length);
        for (int i : myArray) {
            System.out.println(i);
        }
    }

    //fist thing find the sorted position of the the first element
    //second do the sorting with the left part and the right part dividing and coquering

    public static void quickSort(int[] myArray, int start, int end) {
        //fist if we have sorted the whole elements lets return
        if ((end - start) <= 2) {
            return;
        }
        
        //create a recursive approach to find the pivot and swipe by dividing and coquering
        int pivot = partion(myArray, start, end);
        quickSort(myArray, start, pivot);
        quickSort(myArray, pivot + 1, end);
    }

    public static int partion(int[] myArray, int start, int end) {
        int pivot = myArray[start];
        int i = start;
        int j = end;
        
        while (i < j) {
            while (i < j && myArray[--j] >= pivot);
            myArray[i] =  myArray[j];
            while (i < j && myArray[++i] <= pivot);
            myArray[j] = myArray[i];
        }

        myArray[j] = pivot;
        return j;
    }
}
