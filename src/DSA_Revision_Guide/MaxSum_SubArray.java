package DSA_Revision_Guide;

import java.util.Arrays;
import java.util.Scanner;

/*
We have an array [1,2,3,2,4] and k=2, we want to return the max sum of the array with size 2.
Looking at this for the first time, I would think of a brute force way to calculate all the subarrays,
find their sum, store the maximum, and return it.
 */

public class MaxSum_SubArray {
    public static int maxSum(int ar[], int k)
    {
        Arrays.sort(ar);
        int sum = 0;
        int n = ar.length;
        for (int i = 0; i < k ; i++) {
            sum += ar[n-1];
            n--;
        }
        return sum;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Length of Array:");
        int n = sc.nextInt();
        int[] ar = new int[n];
        System.out.println("Enter the Elements of Array:");
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }
        System.out.println("Enter the length of SubArray:");
        int k = sc.nextInt();

        System.out.println("MaxSum of SubArray: "+maxSum(ar,k));
    }
}
