import java.util.Scanner;

public class Uni4Exe06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um caractere: ");
        char letra = scanner.next().toUpperCase().charAt(0); // Converte para maiúscula
        
        switch (letra) {
            case 'M':
                System.out.println("Masculino");
                break;
            case 'F':
                System.out.println("Feminino");
                break;
            case 'I':
                System.out.println("Não Informado");
                break;
            default:
                System.out.println("Entrada Incorreta");
                break;
        }
        
        scanner.close();
    }
}
