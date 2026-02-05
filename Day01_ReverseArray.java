/*
 Day 01 – Reverse an Array

 Approach:
 - Two pointer technique

 Time Complexity: O(n)
 Space Complexity: O(1)
*/

class Day01_ReverseArray {

    static void reverseArray(int[] arr) {
        int i = 0, j = arr.length - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        reverseArray(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
