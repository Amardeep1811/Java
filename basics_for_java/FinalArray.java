public class FinalArray {
    public static void main(String[] args){

        //in final array we can change the value of the inner elements of the array
        final int[] arr = {10,20,30};

        arr[2] = 99;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

