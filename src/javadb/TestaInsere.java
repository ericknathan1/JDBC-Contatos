package javadb;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class TestaInsere {
	public static void main(String[] args) throws SQLException {
//		
		Contato c1 = new Contato("Tung Tung Tung Sahur","tung@sahur.com","rua brainroot");
		ContatoDAO cDAO = new ContatoDAO();
		
		cDAO.inserir(c1);
	}
}
