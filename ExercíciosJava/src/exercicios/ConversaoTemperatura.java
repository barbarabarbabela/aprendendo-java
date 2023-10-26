package exercicios;
import java.util.Scanner;

public class ConversaoTemperatura {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in); //instanciando e criando o objeto scanner

		System.out.printf("Informe um valor em Fahrenheit:\n");
		double fahrenheit = ler.nextDouble();
		
		double celsius = (5*(fahrenheit-32))/9;
		String resultado = String.format("%.2f", celsius) ; 
		
		System.out.println("O valor em Celsius é: " + resultado);
		
	}

}