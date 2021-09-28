package ferreira;

public class QuickSort {
    public static void main(String[] args) {
        int[] myArray = {10, 16, 8, 12, 15, 6, 3, 5, 0 , 11};
        quickSort(myArray, 0, myArray.length);
        for (int i : myArray) {
            System.out.println(i);
        }
    }

    //fist thing find the sorted position of the the first element
    //second do the sorting with the left part and the right part dividing and coquering

    public static void quickSort(int[] myArray, int start, int end) {
        if (end - start < 2) {
            return;
        }

        int pivot = partition(myArray, start, end);
        partition(myArray, start, pivot);
        partition(myArray, pivot + 1, end);
    }

    public static int partition(int[] myArray, int start, int end) {
        int pivot = myArray[start];
        int i = start;
        int j = end;

        while (i < j) {
            while (i < j && myArray[--j] >= pivot);
            myArray[i] = myArray[j];
            while (i < j && myArray[++i] <= pivot);
            myArray[j] = myArray[i];
        }

        myArray[j] = pivot;
        return j;
    }
}
