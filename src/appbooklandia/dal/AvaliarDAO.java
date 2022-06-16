package appbooklandia.dal;

import appbooklandia.model.AvaliacoesProdutos;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AvaliarDAO implements ICrud<AvaliacoesProdutos>{
    
    private Conexao conexao;
    
    public AvaliarDAO() {
        this.conexao = new Conexao();
    }

    @Override
    public AvaliacoesProdutos recupera(String id) throws SQLException {
         // Cria a string de consulta
        String sql = "select codigoDoProduto, codigoDoCliente, nota, descricao from avaliacoes_produtos where codigoDoProduto = ?;";
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

        // Cria o objeto AvaliacoesProdutos para ser preenchido com os dados do BD
        AvaliacoesProdutos avaliacoes_produtos = new AvaliacoesProdutos();
        avaliacoes_produtos.setCodigoDoProduto(resultado.getInt("codigoDoProduto"));
        avaliacoes_produtos.setCodigoDoCliente(resultado.getString("codigoDoCliente"));
        avaliacoes_produtos.setNota(resultado.getInt("nota"));
        avaliacoes_produtos.setDescricao(resultado.getString("descricao"));

        // Fecha a conexão
        conexao.fecha();

        // Devolve o objeto chamados preenchido
        return avaliacoes_produtos;
    }

    @Override
    public void adiciona(AvaliacoesProdutos t) throws SQLException {
    }

    @Override
    public void altera(AvaliacoesProdutos t) throws SQLException {
    }

    @Override
    public void exclui(AvaliacoesProdutos t) throws SQLException {
    }
    
}
