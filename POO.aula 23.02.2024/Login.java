import javax.swing.JOptionPane;
public class Login {
	public static void main(String[] args) {
		String user = "Marcos";
		String password = "Tricolor";
		String login = JOptionPane.showInputDialog(
			"Digite o Login:");
		String senha = JOptionPane.showInputDialog(
				"Digite a Senha:");
		if(user.equalsIgnoreCase(login) && password.equals(senha))
			System.out.println("Seja bem-vindo: " + login);
		else
			System.out.println("Usuário ou Senha inválidos! Tente novamente.");
	}
}