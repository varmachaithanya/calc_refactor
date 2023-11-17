import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1st number");
        double var1=sc.nextDouble();
        System.out.println("enter 2nd number");
        double var2=sc.nextDouble();
        System.out.println("Enter your choice");
        int choice=sc.nextInt();
        double var3;
        if (choice==1){
            var3=var1+var2;
            System.out.println("Sum of two numbers is : "+var3);
        }
        else {
            System.out.println("Invalid option");
        }
    }
}