//Yan Ferreira Leite Vitral RA: 323110102;
import java.util.Random;
import java.util.Scanner;

public class Questao6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random sorteador = new Random();

        System.out.print("Digite o primeiro número: ");
        int numero = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int numero1 = scanner.nextInt();

        int menor = Math.min(numero, numero1);
        int maior = Math.max(numero, numero1);

        int sorteio = sorteador.nextInt(maior - menor + 1) + menor;

        System.out.println("O número sorteado foi: " + sorteio);

        if (sorteio % 2 == 0) {
            System.out.println("O número sorteado é par.");
        } else {
            System.out.println("O número sorteado é ímpar.");
        }
    }
}