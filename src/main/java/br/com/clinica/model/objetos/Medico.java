package br.com.clinica.model.objetos;

import java.util.Date;
import java.util.Objects;

public class Medico extends Pessoa {

    private String crm;
    private String especialidade;
    private String contato;
    private Login login;

    public Medico() {
    }

    public Medico(String crm, String especialidade, String contato, String nome, Date dataNascimento, String cpf, String sexo, Endereco endereco, Login login) {
        super(nome, dataNascimento, cpf, sexo, endereco);
        this.crm = crm;
        this.especialidade = especialidade;
        this.contato = contato;
        this.login = login;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.especialidade);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Medico other = (Medico) obj;
        if (!Objects.equals(this.especialidade, other.especialidade)) {
            return false;
        }
        return true;
    }

}
