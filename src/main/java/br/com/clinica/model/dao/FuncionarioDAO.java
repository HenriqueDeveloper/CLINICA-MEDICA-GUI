package br.com.clinica.model.dao;

import br.com.clinica.connectionfactory.ConnectionFactory;
import br.com.clinica.model.objetos.Cidade;
import br.com.clinica.model.objetos.Endereco;
import br.com.clinica.model.objetos.Funcionario;
import br.com.clinica.model.objetos.Login;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Henrique
 */
public class FuncionarioDAO {

    private Connection con;

    public FuncionarioDAO() {

        con = new ConnectionFactory().getConnection();

    }

    public void cadastrar(Funcionario funcionario) {

        try {
            String sql = "insert into funcionario ( nome, data_nascimento, cpf, sexo, uf, cep, cidade, bairro, rua, numero, email, senha, telefone) "
                    + "values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) ";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, funcionario.getNome());
            ps.setDate(2, new Date(funcionario.getDataNascimento().getTime()));
            ps.setString(3, funcionario.getCpf());
            ps.setString(4, funcionario.getSexo());
            ps.setString(5, funcionario.getEndereco().getUf());
            ps.setString(6, funcionario.getEndereco().getCep());
            ps.setString(7, funcionario.getEndereco().getCidade());
            ps.setString(8, funcionario.getEndereco().getBairro());
            ps.setString(9, funcionario.getEndereco().getRua());
            ps.setInt(10, funcionario.getEndereco().getNumero());
            ps.setString(11, funcionario.getLogin().getEmail());
            ps.setString(12, funcionario.getLogin().getSenha());
            ps.setString(13, funcionario.getTelefone());

            ps.execute();
            con.close();

            JOptionPane.showMessageDialog(null, "Funcionário cadastardo com sucesso!");

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, " Exception -> " + e);

        }

    }

    public ArrayList<Funcionario> listarTodos() {
        try {
            String sql = "select * from funcionario";

            Statement stm = con.createStatement();
            stm.execute(sql);

            ResultSet resultado = stm.getResultSet();

            ArrayList<Funcionario> funcionarios = new ArrayList();

            while (resultado.next()) {

                Endereco endereco = new Endereco();
                Login login = new Login();
                Funcionario funcionario = new Funcionario();

                funcionario.setId(resultado.getLong("ID"));
                funcionario.setNome(resultado.getString("nome"));
                funcionario.setDataNascimento(resultado.getDate("data_nascimento"));
                funcionario.setSexo(resultado.getString("sexo"));
                funcionario.setCpf(resultado.getString("cpf"));
                endereco.setUf(resultado.getString("uf"));
                endereco.setCep(resultado.getString("cep"));
                endereco.setCidade(resultado.getString("cidade"));
                endereco.setBairro(resultado.getString("bairro"));
                endereco.setRua(resultado.getString("rua"));
                endereco.setNumero(resultado.getInt("numero"));
                login.setEmail(resultado.getString("email"));
                login.setSenha(resultado.getString("senha"));
                funcionario.setTelefone(resultado.getString("telefone"));
                funcionario.setEndereco(endereco);
                funcionario.setLogin(login);

                funcionarios.add(funcionario);

            }

            return funcionarios;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, " Exception -> " + e);
            return null;
        }

    }

    public Funcionario listarFuncionarioPorEmaileSenha(Login login) {
        try {
            String sql = "select nome, email, senha from funcionario where email = ? and senha = ?";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, login.getEmail());
            ps.setString(2, login.getSenha());

            ResultSet resultado = ps.executeQuery();

            Funcionario funcionario = new Funcionario();

            if (resultado.next()) {
                login = new Login();

                funcionario.setNome(resultado.getString("nome"));
                login.setEmail(resultado.getString("email"));
                login.setSenha(resultado.getString("senha"));
                funcionario.setLogin(login);

            }

            return funcionario;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, " Exception -> " + e);
            return null;
        }

    }

    public void atualizar(Funcionario funcionario) {
        try {

            String sql = "update funcionario set nome = ?, data_nascimento = ?, sexo = ?, cpf = ?, "
                    + "uf = ?, cep = ?, cidade = ?, bairro = ?, rua = ?, numero = ?, email = ?, senha = ?, telefone = ? where id = ? ";

            PreparedStatement ps = con.prepareStatement(sql);
            Endereco endereco = funcionario.getEndereco();

            ps.setString(1, funcionario.getNome());
            ps.setDate(2, new Date(funcionario.getDataNascimento().getTime()));
            ps.setString(3, funcionario.getSexo());
            ps.setString(4, funcionario.getCpf());
            ps.setString(5, endereco.getUf());
            ps.setString(6, endereco.getCep());
            ps.setString(7, endereco.getCidade());
            ps.setString(8, endereco.getBairro());
            ps.setString(9, endereco.getRua());
            ps.setInt(10, endereco.getNumero());
            ps.setString(11, funcionario.getLogin().getEmail());
            ps.setString(12, funcionario.getLogin().getSenha());
            ps.setString(13, funcionario.getTelefone());
            ps.setLong(14, funcionario.getId());
            ps.execute();
            con.close();

            JOptionPane.showMessageDialog(null, "Funcionário atualizado com sucesso!");

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, " Exception -> " + e);
            System.out.println(e);
        }
    }

    public void excluir(Funcionario funcionario) {
        try {

            String sql = "delete from funcionario where id = ?";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setLong(1, funcionario.getId());
            ps.execute();
            con.close();

            JOptionPane.showMessageDialog(null, "Funcionário excluido com sucesso!");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Exception -> " + e);
        }

    }

    public Funcionario listarPorId(long id) {
        try {

            String sql = "select * from funcionario where id = ? ";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setLong(1, id);

            ResultSet resultado = ps.executeQuery();

            ArrayList<Funcionario> funcionarios = new ArrayList();

            while (resultado.next()) {
                Endereco endereco = new Endereco();
                Login login = new Login();
                Funcionario funcionario = new Funcionario();
                funcionario.setId(resultado.getLong("id"));
                funcionario.setNome(resultado.getString("nome"));
                funcionario.setDataNascimento(resultado.getDate("data_nascimento"));
                funcionario.setSexo(resultado.getString("sexo"));
                funcionario.setCpf(resultado.getString("cpf"));
                endereco.setUf(resultado.getString("uf"));
                endereco.setCep(resultado.getString("cep"));
                endereco.setCidade(resultado.getString("cidade"));
                endereco.setBairro(resultado.getString("bairro"));
                endereco.setRua(resultado.getString("rua"));
                endereco.setNumero(resultado.getInt("numero"));
                login.setEmail(resultado.getString("email"));
                login.setSenha(resultado.getString("senha"));
                funcionario.setTelefone(resultado.getString("telefone"));
                funcionario.setEndereco(endereco);
                funcionario.setLogin(login);

                funcionarios.add(funcionario);

                return funcionario;

            }

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, " Exception -> " + e);

            return null;
        }
        return null;
    }

    public Funcionario listarPorCPF(String cpf) {
        try {

            String sql = "select * from funcionario where cpf = ? ";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, cpf);

            ResultSet resultado = ps.executeQuery();

            ArrayList<Funcionario> funcionarios = new ArrayList();

            while (resultado.next()) {
                Endereco endereco = new Endereco();
                Login login = new Login();
                Funcionario funcionario = new Funcionario();
                funcionario.setId(resultado.getLong("id"));
                funcionario.setNome(resultado.getString("nome"));
                funcionario.setDataNascimento(resultado.getDate("data_nascimento"));
                funcionario.setSexo(resultado.getString("sexo"));
                funcionario.setCpf(resultado.getString("cpf"));
                endereco.setUf(resultado.getString("uf"));
                endereco.setCep(resultado.getString("cep"));
                endereco.setCidade(resultado.getString("cidade"));
                endereco.setBairro(resultado.getString("bairro"));
                endereco.setRua(resultado.getString("rua"));
                endereco.setNumero(resultado.getInt("numero"));
                login.setEmail(resultado.getString("email"));
                login.setSenha(resultado.getString("senha"));
                funcionario.setTelefone(resultado.getString("telefone"));
                funcionario.setEndereco(endereco);
                funcionario.setLogin(login);
                funcionarios.add(funcionario);

                return funcionario;
            }

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, " Exception -> " + e);

            return null;
        }
        return null;
    }

    public ArrayList<Cidade> listarCidadesPorUF(String uf) {
        try {

            String sql = "select cidade from cidades where estado = ? ";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, uf);

            ResultSet resultado = ps.executeQuery();

            ArrayList<Cidade> cidades = new ArrayList();

            while (resultado.next()) {

                Cidade cidade = new Cidade();
                cidade.setCidade(resultado.getString("cidade"));

                cidades.add(cidade);

            }

            return cidades;

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, " Exception -> " + e);

            return null;
        }
    }

}
