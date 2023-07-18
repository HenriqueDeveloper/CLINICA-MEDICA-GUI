package br.com.clinica.model.objetos;

import java.util.Date;

public class Funcionario extends Pessoa {

     private Login login;

    public Funcionario() {
    }

    public Funcionario(String nome, Date dataNascimento, String cpf, String sexo, Endereco endereco, Login login) {
        super(nome, dataNascimento, cpf, sexo, endereco);
        this.login = login;

    }

    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }


}
