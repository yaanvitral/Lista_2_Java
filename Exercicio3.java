//João Victor Carvalho Dimas de Oliveira RA: 4231921150;
import java.util.Scanner;

class Exercicio3 {
    double a, b, c, delta;
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Entrada dos valores dos coeficientes
        System.out.println("Digite o valor de a: ");
        double a = entrada.nextDouble();

        System.out.println("Digite o valor de b: ");
        double b = entrada.nextDouble();

        System.out.println("Digite o valor de c: ");
        double c = entrada.nextDouble();

        double delta = Math.pow(b, 2) - 4 * a * c;

         if (a == 0 && b == 0 && c != 0) {
            System.out.println("Coeficientes informados incorretamente.");
        } else if (a == 0) {
            double x = -c / b;
            System.out.println("Essa é uma equação de primeiro grau.");
            System.out.println("A raiz da equação é: " + x);
        } else if (delta < 0) {
            System.out.println("Esta equação não possui raízes reais.");
        } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.println("Esta equação possui duas raízes reais iguais.");
            System.out.println("As raízes da equação são: x1 = x2 = " + x);
        } else {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Esta equação possui duas raízes reais diferentes.");
            System.out.println("As raízes da equação são: x1 = " + x1 + " e x2 = " + x2);
        }

        entrada.close();
    }
}