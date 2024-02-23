package poo;
import java.util.Scanner;
 
public class CadastraCarro {
 
	public static void main(String[] args) {
     Scanner ler = new Scanner(System.in);
		System.out.println("informe a marca do carro: ");
		String marca = ler.nextLine();
		System.out.println("informe o modelo do carro: ");
		String modelo= ler.nextLine();
		System.out.println("informe o ano do carro: ");
		int ano = ler.nextInt();
		ler.nextLine();
		System.out.println("informe a cor do carro: ");
		String cor = ler.nextLine();
		
        System.out.println("o carro esta ligado? (sim ou nao)");
        String ligado = ler.nextLine();
		
        System.out.println("Qual a velocidade do carro: ");
        Double velocidade = ler.nextDouble();
        
		carro cadastro = new carro(marca, modelo, ano, cor, velocidade);
		
		System.out.println("a marca do carro: " + cadastro.getmarca());
		System.out.println("o modelo do carro: " + cadastro.getmodelo());
		System.out.println("o ano do carro: " + cadastro.getano());
		System.out.println("a cor do carro: " + cadastro.getcor());
		System.out.println("o carro esta ligado" + ligado);
		
		System.out.println(cadastro.getvelocidade());
 
	}
 
}