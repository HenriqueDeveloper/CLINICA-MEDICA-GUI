package br.com.clinica.model.objetos;

import java.util.Date;

public class Consulta {

    private long id;
    private String laudoMedico;
    private String prescricao;
    private Paciente paciente;
    private Medico medico;
    private Date data;

    public Consulta() {
    }

    public Consulta(String laudoMedico, String prescricao, Paciente paciente, Medico medico, Date data) {

        this.laudoMedico = laudoMedico;
        this.prescricao = prescricao;
        this.paciente = paciente;
        this.medico = medico;
        this.data = data;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPrescricao() {
        return prescricao;
    }

    public void setPrescricao(String prescricao) {
        this.prescricao = prescricao;
    }

    public String getLaudoMedico() {
        return laudoMedico;
    }

    public void setLaudoMedico(String laudoMedico) {
        this.laudoMedico = laudoMedico;
    }

}
