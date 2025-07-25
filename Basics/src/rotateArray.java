import java.util.Scanner;
import java.util.Arrays;

public class rotateArray {
    // Static reverse method to allow call from main
    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input size and rotation index
        System.out.print("Enter array size: ");
        int n = input.nextInt();

        System.out.print("Enter index to rotate at: ");
        int k = input.nextInt(); // Rotation index

        // Input array
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        // Normalize index if needed
        k = k % n;

        // Rotate using 3-step reverse
        reverse(arr, 0, k - 1);
        reverse(arr, k, arr.length - 1);
        reverse(arr, 0, arr.length - 1);

        // Output result
        System.out.println("Rotated Array:");
        System.out.println(Arrays.toString(arr));
    }
}
