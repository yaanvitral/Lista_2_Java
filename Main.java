//Nátali Isaltino Gomes RA: 4231925815;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
  
		// TODO Auto-generated method stub
  int operacao;
  float raio;

	Scanner leia;
	leia = new Scanner(System.in);

   System.out.println("Qual a operação que deseja realizar?\n 1 - Perímetro do círculo\n 2 - Área do círculo\n 3 - Volume da esfera");
   operacao = leia.nextInt();
      
   System.out.println("Qual o raio do círculo/esfera?");
raio = leia.nextFloat();
  if (operacao == 1){
    System.out.printf("O perímetro do círculo é: " + 2 * 3.141592 * raio);
    } else if (operacao == 2){
    System.out.printf("A área do círculo é:  "  + Math.pow(3.141592, 2) * raio);
    } else if (operacao == 3){
    System.out.printf("O volume da esfera é: " + (4 * 3.141592 * Math.pow(raio, 2))/3);
    } else {
    System.out.println("O código da operação é inválido.");
    }  
    leia.close();
    }
}