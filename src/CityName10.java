import java.util.Scanner;

public class CityName10 {
    //private static String a;


    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Alphabet :");
        char ch = scanner.next().charAt(0);

        if (ch  == 'a')
        {
                    System.out.print("Amritsar");
        }
         else if (ch  == 'b')
        {
            System.out.print("Bhavnagar");
        }
        else if (ch  == 'c')
        {
            System.out.print("Chennai");
        }
       else if (ch  == 'd')
        {
            System.out.print("Dehradun");
        }
        else if (ch  == 'e')
        {
            System.out.print("Ellora");
        }
        else
        {
            System.out.print("Invalid Entry");
        }






    }
}

