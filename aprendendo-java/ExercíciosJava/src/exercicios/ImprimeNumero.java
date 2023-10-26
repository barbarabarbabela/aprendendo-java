package exercicios;
import java.util.Scanner;

public class ImprimeNumero {

	public static void main(String[] args) {
		//Desenvolva um algoritmo em Java que leia um número inteiro e imprima o seu antecessor e seu sucessor.
		
		Scanner lerNumero = new Scanner(System.in); //instanciando e criando o objeto scanner
		
		System.out.println("Digite um número inteiro: ");
		int numero = lerNumero.nextInt();
		int numeroSucessor = numero + 1;
		int numeroAntecessor = numero -1;
		
		System.out.println("O número antecessor de " + numero + " é " + numeroAntecessor);
		System.out.println("O número sucessor de " + numero + " é " + numeroSucessor);
	}
}
