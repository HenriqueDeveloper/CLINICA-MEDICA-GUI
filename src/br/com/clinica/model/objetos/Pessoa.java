package br.com.clinica.model.objetos;

import java.util.Date;

public class Pessoa {

    private long id;
    private String nome;
    private Date dataNascimento;
    private String cpf;
    private String sexo;
    private String telefone;
    private Endereco endereco;

    public Pessoa() {
    }

    public Pessoa(long id, String nome, Date dataNascimento, String cpf, String sexo, String telefone, Endereco endereco) {
        this.id = id;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        this.sexo = sexo;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public Pessoa(String nome, Date dataNascimento, String cpf, String sexo, Endereco endereco) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        this.sexo = sexo;
        this.endereco = endereco;

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
       this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
    

}
