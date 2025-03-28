import java.util.Scanner;

public class Uni4Exe07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o peso da carta em gramas: ");
        int peso = scanner.nextInt();
        
        double custo = 0.45; // Custo inicial para cartas até 50 gramas
        
        if (peso > 50) {
            // Calcula o número de frações de 20 gramas acima de 50 gramas
            int excesso = peso - 50;
            int adicionais = (int) Math.ceil(excesso / 20.0); // Arredonda para cima para frações
            
            // Cada fração adicional de 20 gramas custa R$ 0,45
            custo += adicionais * 0.45;
        }
        
        System.out.printf("Custo do selo: R$ %.4f\n", custo);
        
        scanner.close();
    }
}
