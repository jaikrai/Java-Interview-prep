package string;

import java.util.Arrays;

public class ArrayExample {
    // An Array is a collection of ordered objects of the same data type
    // each object in the array is access by an index starting of indexed at 0
    // up to the length of the array -1
    // Since item in an array stored in directly adjacent to memory locations an array
    // size cannot be change after allocation since items are stored contiguously

    public static void main(String[] args) {
        // Declare an array
        int [] nums;

        // Declare and allocate an array
        double [] otherNums = new double[5];

        // Declare, allocate and init an array
        String[] availablePets = {"cat", "dog", "fish"};
        String[] unavailablePets = {"bird", "cow", "elephant", "tiger"};
        System.out.println(Arrays.asList(availablePets));
        System.out.println(Arrays.toString(unavailablePets));

        int indexOfAvailablePets = 2; // index of the fish
        int indexOfUnavailablePets = 0; // index of the bird

        String availablePet = availablePets[indexOfAvailablePets];
        String unavailablePet = unavailablePets[indexOfUnavailablePets];

        availablePets[indexOfAvailablePets] = unavailablePet;
        unavailablePets[indexOfUnavailablePets] = availablePet;

        System.out.println(Arrays.toString(availablePets));
        System.out.println(Arrays.toString(unavailablePets));
    }


}
