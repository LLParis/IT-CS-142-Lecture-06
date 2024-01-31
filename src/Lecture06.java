import java.util.*;
/*
London Paris
IT-CS-142
*/
public class Lecture06 {
  public static void showTwos(int n) {
    System.out.print(n + " = ");

    while (n % 2 == 0) {
      System.out.print("2 * ");
      n /= 2;
    }

    System.out.println(n);
  }

  public static void main(String[] args) {
    System.out.println();
    System.out.println("Hello, world!");
    // SELF-CHECK PROBLEMS:
    // Note: you will need to put some of your answers inside a comments

    // Put your answer for #5A here:
    // 10

    // NOTE: FIRST try to predict what the output will be WITHOUT actually running the program
    // write down your answer here

    // NEXT run the program and see the results (you can copy-and-paste it here)
    // (I'm not including it in the starter project so that people don't just run
    //  it as the first thing they do :)  )

    // LASTLY compare the two results and if they're different go back and figure out
    // why the computer's output is different from what you predicted.

    // Put your answer for #5B here:
    // (Do this like #5A - predict, write your prediction, run the code, then explain any differences)
    // 0

    // Put your answer for #5C here:
    //5

    // Put your answer for #6 here:
    Random rand = new Random();
    int randomNumber = rand.nextInt(11);
    System.out.println(randomNumber);


    // Put your answer for #7 here:
    // Instead of correcting the code write a brief explanation of how to fix it
    // and include only the lines that you'll change
    int randomNum = rand.nextInt(48);
    int randomOdd = 2 * randomNum + 5;
    System.out.println(randomOdd);

    // Put your answer for #9 here:
    Scanner input = new Scanner(System.in);
    String answer;

//    do {
//      System.out.println("She sells seashells by the seashore.");
//      System.out.println("Do you want to hear it again?");
//        answer = input.next();
//    } while (answer.equalsIgnoreCase("y"));

    // Put your answer for #12 here:
    // The issue with the printLetters method is that it adds a dash after the last character.
    // This is a fencepost problem that can be solved by checking within the loop if you are on the last char.

    // Put your answer for #16 here:
    // The issue with the provided isPrime method is that it incorrectly resets the prime flag to true
    // if it finds any number i that does not divide by n
    // For example, if n is 4, the method would  set prime to false when i is 2 since 4 % 2 == 0.
    // However, when i becomes 3, prime is set back to true because 4 % 3 != 0.


    // EXERCISES:

    // Put your answer for #1 here:
    // You will need to add the method in above main(), but then call it here
    showTwos(7);
    showTwos(18);
    showTwos(68);
    showTwos(120);

    // Put your answer for #12 here:
    printAverage();

  }
  public static void printAverage() {
    Scanner scanner = new Scanner(System.in);
    int count = 0;
    double sum = 0;
    boolean firstInput = true;

    while (true) {
      System.out.print("Type a number: ");
      double input = scanner.nextDouble();

      if (input < 0) {
        if (firstInput) {
          System.out.println("No average to calculate.");
        } else {
          double average = sum / count;
          System.out.println("Average was " + average);
        }
        break;
      }

      sum += input;
      count++;
      firstInput = false;
    }
  }
}
