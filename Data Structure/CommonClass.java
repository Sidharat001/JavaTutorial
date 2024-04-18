import java.util.Scanner;

public class CommonClass {
    protected int chooseOptionType;

    public CommonClass(Scanner input) {
        chooseOptionType = chooseOption(input);
    }
    
    public int chooseOption(Scanner input) {
        System.out.println("--------- Choose Option ---------");
        System.out.println("1. Static");
        System.out.println("2. Dynamic");
        return input.nextInt();
    }

    public int chooseOperationType(Scanner input) {
        System.out.println("-------- Stack Operation --------");
        System.out.println("1. Push Operation");
        System.out.println("2. Pop Operation");
        System.out.println("3. Read Operation");
        return input.nextInt();
    }

    public static int[] createSingleDArray(int arrSize, Scanner inputScanner) {
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

    public static int[] generateRandomArray(int arrSize) {
        int[] arr = new int[arrSize];
        for (int i = 0; arrSize > i; i++) {
          int tempInt = (int) (Math.random() * 10);
          arr[i] = tempInt;
        }
        return arr;
    }

    public static void printSingleDArray(int[] SortArr){
        for (int number : SortArr) {
            System.out.print(number + " ");
        }
    }
}
