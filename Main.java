class Main {
  public static void main(String[] args) {
    /* This is how you declare and print strings */
    String name="Ishhy :)";
    System.out.println ("Welcome back, " + name);
    int bigNum = 4;
    bigNum = 10; /* Updated variable */
    System.out.println(bigNum); 
    //final int bigNum = 7;
    /* bigNum = 20; */

    /* Here we put a variable into another variable */
    String firstName = "John ";
    String lastName = "Doe"; 
    String fullName = firstName + lastName;
    System.out.println (fullName);

    /* Now we make some calculations */
    int x = 5, y = 6, z = 50;

    /*Addition*/
    System.out.println(x + y + z);

    /*Multiplication*/
    System.out.println(x * y * z);

    /* Java identifiers */
    int minutesPerHour = 60; /* Good */

    int m = 60; /* Bad */

    /* Java Data Type */
    int myNum = 5; /* Integers ( Whole Numbers) */
    float myFloatNum = 5.99f; /* Floating point numbers */ 
    char myLetter = 'M' ; /* Character */ 
    String myText = "Hello"; /* String */ 
    boolean myBool = true; /* Boolean */

  }
}
