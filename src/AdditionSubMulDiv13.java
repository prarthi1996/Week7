import java.util.Scanner;

public class AdditionSubMulDiv13 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number :");
        int first = scanner.nextInt();
        System.out.println("Enter the Number :");
        int second = scanner.nextInt();
        System.out.println("Please enter the operation symbol: ");
        char ch = scanner.next().charAt(0);
        if  (ch  == '+')
        {
            System.out.println("Addition of these 2 Number is : "+first + '+'+second+'='+(first+second));
        }
        else if  (ch  == '*')
        {
            System.out.println("Multiplication of these 2 Number is : "+first + '*'+second+'='+(first*second));
        }
        else if  (ch  == '-')
        {
            System.out.println("Subtraction of these 2 Number is : "+first + '-'+second+'='+(first-second));
        }
        else if (ch  == '/')
        {
            System.out.println("Division of these 2 Number is : "+first + '/'+second+'='+(first/second));
        }
        else
        {
            System.out.print("Please enter valid operations");
        }
    }


}

