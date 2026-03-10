public class moreonarray {
  public static void main(String[] args) {
    int arr[] = new int[5];
    // int arr[]= new int[-5]; it should not be negative exception occur =(Exception
    // in thread "main" java.lang.NegativeArraySizeException: -5)
    arr[0] = 10;
    arr[1] = 20;
    System.out.println(arr[1]);
    // it should not go beyound length exception =(Exception in thread "main"
    // java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 5)
    // instead of this use nums.length function in for loops
    System.out.println(arr[6]);
    // System.out.println(arr[2]);

  }

}