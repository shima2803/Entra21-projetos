import java.util.Scanner;

public class CasasDecimais {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número maior que 0: ");
        float numero = scanner.nextFloat();
        
        if (numero > 0) {
            if (numero % 1 != 0) {
                System.out.println("Casas decimais foram digitadas.");
            } else {
                System.out.println("Casas decimais não foram digitadas.");
            }
        } else {
            System.out.println("Por favor, insira um número maior que 0.");
        }
        
        scanner.close();
    }
}
