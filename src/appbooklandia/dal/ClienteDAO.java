package appbooklandia.dal;

import appbooklandia.model.Cliente;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Date;

public class ClienteDAO implements ICrud<Cliente> {

    private Conexao conexao;

    public ClienteDAO() {
        this.conexao = new Conexao();
    }

    @Override
    public Cliente recupera(String id) throws SQLException {
        // Cria a string de consulta
        String sql = "select cpf, nome, endereco, telefone, dataDeCadastro from clientes where cpf = ?;";
        // Cria a declaracão sql
        PreparedStatement ps = conexao.getConexao().prepareStatement(sql);
        // Inclui o parâmetro da consulta na declaracão sql
        ps.setString(1, id);
        // Executa a consulta no BD
        ps.execute();

        // Recupera os dados do BD
        ResultSet resultado = ps.getResultSet();
        // Move o cursor do BD para a próxima linha (1a linha da tabela)
        resultado.next();

        // Cria o objeto cliente para ser preenchido com os dados do BD
        Cliente c = new Cliente();
        c.setCpf(resultado.getString("cpf"));
        c.setNome(resultado.getString("nome"));
        c.setTelefone(resultado.getString("telefone"));
        c.setEndereco(resultado.getString("endereco"));
        c.setDataDeCadastro(resultado.getDate("dataDeCadastro").toLocalDate());

        // Fecha a conexão
        conexao.fecha();

        // Devolve o objeto cliente preenchido
        return c;
    }

    @Override
    public void adiciona(Cliente t) throws SQLException {
        // String sql
        String sql = "insert into clientes (cpf, nome, telefone, endereco, dataDeCadastro) values(?, ?, ?, ?, ?);";
        PreparedStatement ps = conexao.getConexao().prepareStatement(sql);
        ps.setString(1, t.getCpf());
        ps.setString(2, t.getNome());
        ps.setString(3, t.getTelefone());
        ps.setString(4, t.getEndereco());
        ps.setDate(5, Date.valueOf(t.getDataDeCadastro()));
        ps.execute();
        conexao.fecha();
    }

    @Override
    public void altera(Cliente t) throws SQLException {
        //String sql
        String sql = "update clientes set nome = ?, telefone = ?, endereco = ?, dataDeCadastro = ? where cpf = ?;";
        PreparedStatement ps = conexao.getConexao().prepareStatement(sql);
        ps.setString(1, t.getNome());
        ps.setString(2, t.getTelefone());
        ps.setString(3, t.getEndereco());
        ps.setDate(4, Date.valueOf(t.getDataDeCadastro()));
        ps.setString(5, t.getCpf());
        ps.execute();
        conexao.fecha();
    }

    @Override
    public void exclui(Cliente t) throws SQLException {
        //String sql
        String sql = "delete from clientes where cpf = ?;";
        PreparedStatement ps = conexao.getConexao().prepareStatement(sql);
        ps.setString(1, t.getCpf());
        ps.execute();
        conexao.fecha();
    }

}
