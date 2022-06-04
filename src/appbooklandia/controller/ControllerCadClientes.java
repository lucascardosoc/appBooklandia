package appbooklandia.controller;

import appbooklandia.dal.ClienteDAO;
import appbooklandia.model.*;
import appbooklandia.view.FrmCadClientes;
import java.time.LocalDate;
import java.util.Arrays;
import java.sql.SQLException;

public class ControllerCadClientes {

    private FrmCadClientes view;

    public ControllerCadClientes(FrmCadClientes view) {
        this.view = view;
    }

    public void consultaCliente() throws SQLException {

        String cpf = view.getTxtCpf().getText();

        ClienteDAO clienteDao = new ClienteDAO();
        Cliente cliente = clienteDao.recupera(cpf);

        if (cliente != null) {
            view.getTxtNome().setText(cliente.getNome());
            view.getTxtEndereco().setText(cliente.getEndereco());
            view.getTxtTelefone().setText(cliente.getTelefone());
        }

    }

    public void cadastraCliente() throws SQLException {
        Cliente c = new Cliente();
        c.setNome(view.getTxtNome().getText());
        c.setEndereco(view.getTxtEndereco().getText());
        c.setCpf(view.getTxtCpf().getText());
        c.setTelefone(view.getTxtTelefone().getText());
        c.setDataDeCadastro(LocalDate.now());

        ClienteDAO clienteDao = new ClienteDAO();
        clienteDao.adiciona(c);

        Login log = new Login();
        log.setEmail(view.getTxtEmail().getText());
        log.setSenha(Arrays.toString(view.getTxtSenha().getPassword()));
        log.setNivelDeAcesso(NivelDeAcesso.Cliente);
        log.setStatus(true);
    }

    public void atualizaCliente() throws SQLException {
        Cliente c = new Cliente();
        c.setNome(view.getTxtNome().getText());
        c.setEndereco(view.getTxtEndereco().getText());
        c.setCpf(view.getTxtCpf().getText());
        c.setTelefone(view.getTxtTelefone().getText());
        c.setDataDeCadastro(LocalDate.now());

        ClienteDAO clienteDao = new ClienteDAO();
        clienteDao.altera(c);
    }

    public void apagaCliente() throws SQLException {
        Cliente c = new Cliente();
        c.setNome(view.getTxtNome().getText());
        c.setEndereco(view.getTxtEndereco().getText());
        c.setCpf(view.getTxtCpf().getText());
        c.setTelefone(view.getTxtTelefone().getText());
        c.setDataDeCadastro(LocalDate.now());

        ClienteDAO clienteDao = new ClienteDAO();
        clienteDao.exclui(c);
    }

    public void limpaTela() {
        view.getTxtCpf().setText("");
        view.getTxtNome().setText("");
        view.getTxtEmail().setText("");
        view.getTxtSenha().setText("");
        view.getTxtTelefone().setText("");
        view.getTxtEndereco().setText("");
    }

}
