package poo;
 
public class pessoa {
 
	private String nome;
	private int idade;
	private int passos;
	
	public pessoa(String nome, int idade, int passos) {
		this.nome = nome;
		this.idade =idade;
		this.passos = passos;
	}
	
	public String getnome() {
		return nome;
	}
	public int getidade() {
		return idade;
	}
	public int getpassos() {
		return passos;
	}
	public void setpassos() {
		this.passos = passos;
	}
	public void setnome() {
		this.nome = nome;
	}
	public void setidade() {
		this.idade = idade;
	}
 
}
