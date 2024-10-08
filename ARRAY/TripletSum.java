/*Given an array arr of size n and an integer x. Find if there's a triplet in the array which sums 
up to the given integer x.
*/
import java.util.HashSet;
import java.util.Scanner;

public class TripletSum {
    // Should return the triplet if there is a triplet with sum equal to x in arr[], otherwise null
    public static int[] findtripletNumbers(int arr[], int n, int x) {
        // If there are less than 3 elements, it's impossible to form a triplet
        if (n < 3) {
            return null;
        }

        // Traverse the array
        for (int i = 0; i < n - 2; i++) {
            HashSet<Integer> set = new HashSet<>();
            int tofind = x - arr[i];
            for (int j = i + 1; j < n; j++) {
                if (set.contains(tofind - arr[j])) {
                    // Return the triplet found
                    return new int[]{arr[i], arr[j], tofind - arr[j]};
                }
                set.add(arr[j]);
            }
        }
        return null; // No triplet found
    }

   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the size of the array
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        // Check if the array has at least 3 elements
        if (n < 3) {
            System.out.println("Array should have at least 3 elements.");
            scanner.close();
            return; // Exit as we cannot have triplets in an array of size less than 3
        }

        // Initialize the array
        int arr[] = new int[n];

        // Input the array elements
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Input the target sum
        System.out.print("Enter the target sum (x): ");
        int x = scanner.nextInt();

        // Call the function and print the result
        int[] result = findtripletNumbers(arr, n, x);
        
        if (result != null) {
            System.out.println("Triplet with the given sum found: {" + result[0] + ", " + result[1] + ", " + result[2] + "}");
        } else {
            System.out.println("No triplet with the given sum found.");
        }

    }
}
