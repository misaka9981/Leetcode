import java.util.Arrays;
import java.util.Collections;

class Solution_Offer_II_069_1 {
    public int peakIndexInMountainArray(int[] arr) {
        return MAX(arr);
    }

    public static int MAX(int[] arr) {
        if(arr.length>0) {
            int arr_Max = 0, arr_index = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > arr_Max) {
                    arr_Max = arr[i];
                    arr_index = i;
                }
            }
            return arr_index;
        }else{
            return -1;
        }
    }
}

class Solution_Offer_II_069_2 {
    public int peakIndexInMountainArray(int[] arr) {
        return MAX(arr);
    }

    public static int MAX(int[] arr) {
        int left = 1, right = arr.length - 2;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (arr[mid] > arr[mid - 1] && arr[mid] < arr[mid + 1]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}