public class Solution {
  
  // use this method as a prototype for your answers...
  void soln1() {
  // For loop from 100 to 5 by 5. print index var.
    for (int i = 100; i >= 5; i = i -5);
    System.out.println(i);
  }
  
  void soln2() {
  // For loop from 100 to 5 by 5. do nothing inside the loop.
    for (int i = 100; i >= 5; i = i -5);
  }
  
  void soln3() {
  // Sum Integers from 9 to 17, print sum
    int sum = 0;
    for (int i = 9; i <= 17; i++){
      sum = sum + i;
    }
    system.out.println(sum);

  }
  
  void soln4() {
  // Find and print the smallest integer in an array a = [9, 5, 6, 3, 8, 2, 4];
    int small = a[0];
    for(int i = 1; i >= a.length -1; i++){

      if a[i] < small) {
        small = a[i];
      }
    }
    return small;

  }
  
  void soln5() {
  // Find largest integer in the last array and print it.
    int large = a[0];
    for(int i = 1; i <=a.length -1; i++){

      if (a[i] > large) {
        large = a[i];
      }
    }
    return large;

  }
  
  void soln6() {
  // Find and print index of first true element in an array of booleans a = [false, false, false, true, false];
    for ( int i = 0; i < a.length - 1; i++){

    if (a[i] == true){
      break;
    }
    System.out.println(i);


    // or if (a[i] == true) { break;}

  }
// if you wanted to find “false” you would write “if (!a[i])

  
  void soln7() {
  // Find and print index of first true element in an array of booleans (must use a while loop)
   int i = 0;
   while (i <= a.length);
   System.out.println(a(i));
   //or while (!a[i]) { i++; } System.out.print(i); }
  }
  
  void soln8() {
  // add 5 to every element of an array of integers a = [9, 5, 6, 3, 8, 2, 4]
    for (int i = 0; i < a.length ; i++) {
      a[i] = a[i] + 5;
      System.out.print(a[i]);
    }
  }
  
  void soln9() {
  // divide each element of an array by 1.3; a = [0.5, 1.4, 6.7, 123.4 -34.6]
    for (i = 0;  i <= a.length -1 ; i++) {

      a[i] /= 1.3;
    }
    return a[i];

  }
  
  void soln10() {
  // raise each element of a double array to it's 3rd power and subtract the original element's
    // value by the value divided by 3.0 a = [1.3, 5.4, 6.1, 1.0, 9.2];
    for (i = 0; i <= a.length - 1; i++) {
      (Math.pow(a[i], 3) - (a[i]/3));
    }

  }
  
  void soln11() {
  // zero out a 4 by 6 integer array
    for (int x; x < 4; x ++);
      for (int y; y < 6; y++);
    a[x][y] == 0;

  }
  
  void soln12() {
  // multiply each element of a 5 by 5 array of integers by 7
    for (int x = 0; x <5 ; x++)
      for (int y; y < 5; y++);
    a[x][y] *=7 ;
  }
  
  void soln13() {
  // create a method that takes a 5 by 5 array and produces a 5 by 5 array of booleans. each element in the result
    // should be true if the value in the argument array is even, else it's false.
    Boolean a[][] = new boolean [][];
      for (int x = 0; x < 5; x++)
        for (int y; y < 5; y++);
      if (a[x][y] % 2 == 0) {
       System.out.println();

      }
  }
  
  void soln14() {
  // create a method that takes two doubles and returns the first parameter raised to the second parameter's value
double(Math.pow(a,b));
  }
  
  void soln15 (Object fish) {
  // create a method that returns a boolean if the Object passed to it is a Fish or not
     if (fish == Fish) {
       return true; //return input instaceOf Fish;
  }
     return false;
  
  void soln16(Object x) {
  // There is an object x which has a method (double)Balance(). Build an IF statement that prints
    // "Paid Off" if the result of the balance call is less than of equal to 1.0, else it prints
    // the balance as a Dollar figure (2 decimal places)
    double balance = x.Balance();
    if (balance <= 1.0) {
      System.out.println("Paid Off");
    }
    else{
      String bal = String.format("%.2f",balance);
      System.out.println(bal);
    }
  }
  
  void soln17() {
  // Build a WHILE loop that turns on the heat if the thermo.getTemp()
    // is less than 72.0 else it turns on the A/C if thermo.getTemp() is greater that 76.0.
    while (thermo.getTemp() < 72.0) {
      turnOn = "Heat";
    }
    if (thermo.getTemp() > 72.0) {
      turnACOn = "AC";
    }
    else (thermo.getTemp() == 72.0) {
      turnOff = "Heat" || "AC"
    }
  }
  
  void soln18() {
  // Find a number greater than Pi in a double array, print number and its index.
    for (int i = 0; i < array.length; i++) {
      if (array[i]  > Math.PI)
        System.out.println("The array's number is " + array[i] + " and the index is " + i + ".");
    }
  }
  
  void soln19( Object [] objects )  {
  // Given an array of objects (of class Xaction) w/nulls, sum all
    // the values of the objects in the array, using Xaction::getValue(). Print the sum.
    Integer sum = 0;
    for (int i = 0; i < objects.length; i++) {
      Integer value = Xaction.getValue(objects[i]);
      if (value != null) { //then print the sum as it updates
        sum += value;
    }
  }
  
  void soln20() {
  // reverse an array of objects of type Xaction
    Xaction reverse = "";
    for (int in = 0; i <= objects.length / 2; i++) {
      reverse = objects[i];
      objects[i] = objects[objects.length - 1 - i];
     reverse = objects[objects.length - 1 - i];
    }
    return objects;
  }
  
  void soln21() {
  // Print a 5's times table
    String table = "";
    for (int i = 1; i <= 5; i++){
      for (int j = 1; j<= 5; j++){
        table += String.format("%3d |", (i*j));
      }
      table _+= "\n";
    }
    System.out.println(table);
  }
  
  void soln22() {
  // determine the hypotenuse of a 9 by 7 right triangle, assign it to a double
    double hypotenuse = Math.sqrt(Math.pow(9,2) + Math.pow(7,2)));
  }
  
}
