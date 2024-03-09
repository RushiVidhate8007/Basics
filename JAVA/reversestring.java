import java.util.Scanner;

public class reversestring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string : ");
        String str = sc.next();
        char[] ch = str.toCharArray();
        System.out.println("before reverse "+ str);
        
        System.out.print("After reverse ");
        for(int i=ch.length-1; i>=0;i--)
        {
            System.out.print(ch[i]);
        }

    }
}
