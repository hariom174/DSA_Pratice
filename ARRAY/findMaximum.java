/* Given a list of N integers, representing height of mountains. Find the height of the tallest mountain.*/

import java.util.Scanner;

class Maximum_number 
{
    
    public static int findMaximum(int[] arr, int n, int index, int max) 
	{
        if (index == n) {
            return max;
        }

        if (arr[index] > max) 
		{
            max = arr[index];
        }

        return findMaximum(arr, n, index + 1, max);
    }

    public static void main(String... args) 
	{

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of array elements:");
        int n = in.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) 
		{
            arr[i] = in.nextInt();
        }

        int result = findMaximum(arr, n, 0, 0);
        System.out.println("Maximum number in the array: " + result);
    }
}
