import java.util.Scanner;

public class PassFailSubject4 {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter Name: ");
        String name= scanner.nextLine();
        System.out.println("Please enter Roll number: ");
        int rollno= scanner.nextInt();
        System.out.println("Please enter your Maths marks: ");
        int maths = scanner.nextInt();
        System.out.println("Please enter your English marks: ");
        int eng = scanner.nextInt();
        System.out.println("Please enter your Science marks: ");
        int sci = scanner.nextInt();

        if ((maths >=35) && (eng >=35) &&(sci>=35))
        {

            System.out.println(name + "is pass.");
        }
        else
        {
            System.out.println(name+" is Fail");
        }


    }

}
