package javadb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ContatoDAO {
	private Connection con;
	
	public ContatoDAO() throws SQLException {
		this.con = ConnectionFactory.getConnection();
	}
	
	
	public void inserir(Contato c) throws SQLException {
		String insert = "INSERT INTO contatos(nome,email,endereco) values (?,?,?)";
		PreparedStatement stmt = con.prepareStatement(insert);
		stmt.setString(1, c.getNome());
		stmt.setString(2, c.getEmail());
		stmt.setString(3, c.getEndereco());
		stmt.execute();
		stmt.close();
		System.out.println("Gravação feita com sucesso");
		con.close();
	}
	
}
