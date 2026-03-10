public class arrays {
    /**
     * use of array in java = array is used when you have to store multiple values
     * in one variable at that point array is used
     */
    public static void main(String[] args) {
        int num[] = { 5, 6, 7 }; // simple declaration of array
        System.out.println(num[0]);

        int num1[] = new int[4];
        // decalaration of array when you dont know initials values or simple values of
        // it
        System.out.println(num1[0]); // here num1[0] defines what value you want to fetch

        /****** creation of array ( next video )*********** */

        // code for updating value
        int nums2[] = { 3, 7, 2, 4 };
        nums2[1] = 0;
        System.out.println(nums2[1]);

        // if you want to make it dynamic
        int nums3[] = new int[5];
        nums3[0] = 3;
        nums3[1] = 6;
        nums3[2] = 9;
        nums3[3] = 12;
        nums3[4] = 15;

        // suppose you want to fetch all values instead of any one value
        // ans= we can done so with the help of loops like

        for (int o = 0; o <= 5; o++) {
            System.out.println(nums3[o]);
        } // small error=Exception in thread "main"
          // java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
          // at arrays.main(arrays.java:31)

        /***************** multi dimensional array ( next video)*************** */

        // MEANING= 2 dimanesional array means one big array containing multiple arrays
        // or(array of array)
        // represented by =int nums[][]= new int[][];
        // int nums[][] = define it is 2d array
        // new int[][] = define capacity like [3][4] = it means 3 internal array(rows)
        // and each array has 4 elements ( columns )

        int nums4[][] = new int[3][4];
        // nested loop( loop inside loop)
        // loop for row
        for (int i = 0; i < 3; i++) {
            // loop for column(each array)
            for (int j = 0; j <= 4; j++) {

                // System.out.println(nums4[i][j]); // all comes in a straight line
                // but if i want after ending of every column print in new line is done by
                // concatinating spacing with it like
                System.out.println(nums4[i][j] + " ");

            }

        }

    }
}
