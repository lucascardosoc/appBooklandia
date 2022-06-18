package appbooklandia.dal;

import appbooklandia.model.Funcionario;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FuncionarioDAO implements ICrud<Funcionario> {

    private Conexao conexao;

    public FuncionarioDAO() {
        this.conexao = new Conexao();
    }

    @Override
    public Funcionario recupera(String id) throws SQLException {
        // Cria a string de consulta
        String sql = "select matricula, nome, dataDeAdmissao, cargo, salario from funcionarios where matricula = ?;";
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

        // Cria o objeto funcionario para ser preenchido com os dados do BD
        Funcionario funcionario = new Funcionario();
        funcionario.setMatricula(resultado.getInt("matricula"));
        funcionario.setNome(resultado.getString("nome"));
        funcionario.setDataDeAdmissao(resultado.getDate("dataDeAdmissao").toLocalDate());
        funcionario.setCargo(resultado.getString("cargo"));
        funcionario.setSalario(resultado.getDouble("salario"));

        // Fecha a conexão
        conexao.fecha();

        // Devolve o objeto chamados preenchido
        return funcionario;
    }

    @Override
    public void adiciona(Funcionario t) throws SQLException {
        // String sql
        String sql = "insert into funcionarios (matricula, nome, dataDeAdmissao, cargo, salario) values(?, ?, ?, ?, ?);";
        PreparedStatement ps = conexao.getConexao().prepareStatement(sql);
        ps.setInt(1, t.getMatricula());
        ps.setString(2, t.getNome());
        ps.setDate(3, Date.valueOf(t.getDataDeAdmissao()));
        ps.setString(4, t.getCargo());
        ps.setDouble(5, t.getSalario());

        ps.execute();
        conexao.fecha();
    }

    @Override
    public void altera(Funcionario t) throws SQLException {
        //String sql
        String sql = "update funcionarios set nome = ?, dataDeAdmissao = ?, cargo = ?, salario = ? where matricula = ?;";
        PreparedStatement ps = conexao.getConexao().prepareStatement(sql);
        ps.setString(1, t.getNome());
        ps.setDate(2, Date.valueOf(t.getDataDeAdmissao()));
        ps.setString(3, t.getCargo());
        ps.setDouble(4, t.getSalario());
        ps.setInt(5, t.getMatricula());

        ps.execute();
        conexao.fecha();
    }

    @Override
    public void exclui(Funcionario t) throws SQLException {
        //String sql
        String sql = "delete from funcionarios where matricula = ?;";
        PreparedStatement ps = conexao.getConexao().prepareStatement(sql);
        ps.setInt(1, t.getMatricula());
        ps.execute();
        conexao.fecha();
    }

}
