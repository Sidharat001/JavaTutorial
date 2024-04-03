public class TypeCasting {

  public static void main(String[] args) {
    // Implicit type casting (Widening Conversion)
    int numInt = 10;
    double numDouble = numInt; // Implicit casting from int to double
    System.out.println("numDouble: " + numDouble); // Output will be 10.0

    // Explicit type casting (Narrowing Conversion)
    double numDouble2 = 20.56;
    int numInt2 = (int) numDouble2; // Explicit casting from double to int
    System.out.println("numInt2: " + numInt2); // Output will be 20

    // Example of casting with objects
    Object obj = "Hello"; // obj is of type Object
    String str = (String) obj; // Explicit casting from Object to String
    System.out.println("Length of str: " + str.length()); // Output will be 5
  }
}
