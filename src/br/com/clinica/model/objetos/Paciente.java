package br.com.clinica.model.objetos;

import java.util.Date;



public class Paciente extends Pessoa {

    public Paciente() {
    }

    public Paciente(String nome, Date dataNascimento, String cpf, String sexo, Endereco endereco) {

        super(nome, dataNascimento, cpf, sexo, endereco);

    }
}
