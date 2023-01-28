package br.com.clinica.model.dao;

import br.com.clinica.connectionfactory.ConnectionFactory;
import br.com.clinica.model.objetos.Consulta;
import br.com.clinica.model.objetos.Endereco;
import br.com.clinica.model.objetos.Paciente;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ConsultaDAO {

    private Connection con;

    public ConsultaDAO() {

        this.con = new ConnectionFactory().getConnection();
    }

    public void cadastrar(Consulta consulta) {
        try {

            String sql = "insert into consulta (id_paciente, id_medico, data_consulta, laudo_medico, prescricao) values (?, ?, ?, ?, ?)";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setLong(1, consulta.getPaciente().getId());
            ps.setLong(2, consulta.getMedico().getId());
            ps.setDate(3, new Date(consulta.getData().getTime()));
            ps.setString(4, consulta.getLaudoMedico());
            ps.setString(5, consulta.getPrescricao());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Consulta efetuada com sucesso!");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            e.printStackTrace();
        }
    }

    public ArrayList<Consulta> listarTodos() {
        try {
            String sql = "select c.id, p.nome as nome_paciente, p.data_nascimento,p.cpf,p.sexo,p.cidade, p.bairro, p.rua, p.numero, c.laudo_medico, c.prescricao from consulta c inner join paciente p, medico m where c.id_paciente = p.id and c.id_medico = m.id and c.id_paciente = p.id";
            Statement stm = con.createStatement();
            stm.execute(sql);
            ResultSet resultado = stm.getResultSet();

            ArrayList<Consulta> consultas = new ArrayList();

            while (resultado.next()) {

                Consulta consulta = new Consulta();
                Paciente paciente = new Paciente();
                Endereco endereco = new Endereco();

                consulta.setId(resultado.getLong("id"));
                paciente.setNome(resultado.getString("nome_paciente"));
                paciente.setDataNascimento(resultado.getDate("data_nascimento"));
                paciente.setCpf(resultado.getString("cpf"));
                paciente.setSexo(resultado.getString("sexo"));
                endereco.setCidade(resultado.getString("cidade"));
                endereco.setBairro(resultado.getString("bairro"));
                endereco.setRua(resultado.getString("rua"));
                endereco.setNumero(resultado.getInt("numero"));
                paciente.setEndereco(endereco);
                consulta.setPaciente(paciente);

                consulta.setLaudoMedico(resultado.getString("laudo_medico"));
                consulta.setPrescricao(resultado.getString("prescricao"));

                consultas.add(consulta);
            }
            return consultas;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;

    }

}
