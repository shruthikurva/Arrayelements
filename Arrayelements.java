import java.util.Scanner;

public class Arrayelements{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Declare the array
        int[] array = new int[size];

        // Input elements of the array
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Initialize variables to store largest and smallest elements
        int largest = array[0];
        int smallest = array[0];

        // Find largest and smallest elements
        for (int i = 1; i < size; i++) {
            if (array[i] > largest) {
                largest = array[i];
            }
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }

        // Output the results
        System.out.println("Largest element: " + largest);
        System.out.println("Smallest element: " + smallest);
        scanner.close();
    }
}
