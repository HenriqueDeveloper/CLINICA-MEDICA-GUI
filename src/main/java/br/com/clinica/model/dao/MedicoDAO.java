package br.com.clinica.model.dao;

import br.com.clinica.connectionfactory.ConnectionFactory;
import br.com.clinica.model.objetos.Cidade;
import br.com.clinica.model.objetos.Endereco;
import br.com.clinica.model.objetos.Login;
import br.com.clinica.model.objetos.Medico;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class MedicoDAO {

    private Connection con;

    public MedicoDAO() {
        this.con = new ConnectionFactory().getConnection();
    }

    public void cadastrar(Medico medico) {
        try {
            String sql = "insert into medico (crm, especialidade, contato, nome, data_nascimento, "
                    + "cpf, sexo, uf, cep, cidade, bairro, rua, numero, email, senha) values ( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, medico.getCrm());
            ps.setString(2, medico.getEspecialidade());
            ps.setString(3, medico.getContato());
            ps.setString(4, medico.getNome());
            ps.setDate(5, new Date(medico.getDataNascimento().getTime()));
            ps.setString(6, medico.getCpf());
            ps.setString(7, medico.getSexo());
            ps.setString(8, medico.getEndereco().getUf());
            ps.setString(9, medico.getEndereco().getCep());
            ps.setString(10, medico.getEndereco().getCidade());
            ps.setString(11, medico.getEndereco().getBairro());
            ps.setString(12, medico.getEndereco().getRua());
            ps.setInt(13, medico.getEndereco().getNumero());
            ps.setString(14, medico.getLogin().getEmail());
            ps.setString(15, medico.getLogin().getSenha());
            ps.execute();
            con.close();

            JOptionPane.showMessageDialog(null, "Médico Cadastrado Com Sucesso!");

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, " Exception -> " + e);

        }
    }

    public ArrayList<Medico> listarTodos() {

        try {
            String sql = "select * from medico";

            Statement stm = con.createStatement();
            stm.execute(sql);

            ResultSet resultado = stm.getResultSet();

            ArrayList<Medico> medicos = new ArrayList();

            while (resultado.next()) {

                Medico medico = new Medico();
                Endereco endereco = new Endereco();
                Login login = new Login();

                medico.setId(resultado.getLong("id"));
                medico.setNome(resultado.getString("nome"));
                medico.setCpf(resultado.getString("cpf"));
                medico.setContato(resultado.getString("contato"));
                medico.setEspecialidade(resultado.getString("especialidade"));
                medico.setCrm(resultado.getString("crm"));
                medico.setDataNascimento(resultado.getDate("data_nascimento"));
                medico.setSexo(resultado.getString("sexo"));
                endereco.setBairro(resultado.getString("bairro"));
                endereco.setCep(resultado.getString("cep"));
                endereco.setCidade(resultado.getString("cidade"));
                endereco.setNumero(resultado.getInt("numero"));
                endereco.setRua(resultado.getString("rua"));
                endereco.setUf(resultado.getString("uf"));

                medico.setEndereco(endereco);

                medicos.add(medico);

            }

            return medicos;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, " Exception -> " + e);
            return null;
        }
    }

    public Medico listarMedicoPorEmaileSenha(Login login) {
        try {
            String sql = "select nome, email, senha from medico where email = ? and senha = ?";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, login.getEmail());
            ps.setString(2, login.getSenha());

            ResultSet resultado = ps.executeQuery();

            Medico medico = new Medico();

            if (resultado.next()) {
                login = new Login();
                medico.setNome(resultado.getString("nome"));
                login.setEmail(resultado.getString("email"));
                login.setSenha(resultado.getString("senha"));
                medico.setLogin(login);

            }

            return medico;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, " Exception -> " + e);
            return null;
        }

    }

    public void atualizar(Medico medico) {

        try {
            String sql = "update medico set crm = ?, especialidade = ?, contato = ?, nome = ?, "
                    + "data_nascimento = ?, cpf = ?, sexo = ?, uf = ?, cep = ?, cidade = ?, bairro = ?, rua = ?, numero = ?, email = ?, senha = ? where id = ?";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, medico.getCrm());
            ps.setString(2, medico.getEspecialidade());
            ps.setString(3, medico.getContato());
            ps.setString(4, medico.getNome());
            ps.setDate(5, new Date(medico.getDataNascimento().getTime()));
            ps.setString(6, medico.getCpf());
            ps.setString(7, medico.getSexo());
            ps.setString(8, medico.getEndereco().getUf());
            ps.setString(9, medico.getEndereco().getCep());
            ps.setString(10, medico.getEndereco().getCidade());
            ps.setString(11, medico.getEndereco().getBairro());
            ps.setString(12, medico.getEndereco().getRua());
            ps.setInt(13, medico.getEndereco().getNumero());
            ps.setString(14, medico.getLogin().getEmail());
            ps.setString(15, medico.getLogin().getSenha());
            ps.setLong(16, medico.getId());
            ps.execute();
            con.close();

            JOptionPane.showMessageDialog(null, "Médico Atualizado Com Sucesso!");
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, " Exception -> " + e);

        }

    }

    public void excluir(Medico medico) {
        try {
            String sql = "delete from medico where id = ?";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setLong(1, medico.getId());
            ps.execute();
            con.close();

            JOptionPane.showMessageDialog(null, "Médico Excluído Com Sucesso!");
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, " Exception -> " + e);
        }
    }

    public Medico listarPorId(long id) {
        try {
            String sql = "select * from medico where id = ? ";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setLong(1, id);

            ResultSet resultado = ps.executeQuery();

            ArrayList<Medico> medicos = new ArrayList();

            if (resultado.next()) {
                Medico medico = new Medico();
                Endereco endereco = new Endereco();
                Login login = new Login();

                medico.setNome(resultado.getString("nome"));
                medico.setCpf(resultado.getString("cpf"));
                medico.setContato(resultado.getString("contato"));
                medico.setEspecialidade(resultado.getString("especialidade"));
                medico.setCrm(resultado.getString("crm"));
                medico.setDataNascimento(resultado.getDate("data_nascimento"));
                medico.setSexo(resultado.getString("sexo"));
                endereco.setBairro(resultado.getString("bairro"));
                endereco.setCep(resultado.getString("cep"));
                endereco.setCidade(resultado.getString("cidade"));
                endereco.setNumero(resultado.getInt("numero"));
                endereco.setRua(resultado.getString("rua"));
                endereco.setUf(resultado.getString("uf"));
                login.setEmail(resultado.getString("email"));
                login.setSenha(resultado.getString("senha"));
                medico.setEndereco(endereco);
                medico.setLogin(login);

                medicos.add(medico);

                return medico;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, " Exception -> " + e);
            return null;
        }
        return null;

    }

    public Medico listarPorCPF(String cpf) {
        try {
            String sql = "select * from medico where cpf = ? ";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, cpf);

            ResultSet resultado = ps.executeQuery();

            ArrayList<Medico> medicos = new ArrayList();

            if (resultado.next()) {
                Medico medico = new Medico();
                Endereco endereco = new Endereco();
                medico.setId(resultado.getLong("id"));
                medico.setNome(resultado.getString("nome"));
                medico.setCpf(resultado.getString("cpf"));
                medico.setContato(resultado.getString("contato"));
                medico.setEspecialidade(resultado.getString("especialidade"));
                medico.setCrm(resultado.getString("crm"));
                medico.setDataNascimento(resultado.getDate("data_nascimento"));
                medico.setSexo(resultado.getString("sexo"));
                endereco.setBairro(resultado.getString("bairro"));
                endereco.setCep(resultado.getString("cep"));
                endereco.setCidade(resultado.getString("cidade"));
                endereco.setNumero(resultado.getInt("numero"));
                endereco.setRua(resultado.getString("rua"));
                endereco.setUf(resultado.getString("uf"));
                medico.setEndereco(endereco);

                medicos.add(medico);

                return medico;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, " Exception -> " + e);
            return null;
        }
        return null;

    }

    public Medico listarPorNome(String nome) {
        try {
            String sql = "select * from medico where nome = ? ";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, nome);

            ResultSet resultado = ps.executeQuery();

            ArrayList<Medico> medicos = new ArrayList();

            if (resultado.next()) {
                Medico medico = new Medico();
                Endereco endereco = new Endereco();
                medico.setId(resultado.getLong("id"));
                medico.setNome(resultado.getString("nome"));
                medico.setCpf(resultado.getString("cpf"));
                medico.setContato(resultado.getString("contato"));
                medico.setEspecialidade(resultado.getString("especialidade"));
                medico.setCrm(resultado.getString("crm"));
                medico.setDataNascimento(resultado.getDate("data_nascimento"));
                medico.setSexo(resultado.getString("sexo"));
                endereco.setBairro(resultado.getString("bairro"));
                endereco.setCep(resultado.getString("cep"));
                endereco.setCidade(resultado.getString("cidade"));
                endereco.setNumero(resultado.getInt("numero"));
                endereco.setRua(resultado.getString("rua"));
                endereco.setUf(resultado.getString("uf"));
                medico.setEndereco(endereco);

                medicos.add(medico);

                return medico;
            }
        } catch (Exception e) {
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

    public List<Medico> listarEspecialidadePorMedico(String nome) {
        try {

            String sql = "select nome from medico where especialidade = ? ";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, nome);

            ResultSet resultado = ps.executeQuery();

            List<Medico> medicos = new ArrayList<>();

            while (resultado.next()) {

                Medico medico = new Medico();
                medico.setNome(resultado.getString("nome"));
                medicos.add(medico);

            }
            return medicos;
        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, " Exception -> " + e);

            return null;
        }
    }
}
