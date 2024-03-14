import java.util.Scanner;

public class String {
     public static void main(String[] args) {
        // Recebendo a string do usuário
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma string: ");
        String input = scanner.nextLine();
        scanner.close();

        // Chamando o método para inverter a string
        String reversedString = reverseString(input);

        // Exibindo a string invertida
        System.out.println("String invertida: " + reversedString);
    }

    // Método para inverter a string
    public static String reverseString(String str) {
        // Converte a string para um array de caracteres
        char[] charArray = str.toCharArray();

        // Índices para início e fim do array
        int start = 0;
        int end = charArray.length - 1;

        // Invertendo os caracteres usando dois ponteiros
        while (start < end) {
            // Troca os caracteres de posição
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;

            // Movendo os ponteiros para o próximo par de caracteres
            start++;
            end--;
        }

        // Convertendo o array de caracteres de volta para uma string
        return new String(charArray);
    }
}
