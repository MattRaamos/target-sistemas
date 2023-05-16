import java.util.Scanner;

public class InverteString {
    public static String inverteString(String input) {
        char[] chars = input.toCharArray();
        //primeiro indice
        int esquerda = 0;
        //ultimo indice
        int direita = chars.length - 1;

        while (esquerda < direita){
            char temp = chars[esquerda];
            chars[esquerda] = chars[direita];
            chars[direita] = temp;
            esquerda++;
            direita--;
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println("Digite uma frase para ser invertida: ");
        String input = tec.nextLine();
        String inverteString = inverteString(input);

        System.out.println("Essa e a string original: " + input);
        System.out.println("Essa e a string invertida: " + inverteString);
    }
}
