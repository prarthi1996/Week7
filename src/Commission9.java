import java.util.Scanner;

public class Commission9 {
    public static void main(String[]args)
    {
        double ca1,ca2,ca3,ca4,ca5;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter Seller id : ");
        int id= scanner.nextInt();
        System.out.println("Please Enter the Seller Name:");
        String name = scanner.next();
        System.out.println("Please enter your Sales Amount: ");
        int amount = scanner.nextInt();
        System.out.println("Please enter your Basic Salary: ");
        int salary = scanner.nextInt();
        ca1=amount*35/100;
        ca2=amount*20/100;
        ca3=amount*10/100;
        ca4=amount*5/100;
        ca5=amount*2/100;

        if(amount >=50000)
        {
            System.out.println(ca1+ "is the calculated comission of " + name);
        }
            else if (amount >=30000 && amount <50000)
        {
            System.out.println(ca2 + "is the calculated comission of " + name);
        }
        else if (amount >=20000 && amount<30000) {
            System.out.println(ca3  + "is the calculated comission of " + name);
        }
        else if (amount >=10000 && amount<20000)
        {
            System.out.println(ca4  + "is the calculated comission of " + name);

        }
            else
        {
            System.out.println(ca5 + "is the calculated comission of " + name);
        }

    }
   // if( >=35 && percentage<50)
}
