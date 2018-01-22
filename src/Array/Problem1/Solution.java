package Array.Problem1;

public class Solution {
    private static void rotateArray(int[] arr, int k) {
        int[] temp = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[Math.floorMod(i - k, arr.length)];
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = temp[i];
        }
    }

    public static void main(String[] args) {
        int[] given = {1, 2, 3, 4, 5, 6, 7};
        rotateArray(given, 3);
        for (int i = 0; i < given.length; i++) {
            System.out.println(given[i]);
        }
    }
}
