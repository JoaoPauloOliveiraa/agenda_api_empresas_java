package com.desafio21diasmultiplasapis.empresas.models;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="empresas")

public class Empresa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "email", length = 100, nullable = false)
    private String email;
    
    @Column(name = "nome", length = 100, nullable = false)
    private String nome;
    
    @Column(name = "razao_social", length = 150, nullable = true)
    private String razaoSocial;
    
    @Column(name = "cnpj", length = 25, nullable = false)
    private String cnpj;
    
    @Column(name = "data_criacao", length = 50, nullable = false)
    private LocalDateTime dataCriacao = LocalDateTime.now();
    
    @Column(name = "data_atualizacao", length = 50, nullable = false)
    private LocalDateTime dataAtualizacao = LocalDateTime.now();
    
    public int getId() {
        return id;
    }

    public LocalDateTime getDataAtualizacao() {
        return dataAtualizacao;
    }

    public void setDataAtualizacao(LocalDateTime dataAtualizacao) {
        this.dataAtualizacao = dataAtualizacao;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDateTime dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setId(int id) {
        this.id = id;
    }

  

    
}
