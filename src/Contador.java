import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {

        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int parametroUm = terminal.nextInt();

        System.out.println("\nAgora digite outro número inteiro, que seja maior que o anterior: ");
        int parametroDois = terminal.nextInt();

        try {
            contar(parametroUm, parametroDois);
        } catch (Exception e ) {
            System.out.println("\nO primeiro parâmetro deve ser menor que o segundo.");
        }

        terminal.close();
    
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // Valida se o primeiro parâmetro é menor que o segundo:
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();
        }
        
        // Realiza o for para imprimir a contagem:
        System.out.println("\nIniciando a contagem de " + parametroUm + " até " + parametroDois + "...\n");
        for (int i = parametroUm; i <= parametroDois; i++) {
            System.out.println(i);
        }
    }
}
