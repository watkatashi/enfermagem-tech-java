import java.util.Scanner;

public class CalculadoraEnfermagem {

    public static void main(String[] args) {
        // Criando o leitor para pegar o que o usuário digitar
        Scanner leitor = new Scanner(System.in);

        System.out.println("------------------------------------------");
        System.out.println("  SISTEMA DE APOIO À ENFERMAGEM - v1.0  ");
        System.out.println("------------------------------------------");
        System.out.println("1. Calcular Gotejamento (Gotas/min)");
        System.out.println("2. Sair do programa");
        System.out.print("O que você deseja fazer? ");

        int escolha = leitor.nextInt();

        if (escolha == 1) {
            System.out.println("\n--- Calculando Gotas por Minuto ---");
            
            System.out.print("Digite o volume total (ml): ");
            double volumeInformado = leitor.nextDouble();

            System.out.print("Digite em quantas horas deve correr: ");
            double tempoHoras = leitor.nextDouble();

            // Minha fórmula: Gotas = Volume / (Tempo * 3)
            // Dividi por 3 porque é a regra para gotas/hora
            double resultadoFinal = volumeInformado / (tempoHoras * 3);

            System.out.println("\n------------------------------------------");
            System.out.printf("O resultado deu: %.2f gotas por minuto.\n", resultadoFinal);
            System.out.println("------------------------------------------");
            
        } else {
            System.out.println("Finalizando... Até a próxima!");
        }

        leitor.close();
    }
}
