import java.util.Scanner;

public class Weekday15 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number between 1 to 7 :");
        int i = scanner.nextInt();

        if (i  == 1)
        {
            System.out.print("Day of the week is Monday");
        }
        else if (i  == 2) {
            System.out.print("Day of the week is Tuesday");
        }
        else if (i  == 3)
        {
            System.out.print("Day of the week is Wednesday");
        }
        else if (i  == 4)
        {
            System.out.print("Day of the week is Thursday");
        }
        else if (i  == 5)
        {
            System.out.print("Day of the week is Friday");
        }
        else if (i  == 6)
        {
            System.out.print("Day of the week is Saturday");
        }
        else if (i  == 7)
        {
            System.out.print("Day of the week is Sunday");
        }
        else
        {
            System.out.print("Please Enter Valid number between 1 to 7");
        }






    }
}
