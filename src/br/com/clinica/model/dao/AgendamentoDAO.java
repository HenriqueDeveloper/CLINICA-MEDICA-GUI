package br.com.clinica.model.dao;

import br.com.clinica.connectionfactory.ConnectionFactory;
import br.com.clinica.model.objetos.Medico;
import br.com.clinica.model.objetos.Agendamento;
import br.com.clinica.model.objetos.Paciente;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class AgendamentoDAO {

    private Connection con;

    public AgendamentoDAO() {

        this.con = new ConnectionFactory().getConnection();
    }

    public void cadastrar(Agendamento agendamento) {

        try {
            String sql = "insert into agendamento (id_paciente, id_medico, data_consulta, horario, situacao_pagamento) "
                    + "values (?, ?, ?, ?, ?) ";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setLong(1, agendamento.getPaciente().getId());
            ps.setLong(2, agendamento.getMedico().getId());
            ps.setDate(3, new Date(agendamento.getData().getTime()));
            ps.setString(4, agendamento.getHorario());
            ps.setString(5, "Aguardando");

            ps.execute();
            con.close();

            JOptionPane.showMessageDialog(null, "Agendamento efetuado com sucesso!");

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, " Exception -> " + e);
            e.printStackTrace();

        }

    }

    public ArrayList<Agendamento> listarTodos() {

        try {
            String sql = "select a.id,p.nome as nome_paciente,m.id as idMedico, m.nome as nome_medico, m.especialidade as especialidade, a.data_consulta,"
                    + " a.situacao_pagamento  from agendamento a inner join medico m , paciente p where a.id_medico = m.id and a.id_Paciente = p.id;";

            Statement stm = con.createStatement();
            stm.execute(sql);

            ResultSet resultado = stm.getResultSet();

            ArrayList<Agendamento> consultas = new ArrayList();

            while (resultado.next()) {

                Agendamento consulta = new Agendamento();
                Paciente paciente = new Paciente();
                Medico medico = new Medico();
                consulta.setId(resultado.getLong("id"));
                medico.setId(resultado.getLong("idMedico"));
                paciente.setNome(resultado.getString("nome_paciente"));
                medico.setNome(resultado.getString("nome_medico"));
                medico.setEspecialidade(resultado.getString("especialidade"));
                consulta.setData(resultado.getDate("data_consulta"));
                consulta.setPagamento(resultado.getString("situacao_pagamento"));
                consulta.setPaciente(paciente);
                consulta.getPaciente().setNome(paciente.getNome());
                consulta.setMedico(medico);
                consulta.getMedico().setNome(medico.getNome());

                consultas.add(consulta);

            }

            return consultas;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, " Exception -> " + e);
            return null;
        }

    }

    public void atualizar(Agendamento agendamento) {
        try {
            String sql = "update agendamento set data_consulta = ?, horario = ? where id = ?";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDate(1, new Date(agendamento.getData().getTime()));
            ps.setString(2, agendamento.getHorario());
            ps.setLong(3, agendamento.getId());
            ps.execute();
            con.close();

            JOptionPane.showMessageDialog(null, "Agendamento atualizado com sucesso!");

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, " Exception -> " + e);
        }
    }

    public void atualizarResultadoPagamento(Agendamento agendamento) {
        try {
            String sql = "update agendamento set situacao_pagamento = ? where id = ?";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, "Pago");
            ps.setLong(2, agendamento.getId());
            ps.execute();
            con.close();

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, " Exception -> " + e);
        }
    }

    public void excluir(Agendamento agendamento) {
        try {
            String sql = "delete from agendamento where id = ? ";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setLong(1, agendamento.getId());
            ps.execute();
            con.close();

            JOptionPane.showMessageDialog(null, "Agendamento excluído com sucesso!");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Exception -> " + e);
        }
    }

    public Agendamento listarPorId(long id) {

        try {
            String sql = "select a.id, p.nome as nome_paciente, p.cpf as cpf_paciente, p.data_nascimento,p.sexo, m.nome as nome_medico, m.especialidade as especialidade, a.data_consulta, a.horario from agendamento a inner join"
                    + " paciente p, medico m where a.id_medico = m.id and a.id_paciente = p.id and a.id = ?";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setLong(1, id);
            ps.execute();

            ResultSet resultado = ps.getResultSet();

            while (resultado.next()) {
                Agendamento consulta = new Agendamento();
                Paciente paciente = new Paciente();
                Medico medico = new Medico();
                consulta.setId(resultado.getLong("id"));
                paciente.setNome(resultado.getString("nome_paciente"));
                paciente.setCpf(resultado.getString("cpf_paciente"));
                paciente.setDataNascimento(resultado.getDate("data_nascimento"));
                paciente.setSexo(resultado.getString("sexo"));
                medico.setNome(resultado.getString("nome_medico"));
                medico.setEspecialidade(resultado.getString("especialidade"));
                consulta.setData(resultado.getDate("data_consulta"));
                consulta.setHorario(resultado.getString("horario"));
                consulta.setPaciente(paciente);
                consulta.setMedico(medico);

                return consulta;

            }

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, " Exception -> " + e);
        }
        return null;
    }
    
      public Agendamento listarPorNome(String nome) {

        try {
            String sql = "select a.id, p.nome as nome_paciente, p.cpf as cpf_paciente, p.data_nascimento,p.sexo, m.nome as nome_medico, m.especialidade as especialidade, a.data_consulta, a.horario from agendamento a inner join"
                    + " paciente p, medico m where a.id_medico = m.id and a.id_paciente = p.id and p.nome = ?";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, nome);
            ps.execute();

            ResultSet resultado = ps.getResultSet();

            while (resultado.next()) {
                Agendamento consulta = new Agendamento();
                Paciente paciente = new Paciente();
                Medico medico = new Medico();
                consulta.setId(resultado.getLong("id"));
                paciente.setNome(resultado.getString("nome_paciente"));
                paciente.setCpf(resultado.getString("cpf_paciente"));
                paciente.setDataNascimento(resultado.getDate("data_nascimento"));
                paciente.setSexo(resultado.getString("sexo"));
                medico.setNome(resultado.getString("nome_medico"));
                medico.setEspecialidade(resultado.getString("especialidade"));
                consulta.setData(resultado.getDate("data_consulta"));
                consulta.setHorario(resultado.getString("horario"));
                consulta.setPaciente(paciente);
                consulta.setMedico(medico);

                return consulta;

            }

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, " Exception -> " + e);
        }
        return null;
    }

    public Agendamento listarPorCPF(String cpf) {

        try {
            String sql = "select a.id, p.id as id_paciente ,m.id as id_medico, p.nome as nome_paciente, "
                    + "p.cpf as cpf_paciente, p.data_nascimento,p.sexo, m.nome as nome_medico,"
                    + " m.especialidade as especialidade, a.data_consulta, a.situacao_pagamento "
                    + "from agendamento a  inner join paciente p, medico m where a.id_medico = "
                    + "m.id and a.id_paciente = p.id  and p.cpf = ?";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, cpf);
            ps.execute();

            ResultSet resultado = ps.getResultSet();

            while (resultado.next()) {
                Agendamento consulta = new Agendamento();
                Paciente paciente = new Paciente();
                Medico medico = new Medico();
                consulta.setId(resultado.getInt("id"));
                paciente.setId(resultado.getInt("id_paciente"));
                medico.setId(resultado.getInt("id_medico"));
                paciente.setNome(resultado.getString("nome_paciente"));
                paciente.setCpf(resultado.getString("cpf_paciente"));
                paciente.setDataNascimento(resultado.getDate("data_nascimento"));
                paciente.setSexo(resultado.getString("sexo"));
                medico.setNome(resultado.getString("nome_medico"));
                medico.setEspecialidade(resultado.getString("especialidade"));
                consulta.setData(resultado.getDate("data_consulta"));
                consulta.setPagamento(resultado.getString("situacao_pagamento"));
                consulta.setPaciente(paciente);
                consulta.setMedico(medico);

                return consulta;

            }

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, " Exception -> " + e);
        }
        return null;
    }

}
