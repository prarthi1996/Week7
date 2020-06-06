import java.util.Scanner;

public class GrossSalary6 {
    public static void main(String[]args) {
        double da,ta,pf,hra,GrossPayment;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter Name: ");
        String name= scanner.nextLine();
        System.out.println("Please enter Employee id : ");
        int id= scanner.nextInt();
        System.out.println("Please enter your Basic Salary: ");
        int salary = scanner.nextInt();
        da=salary*8/100;
        ta=salary*9/100;
        hra=salary*10/100;
        pf=salary*20/100;
        GrossPayment=salary+da+ta+hra+pf;
        System.out.println("The Calculated DA of " +name+ " is "+da);
        System.out.println("The Calculated TA of " +name+ " is "+ta);
        System.out.println("The Calculated HRA of " +name+ " is "+hra);
        System.out.println("The Calculated PF of " +name+ " is "+pf);
        System.out.println("The Gross Salary of " +name+ " is "+GrossPayment);

    }
}
