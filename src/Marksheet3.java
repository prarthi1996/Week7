import java.util.Scanner;
public  class Marksheet3 {
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
            int total = maths+eng+sci;
            double percentage = total/3;
            System.out.println("Total marks = " +total);
            System.out.println("Percentage = " +percentage);
            if (percentage >=35 && percentage<50)
            {
                System.out.println("C grade");
                System.out.println(name + "is pass.");
            }
            else if (percentage >=50 && percentage<60)
            {
                System.out.println("B grade");
                System.out.println(name + "is pass.");
            }
            else if (percentage >=60 && percentage<80)
            {
                System.out.println("A grade:");
                System.out.println(name + "is pass.");
            }
            else if (percentage >= 80 && percentage<=100)
            {
                System.out.println("A+ grade:");
                System.out.println(name + "is pass.");
            }
            else
            {
                System.out.println(name+" is Fail");
            }


        }

    }
