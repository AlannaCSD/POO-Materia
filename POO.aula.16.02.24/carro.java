package poo;
public class carro {
 
	private String marca;
	private String modelo;
	private int ano;
	private String cor;
	private double velocidade;
	
	public carro(String marca,String modelo,int ano,String cor,Double velocidade) {
		this.marca=marca;
		this.modelo=modelo;
		this.ano=ano;
		this.cor=cor;
		this.velocidade=velocidade;
 
	}
	public Double getvelocidade() {
		return velocidade;
	}		
 
		public String getmarca() {
			return marca;
		}
		public String getmodelo() {
			return modelo;
		}
		public int getano() {
			return ano;
		}
		public String getcor() {
			return cor;
		}		
		public void setmarca() {
			this.marca = marca;
		}
		public void setmodelo() {
			this.modelo = modelo;
		}
		public void setano() {
			this.ano = ano;
		}
		public void setcor() {
			this.cor = cor;
		}
		public void setvelocidade() {
			this.velocidade = velocidade;
			
			if(velocidade >= 0 && velocidade < 20) {
				System.out.println("Marcha igual a 1");
			}if(velocidade >= 21 && velocidade < 40) {
				System.out.println("Marcha igual a 2");
			}if(velocidade >= 41 && velocidade < 60) {
				System.out.println("Marcha igual a 3");
			}if(velocidade >= 61 && velocidade < 80) {
				System.out.println("Marcha igual a 4");
			}if(velocidade > 80) {
				System.out.println("Marcha igual a 5");
			}
		}
	}
 