import java.util.Scanner;

/**
 * Demo project for Module 1
 *
 * @author Mark M. Meysenburg
 * @version 1.0 
 */
class Main {
  /**
   * Application entry point. 
   *
   * @param args String array containing command-line arguments; 
   * ignored by this application.
   */
  public static void main(String[] args) {
    int n = 0;
    double sum = 0.0;

    Scanner stdin = new Scanner(System.in);
    int age;
    age = stdin.nextInt();

    while(age > 0) {
      n++;
      sum += age;
      age = stdin.nextInt();
    }

    System.out.println(sum / n);
  }
}