import java.util.Arrays;
public class FinalArray {
    public static void main(String[] args){

        //in final array we can change the value of the inner elements of the array
        final int[] arr = {10,20,30};

        arr[2] = 99;

        //but in final arrays we cant reference the main array to a whole new array that isnt possible eg:
        // arr = new int[] {100, 200 , 23}

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // he above example shows that we can change the values inside a final array but we can not assign a new array to it.

        // Import Arrays class for toString() method
        final int[] numbers = { 1, 2, 3, 4, 5 };

        // Assigning new element into the array
        numbers[0] = 10;
        System.out.println(
            "Array after modifying first element: "
            + Arrays.toString(numbers));
    }
}


