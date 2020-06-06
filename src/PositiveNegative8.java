import java.util.Scanner;

public class PositiveNegative8 {
    public static void main(String[] args)
    {
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Enter the number :");
        int number = scanner.nextInt();
        if (number > 0)
        {
            System.out.println("Given number is a Positive integer");
        } else if(number < 0)
        {
            System.out.println("Given number is a Negative integer");
        } else
        {
            System.out.println("Given number is Zero");
        }


    }
}
