import java.util.Scanner;

public class InverteString {

    public static void main(String[] args) {
        // Entrada de dados
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma string: ");
        String input = scanner.nextLine();
        
        // Variável para armazenar a string invertida
        String invertida = "";

        // Inverte a string manualmente
        for (int i = input.length() - 1; i >= 0; i--) {
            invertida += input.charAt(i);
        }

        // Exibe a string invertida
        System.out.println("String invertida: " + invertida);
        
        scanner.close();
    }
}
