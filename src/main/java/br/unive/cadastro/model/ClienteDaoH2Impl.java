package br.unive.cadastro.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class ClienteDaoH2Impl implements ClienteDao {

	private static Connection con;

	private Connection getConnection() throws SQLException {

		synchronized (con) {
			if (con == null) {
				abrirConexao();
				inserir(null);
				atualizar(null);
				excluir(null);
				buscar(0);
				buscaPorExemplo(null);
				listar();
				fecharConexao();
				
			}
			return con;
		}
	}

	private void abrirConexao() throws SQLException {

		String url = "jdbc:h2:./cadastroh2";
		String user = "sa";
		String pass = "sa";
		con = DriverManager.getConnection(url, user, pass);

	}

	public void inserir(Cliente c) {

		String sql = "INSERT INTO....";
		try (PreparedStatement ps = getConnection().prepareStatement(sql)) {

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void atualizar(Cliente c) {
		String sql = "UPDATE PESSOA SET ID = ?, NOME = ? WHERE ID = ?";
	}

	public void excluir(Cliente c) {
		String sql = "DELETE FROM PESSOA WHERE ID = ?";
	}

	public Cliente buscar(int id) {
		return null;
	}

	public Cliente buscaPorExemplo(Cliente c) {
		return null;
	}

	public List<Cliente> listar() {
		return null;
	}

	private void fecharConexao() throws SQLException {
		con.close();
	}
	
public static void main(String[] args) {
		
		new ClienteDaoH2Impl();
	}
	
}

