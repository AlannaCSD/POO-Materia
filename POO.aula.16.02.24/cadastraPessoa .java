package poo;
import java.util.Scanner;
import java.util.Random;
 
public class cadastraPessoa {
public static void main(String[]args) {
	Scanner ler = new Scanner(System.in);
    Random rand = new Random();
	System.out.println("Informe seu nome: ");
	String nome = ler.nextLine();
	System.out.println("informe sua idade: ");
	int idade = ler.nextInt();
	int passos = rand.nextInt(10)+1;
 
	pessoa cadastrar = new pessoa(nome,idade,passos);
	System.out.println("Seu nome é "+ cadastrar.getnome());
	System.out.println("Sua idade é "+ cadastrar.getidade());
	System.out.println("Você andou: "+ cadastrar.getpassos() + " passos");
}
}