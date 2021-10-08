package ferreira;
import java.util.*;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 5, 7, 10, 15, 20, 21, 25, 35, 157, 300};
        System.out.println("Test");

        System.out.println(binarySearch(arr, 1));
        System.out.println(binarySearch(arr, 35));
        System.out.println(binarySearch(arr, 300));
        System.out.println(binarySearch(arr, 10));
    }

    public static int binarySearch(int[] arr, int value) {
        if (arr.length < 1) {
            return -1;
        }

        int start = 0;
        int end = arr.length;

        while (start < end) {
            int mid = (start + end) / 2;

            if (arr[mid] == value) {
                return mid;
            } else if (arr[mid] < value) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return -1;
    }
}
