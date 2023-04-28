//Marcela Maria Barbosa Ribeiro Araújo RA: 422222661;
import java.text.Format;
import java.util.Scanner;

public class Exerc4 {

    public static void main(String[] args){

        int operacao;
        double pi = 3.141592;
        double raio;
        double perimetro;
        double area;
        double volume;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Circulos e Esferas");

        System.out.println("Escolha uma das operacoes abaixo:");

        System.out.println("1.calcular o perimetro do circulo\n" + "2.calcular a area do circulo\n" + "3.calcular o volume da esfera");
        operacao = scanner.nextInt();


        switch (operacao){
            case 1:
                System.out.println("Informe o número do raio");
                raio = scanner.nextDouble();
                
                perimetro = 2 * pi * raio;
                
                System.out.printf("o resultado do perimetro do circulo é %.2f \n", perimetro);

                break;
            case 2:
                
                System.out.println("Informe o número do raio");
                raio = scanner.nextDouble();
                
                area = pi * (Math.pow(raio, 2));
                
                System.out.printf("o resultado da area do circulo é %.2f \n", area);

                break;
            case 3:
                System.out.println("Informe o número do raio");
                raio = scanner.nextDouble();
                
                volume = (4 * pi * (Math.pow(raio,3)) /3);
                
                System.out.printf("o resultado do volume da esfera é %.2f \n", volume);

                break;
            default:
                System.out.println("codigo de operacao inválido");

        scanner.close();

        }

    }

    
}
