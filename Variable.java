public class Variable {

  public static void main(String[] args) {
    String name = "John Doe";
    int age = 35;
    boolean isActiveUser = false;
    char gender = 'M';
    float salary = 1235.352f;
    System.out.println("-----------User Details-----------");
    System.out.println("I am " + name + " and I am " + age + " years old.");
    System.out.println(
      "I am " + (isActiveUser ? "Active" : "Not Active") + " User"
    );
    System.out.println(
      "I am " + ((gender == 'M' || gender == 'm') ? "Male" : "Female")
    );
    System.out.println("I am earning " + salary); //String.valueOf(salary).length()
  }
}
