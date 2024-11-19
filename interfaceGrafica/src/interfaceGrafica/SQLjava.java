package interfaceGrafica;

public class SQLjava {
	public void conectar() {
		// 1� Java data base connection
		// 2 � servidor
		// 3 � nome da tabela
		String servidor = "jdbc:mysql://localhost:3306/JAVA";
		// login do banco de dados
		String usuario ="root";
		String senha = "";
		// Driver utilizado para conex�o
		String driver= "com.mysql.jdbc.Driver";
		//Exce��o
		try {
			// faz conex�o com o banco 
			this.connection = DriverManager.getConnection(servidor, usuario, senha);
			// cria o ambiente para executar c�digos  dentro do banco
			this.statement = this.connection.createStatement();
			System.out.println("Conex�o efetuada com sucesso");
		}catch (Exception e) {
			System.out.println("Erro: "+ e.getMessage());

		}
	}
}
