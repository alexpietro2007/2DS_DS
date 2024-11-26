import java.awt.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class Sql {
	private Connection connection = null;
				// gerencia as consultas com o banco de dados
				private Statement statement = null;
				// armazena as irfomações vindo de um select.
				private ResultSet resultset = null;
				// 1º Java data base connection
				// 2 º servidor
				// 3 º nome da tabela
				String servidor = "jdbc:mysql://localhost:3306/JAVA";
				// login do banco de dados
				String usuario ="root";
				String senha = "";
				// Driver utilizado para conexão
				String driver= "com.mysql.jdbc.Driver";
				//Exceção
				try {
					// faz conexão com o banco 
					this.connection = DriverManager.getConnection(servidor, usuario, senha);
					// cria o ambiente para executar códigos  dentro do banco
					this.statement = this.connection.createStatement();
					System.out.println("Conexão efetuada com sucesso");
				}catch (Exception e) {
					System.out.println("Erro: "+ e.getMessage());

				}
				// gerencia a conexão com o banco de dados 
				public ResultSet listarAmigos() {

					try {
					String query = "select * from amigo";
					this.resultset =this.statement.executeQuery(query);
				}catch (Exception e) {
					 System.out.println("Erro: "+ e.getMessage());
					}
					return resultset;
				}

				//DELETAR CONTATOS 
			public void deletarContatos(String id ) {
							try {
								String query = "delete from amigo where id_amigo = '"+id+"'";
								System.out.println(this.statement.executeUpdate(query));

							}catch(Exception e) {
								System.out.println("Erro :"+e.getMessage());
							}

						}

			 
			// ATUALIZAR CONTATOS 
			public void atualizarContato(String id, String nome, String apelido, String telefone) {
							try {
								String query = "update amigo set nome ='"+nome+"', "
										+ "apelido = '"+apelido+"', telefone ='"+telefone+"' "
										+ "where id_amigo ='"+id+"'";
								System.out.println(this.statement.executeUpdate(query));
							}catch(Exception e) {
								System.out.println("Erro :"+e.getMessage());
							}

						}

			}
				
}
}
