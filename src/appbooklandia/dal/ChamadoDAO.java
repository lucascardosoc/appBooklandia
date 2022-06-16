package appbooklandia.dal;

import appbooklandia.model.Chamados;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class ChamadoDAO implements ICrud<Chamados> {

    private Conexao conexao;

    public ChamadoDAO() {
        this.conexao = new Conexao();
    }

    @Override
    public Chamados recupera(String id) throws SQLException {
        // Cria a string de consulta
        String sql = "select ticket, codigoDoFuncionario, codigoDoCliente, codigoDoPedido, descricao from chamados where ticket = ?;";
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

        // Cria o objeto chamados para ser preenchido com os dados do BD
        Chamados chamados = new Chamados();
        chamados.setTicket(resultado.getInt("ticket"));
        chamados.setCodigoDoFuncionario(resultado.getInt("codigoDoFuncionario"));
        chamados.setCodigoDoCliente(resultado.getString("codigoDoCliente"));
        chamados.setCodigoDoPedido(resultado.getInt("codigoDoPedido"));
        chamados.setDescricao(resultado.getString("descricao"));

        // Fecha a conexão
        conexao.fecha();

        // Devolve o objeto chamados preenchido
        return chamados;
    }

    @Override
    public void adiciona(Chamados t) throws SQLException {
        // String sql
        String sql = "insert into chamados (ticket, codigoDoFuncionario, codigoDoCliente, codigoDoPedido, descricao) values(?, ?, ?, ?, ?);";
        PreparedStatement ps = conexao.getConexao().prepareStatement(sql);
        ps.setInt(1, t.getTicket());
        ps.setInt(2, t.getCodigoDoFuncionario());
        ps.setString(3, t.getCodigoDoCliente());
        ps.setInt(4, t.getCodigoDoPedido());
        ps.setString(5, t.getDescricao());
        ps.execute();
        conexao.fecha();
    }

    @Override
    public void altera(Chamados t) throws SQLException {
        //String sql
        String sql = "update chamados set codigoDoFuncionario = ?, codigoDoCliente = ?, codigoDoPedido = ?, descricao = ? where ticket = ?;";
        PreparedStatement ps = conexao.getConexao().prepareStatement(sql);
        ps.setInt(1, t.getCodigoDoFuncionario());
        ps.setString(2, t.getCodigoDoCliente());
        ps.setInt(3, t.getCodigoDoPedido());
        ps.setString(4, t.getDescricao());
        ps.setInt(5, t.getTicket());
        ps.execute();
        conexao.fecha();
    }

    @Override
    public void exclui(Chamados t) throws SQLException {
        //String sql
        String sql = "delete from chamados where ticket = ?;";
        PreparedStatement ps = conexao.getConexao().prepareStatement(sql);
        ps.setInt(1, t.getTicket());
        ps.execute();
        conexao.fecha();
    }

}
