import java.util.Scanner;

public class SalarioFuncionario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Horas trabalhadas no mês: ");
        int horasTrabalhadas = scanner.nextInt();
        
        System.out.print("Valor pago por hora: ");
        double valorPorHora = scanner.nextDouble();
        
        int horasNormais = 4 * 40;
        double salarioTotal;
        if (horasTrabalhadas <= horasNormais) {
            salarioTotal = horasTrabalhadas * valorPorHora;
        } else {
            int horasExtras = horasTrabalhadas - horasNormais;
            double valorHoraExtra = valorPorHora * 1.5;
            salarioTotal = (horasNormais * valorPorHora) + (horasExtras * valorHoraExtra);
        }
        
        System.out.printf("O salário total é: %.2f\n", salarioTotal);
        
        scanner.close();
    }
}
