import java.util.Scanner;

public class MySolution {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      System.out.print("input value of a: ");
      double a = scanner.nextDouble();

      System.out.print("input value of b: ");
      double b = scanner.nextDouble();

      System.out.print("input value of c: ");
      double c = scanner.nextDouble();

      double equation = b * b - 4 * a * c;

      if (equation > 0) {
         double root1 = (-b + Math.sqrt(equation)) / (2 * a);
         double root2 = (-b - Math.sqrt(equation)) / (2 * a);
         System.out.println("The roots are " + root1 + " and " + root2);
      } else if (equation == 0) {
         double root = -b / (2 * a);
         System.out.println("The root is " + root);
      } else {
         System.out.println("The equation doesn't have root");
      }

      scanner.close();
   }
}
