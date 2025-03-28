import java.util.Scanner;

public class MaiorValor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número: ");
        int numero1 = scanner.nextInt();
        
        System.out.print("Digite o segundo número: ");
        int numero2 = scanner.nextInt();
        
        if (numero1 > numero2) {
            System.out.println("O valor " + numero1 + " é maior do que o valor " + numero2);
        } else if (numero2 > numero1) {
            System.out.println("O valor " + numero2 + " é maior do que o valor " + numero1);
        } else {
            System.out.println("Os dois valores são iguais.");
        }
        
        scanner.close();
    }
}
