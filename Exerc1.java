//Daniela Teixeira Abreu  RA: 4231923259;

   import java.util.Scanner;

    public class Exerc1 {
    public static void main(String[] args){
    
    double numero1, numero2, numero3, media;

    Scanner scanner = new Scanner(System.in);

    System.out.println("Informe o primeiro número:");
    numero1 = scanner.nextDouble();

    System.out.println("Informe o segundo número:");
    numero2 = scanner.nextDouble();

    System.out.println("Informe o terceiro número:");
    numero3 = scanner.nextDouble();

    scanner.close();

    if ((numero1 > numero2) && (numero1 > numero3)){
        System.out.println("Este é o maior número:" + numero1);}

        else if ((numero2 > numero1) && (numero2 > numero3)){
        System.out.println("Este é o maior número:"  + numero2);}

        else if ((numero3 > numero1) && (numero3 > numero2)){
        System.out.println("Este é o maior número:" + numero3);}

    if ((numero1 < numero2) && (numero1 < numero3)){
        System.out.println("Este é o menor número:" + numero1);}
    
        else if ((numero2 < numero1) && (numero < numero3)){
        System.out.println("Este é o menor número:"  + numero2);}
    
        else if ((numero3 < numero1) && (numero3 < numero2)){
        System.out.println("Este é o menor número:" + numero3);}

        media = (numero1 + numero2 + numero3) / 3;

        System.out.println("A média aritimética desses números é:" + media);
        





    


    }
}
