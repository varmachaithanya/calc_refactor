import java.util.Scanner;

public class Main{
    public static  double addition(double a,double b){
        return a+b;
    }
    public static double subtraction(double a,double b){
        return a-b;
    }
    public static double multiplication(double a,double b){
        return a*b;
    }
    public static double division(double a,double b){
        return a/b;
    }
    public static double modulus(double a,double b){
        return a%b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1st number");
        double var1=sc.nextDouble();
        System.out.println("enter 2nd number");
        double var2=sc.nextDouble();
        System.out.println("Enter your choice\n 1: Addition \n 2: Subtraction\n 3: Multiplication\n 4: Division\n 5: Modulus");
        int choice=sc.nextInt();
        double var3;
        switch (choice){
            case 1:
                System.out.println("sum of two numbers is :" +addition(var1,var2));
                break;
            case 2:
                System.out.println("sub of two numbers is :" +subtraction(var1,var2));
                break;
            case 3:
                System.out.println("mul of two numbers is :" +multiplication(var1,var2));
                break;
            case 4:
                System.out.println("div of two numbers is :" +division(var1,var2));
                break;
            case 5:
                System.out.println("mod of two numbers is :" +modulus(var1,var2));
                break;
            default:
                System.out.println("Invalid option");
                break;



        }
    }
}