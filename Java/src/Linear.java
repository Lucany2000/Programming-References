import org.w3c.dom.Node;

import java.util.Arrays;

public class Linear {

    //Prefix Sum
    //compute the sum of elements between 2 indices frequently
    // or find or count the number of subarrays that add upto a specific value
    static int[] calculatePrefixSum(int[] arr) {
        int[] prefixSum = new int[arr.length];

        prefixSum[0] = arr[0];

        for (int i = 1; i < arr.length; i++) {
            prefixSum[i] = prefixSum[i-1]+arr[i];
            //arr[i] = arr[i -1] + arr[i]; can modify the original array as an alt.
        }

        return prefixSum;
    }


    //Two pointer: a pointer starts and 0 and another at -1 moving towards each other or away.
    static boolean twoSum(int[] arr, int target) {
        Arrays.sort(arr);

        int left = 0, right = arr.length - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum == target) {
                return true;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return false;
    }

    //Two pointer, Fast and Slow: both starts at the same spot, but slow moves by 1 while fast moves by 2+
    static boolean findMiddle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }

        return false;
    }

    //Sliding Window
    static int findMaxSumSubArray(int[] arr, int k) {
        int n = arr.length;

        int max_sum = Integer.MIN_VALUE;

        //creates the starting point of each window
        for (int i = 0; i < n - k + 1; i++) {
            int current_sum = 0;
            //ensures that each window does not exceed the max window length
            for (int j = 0; j < k; j++)
                current_sum = current_sum + arr[i + j];

            // Update result if required.
            max_sum = Math.max(current_sum, max_sum);
        }

        return max_sum;
    }

    //binary search: a variation of the two-pointer algo
    //binary search (recursive)
    int binarySearch(int arr[], int low, int high, int x)
    {
        if (high >= low) {
            int mid = low + (high - low) / 2;

            // If the element is present at the
            // middle itself
            if (arr[mid] == x)
                return mid;

            // If element is smaller than mid, then
            // it can only be present in left subarray
            if (arr[mid] > x)
                return binarySearch(arr, low, mid - 1, x);

            // Else the element can only be present
            // in right subarray
            return binarySearch(arr, mid + 1, high, x);
        }

        // We reach here when element is not present
        // in array
        return -1;
    }

    //binary search (iterative)
    int binarySearch(int arr[], int x)
    {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            // Check if x is present at mid
            if (arr[mid] == x)
                return mid;

            // If x greater, ignore left half
            if (arr[mid] < x)
                low = mid + 1;

                // If x is smaller, ignore right half
            else
                high = mid - 1;
        }

        // If we reach here, then element was
        // not present
        return -1;
    }

}

class ListNode {
    int value;
    ListNode next;

    ListNode(int value) {
        this.value = value;
        this.next = null;
    }
}
