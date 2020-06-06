import java.util.Scanner;

public class Swap2Numbers5 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of A:");
        int A = scanner.nextInt();
        System.out.print("Enter the value ofB:");
        int B= scanner.nextInt();
        int Swap;
        int P=0;
        int Swap2;
        Swap=(A!=B)? B:A;
       // System.out.printlnSwap);
        Swap2=(B!=A)? A:B;
        System.out.println("After Interchanging: Value of A:" +Swap);
        System.out.println("After Interchanging: Value of B:" +Swap2);
        // A=A+B;
            //B=B-A;
            //A=A-B;
            //System.out.println();



    }
}
