import java.io.IOException;
import java.util.Scanner;


public class Main {
 
    public static void main(String[] args) throws IOException {
        System.out.println("quanl é o numero A?");
        int num = new Scanner(System.in).nextInt();
        System.out.println("qual o valor de B?");
        int num2 = new Scanner(System.in).nextInt();
        int x = (num + num2 );
        System.out.println("x = " + x);
    }
    
}