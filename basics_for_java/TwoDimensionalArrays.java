public class TwoDimensionalArrays {
    public static void main(String[] args) {

        // Declaring a 2D array
        int[][] arr;

        // Initializing row and column sizes
        arr = new int[1][3];

        // Assigning values
        arr[0][0] = 3;
        arr[0][1] = 5;
        arr[0][2] = 7;

        // Displaying values
        System.out.println("arr[0][0] = " + arr[0][0]);
        System.out.println("arr[0][1] = " + arr[0][1]);
        System.out.println("arr[0][2] = " + arr[0][2]);

   
      	// Row and Columns in Array
        int n = 2;
        int m = 2;

      	// Array declared and initialized
        int[][] arr1 = new int[n][m];

        int it = 1;
      
      	// Assigning the values to array
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr1[i][j] = it;
                it++;
            }
        }

      	// Printing the Array
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++)
                System.out.print(arr1[i][j] + " ");
            System.out.println();
        }

        int[][] arr2 = { { 1, 2 }, 
                       	{ 3, 4 } };
      
		System.out.println("a[1][1] : " + arr2[1][1]);
    }
}





