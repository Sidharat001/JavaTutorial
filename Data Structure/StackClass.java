import java.util.Scanner;

public class StackClass extends CommonClass {

    public StackClass(Scanner input) {
        super(input);
    }
    public static void main(String[] args) {
        int[] dynamicArr = null;
        Scanner Input = new Scanner(System.in);
        StackClass stack = new StackClass(Input);
        int operationType = stack.chooseOptionType;
        System.out.println("Operation Type: " + operationType);

        if(operationType == 1){
            System.out.print("Enter Stack Size :- ");
            int arrSize = Input.nextInt();
            dynamicArr = createSingleDArray(arrSize, Input);
            printSingleDArray(dynamicArr);
        }
    }
}