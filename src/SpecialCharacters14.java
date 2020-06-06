import java.util.Scanner;

public class SpecialCharacters14 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Alphabet :");
        char ch = scanner.next().charAt(0);
        if(( (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')))
        {
            System.out.println(ch + " is an alphabet.");
        }
        else if (ch<='0' && ch <='9')
        {
            System.out.println(ch + " is an Number.");
        }
        else
        {
            System.out.println(ch + " is an Symbol.");
        }
    }
}
