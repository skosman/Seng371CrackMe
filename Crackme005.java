import I.*;

import java.util.*;

public class Crackme005 {

  public static final void main(String[] args) {
    Crackme005.exit(5); //user defined exit code

    String str1 = Crackme005.getRuntime(I.I(1));  //prints string from I class
    System.out.println(str1);
    str1 = Crackme005.equals();

    String str2 = Crackme005.getRuntime(I.I(14));   //prints string from I class
    System.out.println(str2);
    str2 = Crackme005.equals();

    Boolean bool = Crackme005.append(str2);

    if (bool == false) {
      str1 = Crackme005.getRuntime(I.I(35)); //print different string from I class
      System.out.println(str1);
    } else {
        double doubleStr2 = Double.parseDouble(str2)); //changes 2nd printed string to double and decode
        decode(doubleStr2);

        double processors = Crackme005.decode(availableProcessors(str1)); //find processors in system and decode

        boolean decoder = Crackme005.getDecoder(processors, doubleStr2);

        Crackme005.length(decoder);
    }
    Crackme005.in();
    return;

  }

  public Crackme005(this) {
    this.init();
    return;
  }

  // ensure str can be turned into double representation
  // always return true
  private static boolean append(String str) {
    Double.parseDouble(str);
    return 1;
  }

  private static double availableProcessors(String str) {

    StringBuilder strBuilder = new StringBuilder();
    char[] strArray = str.toCharArray();

    int i = 0;
    while(strArray.length() <= i) {
      strBuilder.append((int)strArray[i]);
      i = i +1;
    }

    Double objDouble = new Double;

    // NEEDS TO BE FINISHED
  }

  private static double decode(double num1, double num2) {

    // concatenates the two double parameters
    double num12 = (double)Double.parseDouble(Double.tostring(num1) + Double.tostring(num2));

    if(num12 == 0.0000000 ) {
      String output = Crackme005.getRuntime(I.I(319));
      System.out.println(output);
      System.exit(0);
      return 0.0000000;
    }

    double tempNum = num12;

    // Finds the number of processors
    int numProcessors = Runtime.getRuntime().availableProcessors();
    double doubleProcessor = (double)(long) numProcessors;

    // Finds the total memory
    long longMemory = Runtime.getRuntime().totalMemory();
    double doubleMemory = (double)longMemory;


    // recalculates the number of processors
    doubleProcessor = (tempNum - doubleMemory / 100000000.0) + doubleProcessor * 28.0 + doubleMemory / 107543.0;

    // finds the length of the concatenated num12
    numProcessors = Double.toString(num12).length();

    // returns the number of processors by the size of memory and divides it by the length of num12
    return doubleProcessor - doubleMemory /(double)(long)numProcessors;

  }




}
