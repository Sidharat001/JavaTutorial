import java.util.*;

public class BubbleSort {

  public static void main(String agrs[]) {
    Scanner Input = new Scanner(System.in);
    int[] SortArr = null;

    // Create Dyanmic Array
    System.out.print("Enter The Array Size : ");
    int size = Input.nextInt();
    int[] arr = BubbleSort.createArray(size, Input);

    // Get Option From Users
    int Option;
    do {
      Option = showOption(Input);

      switch (Option) {
        case 1:
          SortArr = BubbleSort.BubbleSort(arr);
          break;
        case 2:
        SortArr = BubbleSort.SelectionSort(arr);
        break;
        default:
          break;
      };
    } while (Option != 6);

    // Display all array values
    if(SortArr != null){
      System.out.println("--------Display All Value--------");
      for (int number : SortArr) {
        System.out.print(number + " ");
      }
    }else
      System.out.println("No sorting operation performed.");
  }

  public static int[] createArray(int arrSize, Scanner inputScanner) {
    // Set dynamic size from user
    int[] arr = new int[arrSize];
    // Get array values from user
    for (int i = 0; arrSize > i; i++) {
      System.out.print("Enter the value for index " + i + ": ");
      arr[i] = inputScanner.nextInt();
    }
    // return Array
    return arr;
  }

  public static int[] BubbleSort(int[] Array) {
    int length = Array.length - 1;
    int count = 0;
    while (count < length) {
      for (int i = 0; i < length - count; i++) { // n - no. of iteration Example:- (Ith iteration = n -i );
        if (Array[i] > Array[i + 1]) {
          int temp = Array[i];
          Array[i] = Array[i + 1];
          Array[i + 1] = temp;
        }
      }
      count++;
    }

    System.out.println("Bubble Sort Apply Successfully");
    return Array;
  }

  public static int showOption(Scanner input) {
    System.out.println("--------Choose One Option--------");
    System.out.println("1: Bubble Sort");
    System.out.println("2: Selection Sort");
    System.out.println("3: Insertion Sort");
    System.out.println("4: Merge Sort");
    System.out.println("5: Quick Sort");
    System.out.println("6: Exit");
    return input.nextInt();
  }

  public static int[] SelectionSort(int[] arr){
    int length = arr.length - 1;
    for(int i=0; i < length; i++){
      int minIndex = i;
      for(int j=i+1; j < length; j++){
        if(arr[minIndex] > arr[j])
          minIndex = j;
      }
      int temp = arr[i];
      arr[i] = arr[minIndex];
      arr[minIndex] = temp;
    }
    System.out.println("Selection Sort Apply Successfully");
    return arr;
  }
}
