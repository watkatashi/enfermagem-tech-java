import java.util.Scanner;

public class CalculadoraEnfermagem {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("--- SISTEMA DE APOIO À ENFERMAGEM ---");
        System.out.println("1. Calcular Gotejamento (Gotas/min)");
        System.out.println("2. Sair");
        System.out.print("Escolha uma opção: ");
        
        int opcao = entrada.nextInt();
        
        if (opcao == 1) {
            System.out.print("Digite o volume total (ml): ");
            double volume = entrada.nextDouble();
            System.out.print("Digite o tempo (horas): ");
            double tempo = entrada.nextDouble();
            
            // Fórmula: Gotas = Volume / (Tempo * 3)
            double resultado = volume / (tempo * 3);
            
            System.out.printf("O gotejamento deve ser de: %.2f gotas por minuto.\n", resultado);
        } else {
            System.out.println("Encerrando sistema...");
        }
        
        entrada.close();
    }
}
