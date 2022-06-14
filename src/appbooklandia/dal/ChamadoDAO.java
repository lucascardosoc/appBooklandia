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
    }

    @Override
    public void altera(Chamados t) throws SQLException {
    }

    @Override
    public void exclui(Chamados t) throws SQLException {
    }

}
