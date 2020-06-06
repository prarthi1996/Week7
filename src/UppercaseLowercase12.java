import java.util.Scanner;

public class UppercaseLowercase12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Alphabet :");
        char ch = scanner.next().charAt(0);
        int temp;
        //int temp = scanner.nextInt();
        temp = (int) ch;
        temp = temp + 32;
        ch = (char) temp;
        System.out.println(ch);
    }
}

