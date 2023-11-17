import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Functions f = new Functions();
        Scanner sc = new Scanner(System.in);
        int option=0;
        do {
            System.out.println("enter 1st number");
            double var1 = sc.nextDouble();
            System.out.println("enter 2nd number");
            double var2 = sc.nextDouble();
            System.out.println("Enter your choice\n 1: Addition \n 2: Subtraction\n 3: Multiplication\n 4: Division\n 5: Modulus");
            int choice = sc.nextInt();
            double var3;
            switch (choice) {
                case 1 -> System.out.println("sum of two numbers is :" + f.addition(var1, var2));
                case 2 -> System.out.println("sub of two numbers is :" + f.subtraction(var1, var2));
                case 3 -> System.out.println("mul of two numbers is :" + f.multiplication(var1, var2));
                case 4 -> System.out.println("div of two numbers is :" + f.division(var1, var2));
                case 5 -> System.out.println("mod of two numbers is :" + f.modulus(var1, var2));
                default -> System.out.println("Invalid option");
                }
            System.out.println("To end the program press 1");
            option = sc.nextInt();
            } while(option!=1);

    }
}