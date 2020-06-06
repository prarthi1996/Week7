import java.util.Scanner;

public class Average7 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 1st number:");
        float a = scanner.nextFloat();
        System.out.print("Enter 2nd number:");
        float b = scanner.nextFloat();
        System.out.print("Enter 3th number:");
        float c = scanner.nextFloat();
        System.out.print("Enter 4th number:");
        float d = scanner.nextFloat();
        System.out.print("Enter 5th number:");
        float  e = scanner.nextFloat();
        float average =(a+b+c+d+e)/5;
        System.out.println(average + "is the calculate average of 5 numbers");


    }
}
