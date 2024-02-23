import javax.swing.JOptionPane;
public class UsaString {
	public static void main(String[] args) {
		String s = JOptionPane.showInputDialog(
				"Digite um texto qualquer:");
		System.out.println(
				"O caractere na terceira posição da String " 
				+ s + " é: " + s.charAt(2));

	}
}