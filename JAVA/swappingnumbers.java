import java.util.Scanner;
public class swappingnumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);   
        System.out.println("Enter two numbers :"); 
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();

        System.out.println("Before swapping number1 = "+number1+" number2 = "+number2);
        // int temp = number1;
        // number1 = number2;
        // number2 = temp;

        // number1 = number1 + number2;
        // number2 = number1 - number2;
        // number1 = number1 - number2;

        number1 = number1 * number2;
        number2 = number1 / number2;
        number1 = number1 / number2;


        System.out.println("After swapping number1 = "+number1+" number2 = "+number2);
        sc.close();
    }
}
