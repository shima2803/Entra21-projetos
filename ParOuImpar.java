import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número inteiro maior que 0: ");
        int numero = scanner.nextInt();
        
        if (numero > 0) {
            if (numero % 2 == 0) {
                System.out.println("Número é par");
            } else {
                System.out.println("Número é ímpar");
            }
        } else {
            System.out.println("Por favor, insira um número maior que 0.");
        }
        
        scanner.close();
    }
}
